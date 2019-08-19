package example1;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee e3=new Employee(103, "Robby", 24, "Dallas");
		printEmployee(e3);
		
		Employee e2=new Employee();
		e2.setId(111);
		e2.setName("Raj");
		e2.setAge(33);
		e2.setCity("Bangalore");
		System.out.println("\n\nPrinting e2");
		printEmployee(e2);

	}
	
	public static void printEmployee(Employee employee) {
		//System.out.println("Id = "+employee.id);
		System.out.println("Id = "+employee.getId());
		System.out.println("Name = "+employee.getName());
		System.out.println("Age = "+employee.getAge());
		System.out.println("City = "+employee.getCity());

	}
}