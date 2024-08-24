package test;

public class Person {
	
	private String name;
	private int age;
	
	

	public Person() {
		this.name = "Human";
		this.age = 45;
	}



	public void show() {
		System.out.println(" in person show : "+this.name);
	}

}
