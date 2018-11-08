package state;

public class SoldState implements State {
	@Override
	public String toString() {
		return "SoldState [gumbalMachine=" + gumbalMachine + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public SoldState(GumballMachine gumbalMachine) {
		super();
		this.gumbalMachine = gumbalMachine;
	}

	GumballMachine gumbalMachine;

	@Override
	public void insertQuarter() {
		System.out.println("Please wait, weare already giving you a gumball");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Sorry you already turned the crank");
	}

	@Override
	public void turnCrank() {
		System.out.println("Turning twice doesn't get yu another gumball");
	}

	@Override
	public void disense() {
		gumbalMachine.releaseBall();
		if (gumbalMachine.getCount() > 0) {
			gumbalMachine.setState(gumbalMachine.getNoQuarterState());
		}else {
			System.out.println("OOps, out of gumballs!");
			gumbalMachine.setState(gumbalMachine.getSoldOutState());
		}
	}

}
