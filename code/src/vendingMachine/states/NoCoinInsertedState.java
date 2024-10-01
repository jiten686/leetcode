package vendingMachine.states;

import vendingMachine.machine.VendingMachine;

public class NoCoinInsertedState implements State{

	VendingMachine vendingMachine;
	
	public NoCoinInsertedState(VendingMachine vendingMachine) {
		this.vendingMachine = vendingMachine;
	}

	@Override
	public void insertCoin(double amount) {
		this.vendingMachine.setAmount(amount);
		this.vendingMachine.setCurrState(this.vendingMachine.getCoinInsertedState());
		
	}

	@Override
	public void pressButton(int aisleNumber) {
		throw new IllegalStateException("Insert a coin");
		
	}

	@Override
	public void dispenser(int aisleNumber) {
		throw new IllegalStateException("Insert a coin");
		
	}

}
