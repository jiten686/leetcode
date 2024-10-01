package designPattern.proxy;

public class Tester {

	public static void main(String[] args) {

		try {

			IEmployeeDao empDaoObj = new EmployeeProxy();
			empDaoObj.addEmployee(new Employee(), "ADMIN");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
