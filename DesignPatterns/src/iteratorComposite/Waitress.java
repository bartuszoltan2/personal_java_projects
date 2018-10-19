package iteratorComposite;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {

	Menu pancakeHouseMenu;
	Menu dinerMenu;
	Menu cafeMenu;
	ArrayList<Menu> menus;
	
	MenuComponent allMenus;

	// public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
	// super();
	// this.pancakeHouseMenu = pancakeHouseMenu;
	// this.dinerMenu = dinerMenu;
	// this.cafeMenu = cafeMenu;
	// }

	public Waitress(MenuComponent allMenus) {
		super();
		this.allMenus = allMenus;
	}

	public Waitress(ArrayList<Menu> menus) {
		super();
		this.menus = menus;
	}

//	public Waitress(Menu... menues) {
//		super();
//		for (Menu menu : menues) {
//			if (menu instanceof PancakeHouseMenu) {
//				pancakeHouseMenu = menu;
//			} else if (menu instanceof DinerMenu) {
//				dinerMenu = menu;
//			} else if (menu instanceof CafeMenu) {
//				cafeMenu = menu;
//			}
//		}
//	}

	public void printMenu() {

//		if (pancakeHouseMenu != null) {
//			Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
//			System.out.println("Menu\n----\nBreakfast");
//			printMenu(pancakeIterator);
//		}
//
//		if (dinerMenu != null) {
//			Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
//			System.out.println("\nLunch");
//			printMenu(dinerIterator);
//		}
//
//		if (cafeMenu != null) {
//			Iterator<MenuItem> cafeIterator = cafeMenu.createIterator();
//			System.out.println("\nDinner");
//			printMenu(cafeIterator);
//		}
		
		
//		Iterator<Menu> menuIterator= menus.iterator();
//		while(menuIterator.hasNext()) {
//			Menu menu = menuIterator.next();
//			printMenu(menu.createIterator());
//		}
		
		allMenus.print();
		
		
	}

	private void printMenu(Iterator<MenuItem> iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());

		}
	}
	
	public void printVegetarianMenu() {
		Iterator<MenuComponent> iterator = allMenus.createIterator();
		
		System.out.println("\nVEGETARIAN MENU\n----");
		while(iterator.hasNext()) {
			MenuComponent menuComponent = iterator.next();
			try {
				if(menuComponent.isVegetarian()) {
					menuComponent.print();
				}
			}
			catch(UnsupportedOperationException e) {
			}
		}
	}
}
