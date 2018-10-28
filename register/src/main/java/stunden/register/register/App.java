package stunden.register.register;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import org.apache.poi.hssf.util.HSSFColor.HSSFColorPredefined;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class App {

	private static String[] columns = { "Reading Date", "Name", "Email", "Coming", "Going" };
	private static List<Employee> employees = new ArrayList<Employee>();
	private static LocalDateTime dateOfBirth;
	private static LocalDateTime timeOfLeaving;

	// static {
	//
	// dateOfBirth = LocalDate.of(1992, 7, 21);
	//
	// employees.add(new Employee("Zoli Bartus", "zoli@teenor.de", dateOfBirth,
	// 1200));
	//
	// dateOfBirth = LocalDate.of(1994, 7, 21);
	// employees.add(new Employee("Jani Kovacs", "zoli@amazon.de", dateOfBirth,
	// 1800));
	//
	// dateOfBirth = LocalDate.of(1998, 7, 21);
	// employees.add(new Employee("Feri Lazar", "zoli@google.de", dateOfBirth,
	// 1500));
	//
	// }

	static DateTimeFormatter formatter;

	public static void main(String[] args) throws IOException {

		String[] options = new String[] { "Now", "Cancel" };
		int response = JOptionPane.showOptionDialog(null, "Message", "Title", JOptionPane.DEFAULT_OPTION,
				JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

		if (response == 0) {
			dateOfBirth = LocalDateTime.now();

			dateOfBirth = minuteModulator(dateOfBirth);

			formatter = DateTimeFormatter.ofPattern("HH:mm");
			// dateOfBirth.format(formatter);
		}

		timeOfLeaving = dateOfBirth.minusMinutes(492);
		employees.add(new Employee("Zoli Bartus", "zoli@teenor.de", dateOfBirth, timeOfLeaving));

		Workbook workbook = new XSSFWorkbook();
		CreationHelper createHelper = workbook.getCreationHelper();

		Sheet sheet = workbook.createSheet("List of employees");

		Font headerFont = workbook.createFont();
		headerFont.setBold(true);
		headerFont.setFontHeightInPoints((short) 14);
		headerFont.setColor(IndexedColors.BLUE.getIndex());

		CellStyle headerCellStyle = workbook.createCellStyle();
		headerCellStyle.setFont(headerFont);

		Row headerRow = sheet.createRow(0);

		for (int i = 0; i < columns.length; i++) {
			Cell cell = headerRow.createCell(i);
			cell.setCellValue(columns[i]);
			cell.setCellStyle(headerCellStyle);
		}

		CellStyle dateCellStyle = workbook.createCellStyle();
		dateCellStyle.setDataFormat(createHelper.createDataFormat().getFormat("HH:mm"));

		int rowNum = 1;

		for (Employee employee : employees) {

			Row row = sheet.createRow(rowNum++);

			row.createCell(0).setCellValue(LocalDate.now().toString());
			row.createCell(1).setCellValue(employee.getName());
			row.createCell(2).setCellValue(employee.getEmail());

			// row.createCell(2).setCellValue(employee.getDateOfBirth());

			Cell dateOfBirthCell = row.createCell(3);
			dateOfBirthCell.setCellValue(employee.getDateOfBirth().format(formatter));
			dateOfBirthCell.setCellStyle(dateCellStyle);

			Cell timeOfLeaving = row.createCell(4);
			timeOfLeaving.setCellValue(employee.getTimeOfLeaving().format(formatter));
			timeOfLeaving.setCellStyle(dateCellStyle);

			Cell deltaTime = row.createCell(5);
			LocalDateTime timeAtWork = employee.getDateOfBirth().minusHours(employee.getTimeOfLeaving().getHour())
					.minusMinutes(employee.getTimeOfLeaving().getMinute());

			if (timeAtWork.getHour() >= 8) {
				dateCellStyle.setFillForegroundColor((short) (IndexedColors.WHITE.getIndex()));
				dateCellStyle.setFillBackgroundColor((short) (IndexedColors.GREEN.getIndex()));
			} else {
				dateCellStyle.setFillBackgroundColor((short) (IndexedColors.AUTOMATIC.getIndex()));
				dateCellStyle.setFillBackgroundColor((short) (IndexedColors.RED.getIndex()));
			}

			deltaTime.setCellStyle(dateCellStyle);
			deltaTime.setCellValue(timeAtWork.format(formatter));

		}

		for (int i = 0; i < columns.length; i++) {
			sheet.autoSizeColumn(i);
		}

		// Write the output to a file
		FileOutputStream fileOut = new FileOutputStream("poi-generated-file.xlsx");
		workbook.write(fileOut);
		fileOut.close();

		// Closing the workbook
		workbook.close();

	}

	private static LocalDateTime minuteModulator(LocalDateTime localDateTime) {
		if (localDateTime.getMinute() >= 0 && localDateTime.getMinute() < 10) {
			localDateTime = LocalDateTime.of(localDateTime.getYear(), localDateTime.getMonth(),
					localDateTime.getDayOfMonth(), localDateTime.getHour(), 0);
		} else if (localDateTime.getMinute() >= 11 && localDateTime.getMinute() < 20) {
			localDateTime = LocalDateTime.of(localDateTime.getYear(), localDateTime.getMonth(),
					localDateTime.getDayOfMonth(), localDateTime.getHour(), 15);
		} else if (localDateTime.getMinute() >= 21 && localDateTime.getMinute() < 40) {
			localDateTime = LocalDateTime.of(localDateTime.getYear(), localDateTime.getMonth(),
					localDateTime.getDayOfMonth(), localDateTime.getHour(), 30);
		} else if (localDateTime.getMinute() >= 41 && localDateTime.getMinute() < 50) {
			localDateTime = LocalDateTime.of(localDateTime.getYear(), localDateTime.getMonth(),
					localDateTime.getDayOfMonth(), localDateTime.getHour(), 45);
		} else if (localDateTime.getMinute() >= 51 && localDateTime.getMinute() <= 59) {
			localDateTime = LocalDateTime.of(localDateTime.getYear(), localDateTime.getMonth(),
					localDateTime.getDayOfMonth(), localDateTime.plusHours(1).getHour(), 0);
		}

		return localDateTime;

	}
}
