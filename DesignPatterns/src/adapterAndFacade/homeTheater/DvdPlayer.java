package adapterAndFacade.homeTheater;

public class DvdPlayer {

	static String movie;

	public void on() {
		System.out.println("dvd player on");
	}

	public void play(String movie) {
		DvdPlayer.movie = movie;
		System.out.println("dvd player playing " + DvdPlayer.movie);
	}

	public void stop() {

		System.out.println("dvd player stopped " + movie);

	}

	public void eject() {
		System.out.println("dvd player eject");
	}

	public void off() {
		System.out.println("dvd player off");
	}

}
