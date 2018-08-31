package command;

public class Light {
	
	
	
	public Light() {
		super();
	}

	public Light(String room) {
		super();
		this.room = room;
	}

	String room;

	public void on() {
		System.out.println(room+" light is on.");
		
	}

	public void off() {
		System.out.println(room+" light is off.");
		
	}

}
