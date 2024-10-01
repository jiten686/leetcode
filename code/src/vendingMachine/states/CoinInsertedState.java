package vendingMachine.states;

import vendingMachine.inventory.Inventory;
import vendingMachine.inventory.Product;
import vendingMachine.machine.VendingMachine;

public class CoinInsertedState implements State {

	VendingMachine vendingMachine;

	public CoinInsertedState(VendingMachine vendingMachine) {
		this.vendingMachine = vendingMachine;
	}

	@Override
	public void insertCoin(double amount) {
		this.vendingMachine.setAmount(this.vendingMachine.getAmount()+amount);

	}

	@Override
	public void pressButton(int aisleNumber) {
		 Inventory inventory = this.vendingMachine.getInventory();
		 Product product = inventory.getAisleProductMap().get(aisleNumber);
		 // check the amount
		 if(!this.vendingMachine.hasSufficientAmount(product.getPrice())) {
			 throw new IllegalStateException("Insufficient amount");
		 }
		 
		 if(!inventory.checkIfProductAvailable(product.getId())) {
			 throw new IllegalStateException("Product is not available");
		 }
		 
		 this.vendingMachine.setCurrState(this.vendingMachine.getDispenserState());
		 
	}

	@Override
	public void dispenser(int aisleNumber) {
		 throw new IllegalStateException("Product is not selected");

	}

}
