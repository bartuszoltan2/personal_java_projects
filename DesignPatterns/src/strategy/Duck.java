package strategy;

public abstract class Duck {
	
	FlyBehavior flyBehavior;
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	QuackBehavior quackBehavior;
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	
	public Duck() {
		
	}

	public abstract void display();
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void swim() {
		System.out.println("All ducks swim, even decoy!");
		
	}
	
}
