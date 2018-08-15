package factory.ingredients;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		return new MozarellaCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Spinach(), new EggPlant(), new BlackOlives()};
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {

		return new SlicedPepperoni();
	}

	@Override
	public Clams createClams() {

		return new FrozenClam();
	}

}
