package designPattern.proxy;

public class EmployeeProxy implements IEmployeeDao {

	IEmployeeDao employeeDao;

	public EmployeeProxy() {
		this.employeeDao = new EmployeeDaoImpl();
	}

	@Override
	public void addEmployee(Employee emp, String user) throws Exception {
		if (user.equals("ADMIN")) {
			this.employeeDao.addEmployee(emp, user);
			return;
		}

		throw new Exception("Access Denied");

	}

	@Override
	public void removeEmployee(int empId, String user) throws Exception {
		if (user.equals("ADMIN")) {
			this.employeeDao.removeEmployee(empId, user);
			return;
		}

		throw new Exception("Access Denied");

	}

	@Override
	public void getEmployee(int empId, String user) throws Exception {
		if (user.equals("USER")) {
			this.employeeDao.getEmployee(empId, user);
			return;
		}

		throw new Exception("Access Denied");

	}

}
