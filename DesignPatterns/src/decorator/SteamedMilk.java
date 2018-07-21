package decorator;



public class SteamedMilk extends CondimentDecorator {

	
	
	public SteamedMilk(Beverage beverage) {
		this.beverage = beverage;
		 
	}

	@Override
	public String getDescription() {
		return beverage.getDescription()+", Steamed Milk";
	}

	@Override
	public double cost() {
		double cost = beverage.cost();
		if(beverage.getSize()== Size.TALL) {
			cost+=0.1;
		}else if (beverage.getSize()==Size.GRANDE) {
			cost+=0.15;
		}else if (beverage.getSize()==Size.VENTI) {
			cost+=0.20;
		}
		
		return cost;
	}

}
