package factory;

import factory.ingredients.PizzaIngredientFactory;

public class ChicagoStyleCheesePizza extends CheesePizza {

	public ChicagoStyleCheesePizza(PizzaIngredientFactory ingredientFactory) {
		super(ingredientFactory);
		setName("Chicago Style Sauce and Cheese Pizza");
	}

	public void cut() {
		System.out.println("Cutting the pizza into square pieces");
	}
	
	
}
