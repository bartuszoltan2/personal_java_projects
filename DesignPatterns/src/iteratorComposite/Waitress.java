package iteratorComposite;

import java.util.Iterator;

public class Waitress {
	
	PancakeHouseMenu pancakeHouseMenu;
	DinerMenu dinerMenu;
	
	public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
		super();
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}
	
	
	public Waitress(DinerMenu dinerMenu) {
		super();
		
		this.dinerMenu = dinerMenu;
	}

	
	public void printMenu() {
		Iterator pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator dinerIterator = dinerMenu.createIterator();
		
		System.out.println("Menu\n----\nBreakfast");
		printMenu(pancakeIterator);
		System.out.println("\nLunch");
		printMenu(dinerIterator);
	}
	
	private void printMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem) iterator.next();
			System.out.print(menuItem.getName()+", ");
			System.out.print(menuItem.getPrice()+" -- ");
			System.out.println(menuItem.getDescription());
			
		}
	}
}
