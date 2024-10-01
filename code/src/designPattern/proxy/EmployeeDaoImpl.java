package designPattern.proxy;

public class EmployeeDaoImpl implements IEmployeeDao {

	@Override
	public void addEmployee(Employee emp, String user) throws Exception {
		System.out.println("New Emp created");

	}

	@Override
	public void removeEmployee(int empId, String user) throws Exception {
		System.out.println("Remove emp with an ID " + empId);

	}

	@Override
	public void getEmployee(int empId, String user) throws Exception {
		System.out.println("fetching employee data with ID " + empId);

	}

}
