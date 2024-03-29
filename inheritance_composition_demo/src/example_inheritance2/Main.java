package example_inheritance2;

public class Main {

	public static void main(String[] args) {
		Employee e=new Employee(100, "Rajesh", "Revature", "Trainee", 1200.00);
		//e.printEmployee();
		printAnything(e);
		
		Player p=new Player(101, "Bob", "Kickers", "Forward");
		//p.printPlayer();
		printAnything(p);
		
		Person per=new Person(999, "Lucky");
		printAnything(per);

		printAnything(new Object());
	}

	public static void printAnything(Object o) {
		// object casting
		if(o instanceof Employee) {
			Employee e=(Employee) o;
			e.printEmployee();
		} else if(o instanceof Player) {
			Player p=(Player)o;
			p.printPlayer();
		} else if (o instanceof Person) {
			Person p=(Person) o;
			p.printPerson();
		} else {
			System.out.println("Its just java.lang.Object");
		}
		
	}
}
