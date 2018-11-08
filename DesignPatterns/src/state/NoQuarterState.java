package state;

public class NoQuarterState implements State {

	@Override
	public String toString() {
		return "NoQuarterState []";
	}

	public NoQuarterState(GumballMachine gumbalMachine) {
		super();
		this.gumbalMachine = gumbalMachine;
	}

	GumballMachine gumbalMachine;

	@Override
	public void insertQuarter() {
		System.out.println("You inserted a quarter");
		gumbalMachine.setState(gumbalMachine.getHasQuarterState());

	}

	@Override
	public void ejectQuarter() {
		System.out.println("You haven't inserted a quarter");
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned, but there s no quarter");
	}

	@Override
	public void disense() {
		System.out.println("You need to pay first");
	}

}
