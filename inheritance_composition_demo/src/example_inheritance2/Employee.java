package example_inheritance2;

public class Employee extends Person{
	
	private String orgName;
	private String designation;
	private double salary;
	public Employee() {
		// THIS IS THE OBJECT CONSTRUCTOR
	}
	
	// this is also object constructor
	public Employee(int id, String name, String orgName, String designation, double salary) {
		super(id,name); // refers to person, arguments pull in the parent's properties
		this.orgName = orgName;
		this.designation = designation;
		this.salary = salary;
	}

	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void printEmployee() {
		System.out.println("Employee details are...");
		super.printPerson();
		System.out.println("Organization Name : "+orgName);
		System.out.println("Designation : "+designation);
		System.out.println("Salary : "+salary);
	}
	
}
