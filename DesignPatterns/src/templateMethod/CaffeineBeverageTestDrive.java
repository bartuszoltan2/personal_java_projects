package templateMethod;

public class CaffeineBeverageTestDrive {

	public static void main(String[] args) {

		Tea mytea = new Tea();
		mytea.prepareRecipe();

		System.out.println("\n");
		
		Coffee myCoffee = new Coffee();
		myCoffee.prepareRecipe();

	}

}
