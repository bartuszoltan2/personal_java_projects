package command;

public interface Command {
	public void execute();

	static public void undo() {
		
	};

}
