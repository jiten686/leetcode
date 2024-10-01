package designPattern.builderPattern;

public class Employee {

	private int empId;
	private String name;
	private boolean isManager;

	public Employee(EmpBuilder builder) {
		this.empId = builder.empId;
		this.name = builder.name;
		this.isManager = builder.isManager;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isManager() {
		return isManager;
	}

	public void setManager(boolean isManager) {
		this.isManager = isManager;
	}

	public static class EmpBuilder {

		private int empId;
		private String name;
		private boolean isManager;

		public EmpBuilder setEmpId(int Id) {
			this.empId = Id;
			return this;
		}

		public EmpBuilder setName(String name) {
			this.name = name;
			return this;
		}

		public EmpBuilder isManager(boolean isManager) {
			this.isManager = isManager;
			return this;
		}

		public Employee build() {
			return new Employee(this);
		}

	}

}
