package looselyCoupledOODesigns;

public class PizzaTestDrive {

	public static void main(String[] args) {

		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagostore = new ChicagoPizzaStore();

		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName()+"\n");

		pizza = chicagostore.orderPizza("cheese");
		System.out.println("Joel ordered a " +pizza.getName()+"\n");
	}
}