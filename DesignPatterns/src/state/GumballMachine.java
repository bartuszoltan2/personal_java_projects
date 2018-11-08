package state;

import java.time.LocalDate;

public class GumballMachine {
	//
	// final static int SOLD_OUT = 0;
	// final static int NO_QUARTER = 1;
	// final static int HAS_QUARTER = 2;
	// final static int SOLD = 4;

	// int state = SOLD_OUT;

	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	private State winnerState;

	private State state;
	private int count = 0;
	
	private String location;
	

	// public GumballMachine(int count) {
	// super();
	// this.count = count;
	// if (count > 0) {
	// setState(NO_QUARTER);
	// }
	// }

	public GumballMachine(String location, int numberGumballs) {
		this.location = location;
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		setWinnerState(new WinnerState(this));

		this.count = numberGumballs;
		if (numberGumballs > 0) {
			state = noQuarterState;
		} else {
			state = soldOutState;
		}
	}

	public void insertQuarter() {
		// if (getState() == HAS_QUARTER) {
		// System.out.println("You can't insert another quarter");
		// } else if (getState() == NO_QUARTER) {
		// setState(HAS_QUARTER);
		// System.out.println("You inserted a quarter");
		// } else if (getState() == SOLD_OUT) {
		// System.out.println("You can't insert a quarter, the machine is sold out");
		// } else if (getState() == SOLD) {
		// System.out.println("Please wait, we are already giving you a gumball");
		// }

		state.insertQuarter();
	}

	public void ejectQuarter() {
		// if (getState() == HAS_QUARTER) {
		// System.out.println("Quarter returned");
		// setState(NO_QUARTER);
		// } else if (getState() == NO_QUARTER) {
		// System.out.println("You haven't inserted a quarter");
		// } else if (getState() == SOLD) {
		// System.out.println("sorry you already turned te crank");
		// } else if (getState() == SOLD_OUT) {
		// System.out.println("you can't eject, yu haven't inserted a quarter yet");
		// }

		state.ejectQuarter();
	}

	public void turnCrank() {
		// if (getState() == SOLD) {
		// System.out.println("Turning twice doesn't get you another gumball");
		// } else if (getState() == NO_QUARTER) {
		// System.out.println("You turned but there s no quarter");
		// } else if (getState() == SOLD_OUT) {
		// System.out.println("You turned but there are no gumballs");
		// } else if (getState() == HAS_QUARTER) {
		// System.out.println("you turned..");
		// setState(SOLD);
		// dispense();
		// }

		state.turnCrank();
		state.disense();
	}

	public void dispense() {
		// if (getState() == SOLD) {
		// System.out.println("A gumball comes rolling out the slot");
		// count = count - 1;
		// if (count == 0) {
		// System.out.println("Oops, out of gumballs");
		// setState(SOLD_OUT);
		// } else {
		// setState(NO_QUARTER);
		// }
		// } else if (getState() == NO_QUARTER) {
		// System.out.println("You need to pay first");
		// } else if (getState() == SOLD_OUT) {
		// System.out.println("No gumball dispensed");
		// } else if (getState() == HAS_QUARTER) {
		// System.out.println("No gumball dispensed");
		// }

		state.disense();
	}

	public void releaseBall() {
		System.out.println("A gumball comes rolling out the slot..");
		if (getCount() != 0) {
			setCount(getCount() - 1);
		}
	}

	@Override
	public String toString() {

		int date = LocalDate.now().getYear();

		return "\nMighty Gumball, Inc " //
				+ "\nJava-enabled Standing Gumball Modell #" //
				+ date + "\nInventory: " //
				+ getCount() + " gumballs\n" //
				+ "Machine is waiting for quarter\n";

		// return "GumballMachine [count=" + count + "]";
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public void setSoldOutState(State soldOutState) {
		this.soldOutState = soldOutState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public void setNoQuarterState(State noQuarterState) {
		this.noQuarterState = noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public void setHasQuarterState(State hasQuarterState) {
		this.hasQuarterState = hasQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	public void setSoldState(State soldState) {
		this.soldState = soldState;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public State getWinnerState() {
		return winnerState;
	}

	public void setWinnerState(State winnerState) {
		this.winnerState = winnerState;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
