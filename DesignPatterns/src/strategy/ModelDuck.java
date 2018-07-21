package strategy;

public class ModelDuck extends Duck {

	public ModelDuck() {
		setQuackBehavior(new Quack());
		setFlyBehavior(new FlyNoWay());
	}
	
	
	
	@Override
	public void display() {
		System.out.println("I am a model duck.");		
	}

}
