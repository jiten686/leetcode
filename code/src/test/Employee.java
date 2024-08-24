package test;

public class Employee extends Person{
	
	private String empId;
	
	public Employee() {
		this.empId = "1001";
	}
	
	@Override
	public void show() {
		System.out.println("in emp show + " + this.empId);
	}
}
