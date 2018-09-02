package command;

public class TV {
	
	
	
	public TV() {
		super();
	}

	public TV(String room) {
		super();
		this.room = room;
	}

	String room;

	public void on() {
		System.out.println(room+" tv is on.");
		
	}

	public void off() {
		System.out.println(room+" tv is off.");
		
	}

}
