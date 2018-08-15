package factory;

import factory.ingredients.ChicagoPizzaIngredientFactory;
import factory.ingredients.PizzaIngredientFactory;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

		if (item.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago Style Cheese Pizza");
		}
		if (item.equals("veggie")) {
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("Chicago Style Veggie Pizza");
		}
		if (item.equals("clam")) {
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("Chicago Style Clam Pizza");
		}
		if (item.equals("pepperoni")) {
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("Chicago Style Pepperoni Pizza");
		}

		return pizza;
	}

	// @Override
	// protected Pizza createPizza(String item) {
	// if (item.equals("cheese")) {
	// return new ChicagoStyleCheesePizza();
	// } else if (item.equals("veggie")) {
	// return new ChicagoStyleVeggiePizza();
	// } else if (item.equals("pepperoni")) {
	// return new ChicagoStylePepperoniPizza();
	// } else {
	// return null;
	// }
	// }

}
