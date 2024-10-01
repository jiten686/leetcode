package designPattern.decorativePattern;

public class PopularBurger extends Burger {

	@Override
	public String getDiscription() {
		return "Popular Burger";

	}

	@Override
	public double getCost() {
		return 150.00;
	}

}
