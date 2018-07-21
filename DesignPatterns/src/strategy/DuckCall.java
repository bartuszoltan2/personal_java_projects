package strategy;

public class DuckCall implements FlyBehavior, QuackBehavior {

	
	
		FlyBehavior flyBehavior= new FlyNoWay();
		QuackBehavior quackBehavior= new Quack();
	
	
	
	@Override
	public void quack() {
		quackBehavior.quack();

	}

	@Override
	public void fly() {
		flyBehavior.fly();

	}

}
