package state.proxy;

import state.GumballMachine;

public class GumballMonitor {

	public GumballMonitor(GumballMachine machine) {
		super();
		this.machine = machine;
	}

	GumballMachine machine;
	
	public void report() {
		System.out.println("Gumball Machine: "+machine.getLocation());
		System.out.println("Current inventory: "+ machine.getCount()+" gumballs");
		System.out.println("Current state: "+machine.getState());
	}
	
}
