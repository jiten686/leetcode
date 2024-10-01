package designPattern.decorativePattern;

public class Tester {

	public static void main(String[] args) {
		Burger popularBurger = new PopularBurger();

		popularBurger = new ExtraCheeseBurger(popularBurger);
		popularBurger = new ExtraMayoBurger(popularBurger);
		

		System.out.println(popularBurger.getDiscription());
		System.out.println(popularBurger.getCost());

	}

}
