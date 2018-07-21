package decorator;

public abstract class Beverage {

	public enum Size {TALL, GRANDE, VENTI};
	private Size size = Size.TALL;
	
	private String description = "Unknown Beverage";

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public abstract double cost();
	public Size getSize() {
		return size;
	}
	public void setSize(Size size) {
		this.size = size;
	}

}
