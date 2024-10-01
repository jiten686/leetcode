package designPattern.decorativePattern;

public class ExtraCheeseBurger extends DecorativeBurger {

	Burger burger;

	public ExtraCheeseBurger(Burger burger) {
		this.burger = burger;
	}

	@Override
	public String getDiscription() {
		return this.burger.getDiscription() + " with extra cheese.";
	}

	@Override
	public double getCost() {
		return this.burger.getCost() + 20.00;
	}

}
