package example1;

public abstract class Ems {
	
	public abstract void addEmployee();
	
	/*
	 * public void hello() { System.out.println("Hello"); }
	 */
	
	public abstract void updateEmployeeDetails();
	public abstract void getEmployee();
	public abstract void calculateEmployeeSalary();
	
	public void commonEmplyeeBenefits() {
		System.out.println("Common Employee Benefits given by any Employer");
	}
	
}
