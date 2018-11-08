package state;

public class SoldOutState implements State {
	GumballMachine gumballMachine;
	

	public SoldOutState(GumballMachine gumballMachine) {
		super();
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You can't insert a quarter, the machine is sold out");

	}

	@Override
	public void ejectQuarter() {
		System.out.println("you can't eject, you haven't inserted a quarter yet");

	}

	@Override
	public void turnCrank() {
		System.out.println("You turned but there are no gumballs");

	}

	@Override
	public void disense() {
		System.out.println("No gumball dispensed");

	}
	
	@Override
	public String toString() {
		
		return "sold out";
	}

}
