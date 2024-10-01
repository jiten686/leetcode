package designPattern.decorativePattern;

public class ExtraMayoBurger extends DecorativeBurger {

	Burger burger;

	public ExtraMayoBurger(Burger burger) {
		this.burger = burger;
	}

	@Override
	public String getDiscription() {
		return this.burger.getDiscription() + " with extra mayo.";
	}

	@Override
	public double getCost() {
		return this.burger.getCost() + 10.00;
	}

}
