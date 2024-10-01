package vendingMachine.states;

import vendingMachine.inventory.Inventory;
import vendingMachine.inventory.Product;
import vendingMachine.machine.VendingMachine;

public class DispenserState implements State {

	VendingMachine vendingMachine;

	public DispenserState(VendingMachine vendingMachine) {
		this.vendingMachine = vendingMachine;
	}

	@Override
	public void insertCoin(double amount) {
		 throw new IllegalStateException("Product getting dispensed");

	}

	@Override
	public void pressButton(int aisleNumber) {
		 throw new IllegalStateException("Product getting dispensed");

	}

	@Override
	public void dispenser(int aisleNumber) {
		Inventory inventory = this.vendingMachine.getInventory();
		Product product= inventory.getAisleProductMap().get(aisleNumber);
		inventory.deductProductCount(aisleNumber);
		double change = this.vendingMachine.getAmount() - product.getPrice();
		this.vendingMachine.setAmount(0);
		this.vendingMachine.setCurrState(this.vendingMachine.getNoCoinInsertedState());
		
		System.out.println("Product : "+product.getName()+" get dispensed..Collect "+change+" change");
	}

}
