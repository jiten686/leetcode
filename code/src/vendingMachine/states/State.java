package vendingMachine.states;

public interface State {
	
	/*
	 * NoCoinInsertedState -> CoinInsertedState -> DispenserState ->NoCoinInsertedState
	 */
	
	void insertCoin(double amount);
	void pressButton(int aisleNumber);
	void dispenser(int aisleNumber);

}
