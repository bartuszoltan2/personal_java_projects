package state.proxy;

import state.GumballMachine;

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		int count = 10;

		if (args.length < 2) {
			System.out.println("Gumball Machine");
		}
		
		
//		count = Integer.parseInt(args[1]);
		GumballMachine gumballMachine=new GumballMachine("Boston", count);
		
		GumballMonitor monitor= new GumballMonitor(gumballMachine);
		
		monitor.report();
	}

}
