package vendingMachine;

import vendingMachine.inventory.Product;
import vendingMachine.machine.VendingMachine;

public class Tester {

	public static void main(String[] args) {
		Product p1 = new Product(1, "Coke", 10.00);
		Product p2 = new Product(2, "Chips", 15.00);
		
		VendingMachine machine = new VendingMachine();
		machine.addProduct(p1);
		machine.addProduct(p2);
		
		machine.insertCoin(20.00);
		machine.pressButton(1);
		
		machine.insertCoin(30.00);
		machine.pressButton(2);
	}

}
