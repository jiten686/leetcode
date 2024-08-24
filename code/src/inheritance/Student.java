package inheritance;

public class Student extends Person {
//	public Student(String firstName, String lastName) {
//		super(firstName, lastName);
//		
//	}
	private String gradyear;
	private int fees;
	private int marks;
	private String course;
	
	public Student (String firstName, String lastName, String grad, int fees, int marks, String course) {
		super(firstName, lastName);
		this.course = course;
		this.fees = fees;
		this.marks = marks;
		this.gradyear = grad;
	}
	
	@Override
	public String toString() {
		return super.toString() + " " + gradyear + " " + fees + " " + marks + " " + course;
	}

	
	
}
