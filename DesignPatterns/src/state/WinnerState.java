package state;

public class WinnerState implements State {
	public WinnerState(GumballMachine gumballMachine) {
		super();
		this.gumballMachine = gumballMachine;
	}

	GumballMachine gumballMachine;

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
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() == 0) {
			gumballMachine.setState(gumballMachine.getSoldOutState());
		} else {
			gumballMachine.releaseBall();
			System.out.println("YOU ARE A WINNER! You got two gumballs for yur quarter");
			if (gumballMachine.getCount() > 0) {
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			} else {
				System.out.println("Oops out of gumballs");
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		}
	}

}
