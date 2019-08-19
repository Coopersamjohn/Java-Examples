package example1;

public class AbcEmployee extends Ems{

	@Override
	public void addEmployee() {
		System.out.println("AbcEm added to Oracle DB");
		
	}

	@Override
	public void updateEmployeeDetails() {
		System.out.println("AbcEmp updated in Oracle Db");
		
	}

	@Override
	public void getEmployee() {
		System.out.println("AbcEmp retrieved from Oracle DB");
		
	}

	@Override
	public void calculateEmployeeSalary() {
		System.out.println("AbcEmp Salary calculated");
		
	}
	
	public void localAbcEmpBenefits() {
		System.out.println("This is explicit feature for Abc Employees");
		
	}

	
	
}
