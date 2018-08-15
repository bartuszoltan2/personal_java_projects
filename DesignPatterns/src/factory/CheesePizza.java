package factory;

import factory.ingredients.PizzaIngredientFactory;

public class CheesePizza extends Pizza {

	PizzaIngredientFactory ingredientFactory;

	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;

	}

	@Override
	void prepare() {
		System.out.println("Preparing "+ this.getName());
		dough=ingredientFactory.createDough();
		sauce=ingredientFactory.createSauce();
		cheese=ingredientFactory.createCheese();
	}

}
