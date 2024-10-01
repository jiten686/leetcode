package designPattern.proxy;

public interface IEmployeeDao {
	void addEmployee(Employee emp, String user) throws Exception;

	void removeEmployee(int empId, String user) throws Exception;

	void getEmployee(int empId, String user) throws Exception;
}
