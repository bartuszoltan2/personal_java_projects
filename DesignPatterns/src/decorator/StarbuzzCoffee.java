package decorator;

import java.text.DecimalFormat;

import decorator.Beverage.Size;

public class StarbuzzCoffee {

	
	public static void main(String[] args) {
		DecimalFormat f = new DecimalFormat("##.00");
		
		Beverage beverage= new Espresso();
		System.out.println(beverage.getDescription()+" $"+(f.format(beverage.cost())));
		
		Beverage beverage2 = new DarkRoast();
		beverage2.setSize(Size.GRANDE);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		

		System.out.println(beverage2.getDescription()+" $"+(f.format(beverage2.cost())));
		
		
		Beverage beverage3 = new HouseBlend();
		beverage3.setSize(Size.VENTI);
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription()+" $"+(f.format(beverage3.cost())));
		
	}

}
