package designPattern;

public final class immutableClass {

	private final String name;
	private final int number;

//	private final Address address; // Assume Address is a mutable class

	public immutableClass(String name, int number, Address address) {
		this.name = name;
		this.number = number;

//		// Defensive copy to ensure immutability
//		this.address = new Address(address);
	}

	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}

//	public Address getAddress() {
//		// Return a defensive copy to prevent modification of the original object
//		return new Address(address);
//	}

}

class Address {
	private String city;
	private String state;

	public Address(String city, String state) {
		this.city = city;
		this.state = state;
	}

	// Copy constructor for defensive copying
	public Address(Address address) {
		this(address.getCity(), address.getState());
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}
}
