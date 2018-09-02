package command;

public class Stereo {
	
	
	
	public Stereo() {
		super();
	}

	public Stereo(String room) {
		super();
		this.room = room;
	}

	String room;

	public void on() {
		System.out.println(room+" stereo is on.");
		
	}

	public void off() {
		System.out.println(room+" stereo is off.");
		
	}

}
