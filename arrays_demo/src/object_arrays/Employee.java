package object_arrays;

public class Employee {
	// currently not encapsulated, this is called data leakage, won't be able to trace who tried to access or accessed data.
	// now that private is added, getters and setters are added so that the data can be accessed and tracked
	private int id;
	private String name;
	private int age;
	private String city;

	public Employee() {
		// business standard method
	}
	
	public Employee(int id, String name, int age, String city) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
}
