package adapterAndFacade;

public class Amplifier {

	public void on() {
		System.out.println("amplifier on");
	}

	public void setDvd(DvdPlayer dvd) {
		System.out.println("amplifier setting " + dvd.getClass().getSimpleName());
	}

	public void setSurround() {
		System.out.println("amplifier surround sund on");
	}

	public void setVolume(int i) {
		System.out.println("amplifier setting volume to " + i);
	}

	public void off() {
		System.out.println("amplifier off");
	}

}
