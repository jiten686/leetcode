package vendingMachine.machine;

import vendingMachine.inventory.Inventory;
import vendingMachine.inventory.Product;
import vendingMachine.states.CoinInsertedState;
import vendingMachine.states.DispenserState;
import vendingMachine.states.NoCoinInsertedState;
import vendingMachine.states.State;

public class VendingMachine {

	private NoCoinInsertedState noCoinInsertedState;
	private CoinInsertedState coinInsertedState;
	private DispenserState dispenserState;
	private State currState;
	private Inventory inventory;
	private double amount;
	private static final int AISLE_COUNT = 2;

	public VendingMachine() {
		this.noCoinInsertedState = new NoCoinInsertedState(this);
		this.coinInsertedState = new CoinInsertedState(this);
		this.dispenserState = new DispenserState(this);
		this.currState = this.noCoinInsertedState;
		this.amount = 0.0;
		this.inventory = new Inventory(AISLE_COUNT);
	}

	public NoCoinInsertedState getNoCoinInsertedState() {
		return noCoinInsertedState;
	}

	public void setNoCoinInsertedState(NoCoinInsertedState noCoinInsertedState) {
		this.noCoinInsertedState = noCoinInsertedState;
	}

	public CoinInsertedState getCoinInsertedState() {
		return coinInsertedState;
	}

	public void setCoinInsertedState(CoinInsertedState coinInsertedState) {
		this.coinInsertedState = coinInsertedState;
	}

	public DispenserState getDispenserState() {
		return dispenserState;
	}

	public void setDispenserState(DispenserState dispenserState) {
		this.dispenserState = dispenserState;
	}

	public State getCurrState() {
		return currState;
	}

	public void setCurrState(State currState) {
		this.currState = currState;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public boolean hasSufficientAmount(double price) {
		return this.amount >= price;
	}

	public void insertCoin(double amount) {
		this.currState.insertCoin(amount);
		System.out.println(amount + " is inserted");
	}

	public void pressButton(int aisleNumber) {
		this.currState.pressButton(aisleNumber);
		this.currState.dispenser(aisleNumber);
	}

	public void addProduct(Product product) {
		try {
			this.getInventory().addProduct(product);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
