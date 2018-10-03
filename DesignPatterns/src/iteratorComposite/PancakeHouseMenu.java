package iteratorComposite;

import java.util.ArrayList;
import java.util.Iterator;


public class PancakeHouseMenu implements Menu {
	ArrayList<MenuItem> menuItems;

	public PancakeHouseMenu() {
		menuItems = new ArrayList<MenuItem>();

		addItem("K&B's Pancake Breakfast", "pancakes with scrambled egg and toasts", true, 2.99);

		addItem("Regular Pancake Breakfast", "pancakes with fried egg and sausage", false, 2.99);

		addItem("Blueberry Pancake", "pancakesmade with fresh blueberries", true, 3.49);

		addItem("Waffles", "Waffles with your choice", true, 3.59);
	}

	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}

	// public ArrayList<MenuItem> getMenuItems() {
	// return menuItems;
	// }

	public Iterator createIterator() {
//		return  new PancakeHouseIterator(menuItems);
		return menuItems.iterator();
	}
}