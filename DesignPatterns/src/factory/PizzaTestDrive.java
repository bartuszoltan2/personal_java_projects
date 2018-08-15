package factory;

public class PizzaTestDrive {

	public static void main(String[] args) {

		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();

		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.toString()+"\n");

		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a " +pizza.toString()+"\n");
	}
}