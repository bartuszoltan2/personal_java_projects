package iteratorComposite;

public class MenuTestDrive {

	public static void main(String[] args) {

//		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
//		DinerMenu dinerMenu = new DinerMenu();
//		CafeMenu cafeMenu= new CafeMenu();
		
		
		Waitress waitress = new Waitress(new PancakeHouseMenu(), new DinerMenu(), new CafeMenu());
		
		
		waitress.printMenu();
		
		
		
		
	}

}
