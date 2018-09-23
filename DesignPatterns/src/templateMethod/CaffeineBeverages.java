package templateMethod;

public abstract class CaffeineBeverages {

	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCondiments()) {
			addCondiments();
		}
	}

	private void pourInCup() {
		System.out.println("Pouring into cup");
	}

	private void boilWater() {
		System.out.println("Boiling water");
	}

	abstract void brew();

	abstract void addCondiments();

	boolean customerWantsCondiments() {
		return true;
	}

}
