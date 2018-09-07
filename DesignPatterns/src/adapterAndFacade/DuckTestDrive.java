package adapterAndFacade;

public class DuckTestDrive {

	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}

	static void testTurkey(Turkey turkey) {
		turkey.gobble();
		turkey.fly();

	}

	public static void main(String[] args) {

		MallardDuck mallardDuck = new MallardDuck();
		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		
		Turkey duckAdapter = new DuckAdapter(mallardDuck);
		

		System.out.println("The turkey says...");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("\nThe Duck says..");
		testDuck(mallardDuck);

		
		System.out.println("\nThe TurkeyAdapter says..");
		testDuck(turkeyAdapter);
		
		System.out.println("\nThe DuckAdapter says..");
		testTurkey(duckAdapter);
		
	}
}
