package example1;

public class XyzEmployee extends Ems {

	@Override
	public void addEmployee() {
		System.out.println("XyzEmp added to MySQL Db");
		
	}

	@Override
	public void updateEmployeeDetails() {
		System.out.println("XyzEmp updated in MySQL Db");
		
	}

	@Override
	public void getEmployee() {
		System.out.println("XyzEmp returned from MySQL Db");
		
	}

	@Override
	public void calculateEmployeeSalary() {
		System.out.println("XyzEmp salary calculated");
		
	}
	
	

}
