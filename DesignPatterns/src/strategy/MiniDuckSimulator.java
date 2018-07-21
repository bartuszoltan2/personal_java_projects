package strategy;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		
		
		Duck  mallard = new MallardDuck();
		
		mallard.performQuack();
		mallard.performFly();
		mallard.display();
		
		
		System.out.println();
		
		
		Duck model = new ModelDuck();
		
		model.performQuack();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
		model.display();
		
		System.out.println();

		DuckCall duckCall = new DuckCall();
		duckCall.fly();
		duckCall.quack();

	}

}
