package command;

public class GarageDoorCloseCommand implements Command {
	GarageDoor garageDoor;

	public GarageDoorCloseCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		garageDoor.close();

	}

	public void undo() {
		garageDoor.open();
	}

}
