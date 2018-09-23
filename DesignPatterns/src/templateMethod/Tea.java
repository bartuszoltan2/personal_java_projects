package templateMethod;

public class Tea extends CaffeineBeverages {

	@Override
	void brew() {
		System.out.println("Steeping the tea");
	}

	@Override
	void addCondiments() {
		System.out.println("Adding Lemon");
	}

	@Override
	boolean customerWantsCondiments() {
		return false;
	}

}
