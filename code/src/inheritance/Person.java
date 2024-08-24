package inheritance;

import java.io.Serializable;

public class Person implements Serializable{
	private String firstName;
	private String lastName;
	
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		return firstName + "  " + lastName + " ";
	}
}
