package factory;

import java.util.Optional;

import factory.ingredients.Cheese;
import factory.ingredients.Clams;
import factory.ingredients.Dough;
import factory.ingredients.Pepperoni;
import factory.ingredients.Sauce;
import factory.ingredients.Veggies;

public abstract class Pizza {
	private String name;
	// String dough;
	// String sauce;
	// ArrayList<String> toppings = new ArrayList<String>();

	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;

	abstract void prepare();
	// {
	//
	// System.out.println("Preparing " + getName());
	// System.out.println("Tossing dough...");
	// System.out.println("Adding sauce...");
	// System.out.println("Adding toppings: ");
	// for (String topping : toppings) {
	// System.out.println(" " + topping);
	// }
	//
	// }

	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	public void cut() {
		if(this.getName().toLowerCase().contains("chicago")) {
			System.out.println("Cutting the pizza into square pieces");
		}
		else {
		System.out.println("Cutting the pizza into 8 pieces");
		}
	}

	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	String text = "";

	public String toString() {
		Optional<Dough> optDough = Optional.ofNullable(this.dough);
		Optional<Sauce> optSauce = Optional.ofNullable(this.sauce);
		Optional<Cheese> optCheese = Optional.ofNullable(this.cheese);
		Optional<Veggies[]> optVeggies = Optional.ofNullable(this.veggies);
		Optional<Pepperoni> optPepperoni = Optional.ofNullable(this.pepperoni);
		Optional<Clams> optClam = Optional.ofNullable(this.clam);

		text=this.getName()+" ";
		
		optDough.ifPresent(name -> text += " " + name.getClass().getSimpleName());
		optSauce.ifPresent(name -> text += " " + name.getClass().getSimpleName());
		optCheese.ifPresent(name -> text += " " + name.getClass().getSimpleName());
		optVeggies.ifPresent(name -> text += " " + name.getClass().getSimpleName());
		optPepperoni.ifPresent(name -> text += " " + name.getClass().getSimpleName());
		optClam.ifPresent(name -> text += " " + name.getClass().getSimpleName());

		return text;

	}

}
