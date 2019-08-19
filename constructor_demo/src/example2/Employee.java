package example2;

public class Employee {
	int id;
	String name;
	int age;
	String city;

	public Employee() {
		
	}

	public Employee (int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	public Employee(int id,String name,int age, String city) {
		this(id,name); // constructor chaining - only first line
		this.age=age;
		this.city=city;
	}
	
	public void printEmployee() {
		System.out.println("Id = "+id);
		System.out.println("Name = "+name);
		System.out.println("Age = "+age);
		System.out.println("City = "+city);
	}
	
}
