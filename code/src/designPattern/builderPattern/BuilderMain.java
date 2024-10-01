package designPattern.builderPattern;

public class BuilderMain {

	public static void main(String[] args) {
		
		Employee emp = new Employee.EmpBuilder()
				.setEmpId(1)
				.setName("John")
				.isManager(true)
				.build();
		

		System.out.println(emp.getEmpId());
		System.out.println(emp.getName());
		System.out.println(emp.isManager());
		
		
	}

}
