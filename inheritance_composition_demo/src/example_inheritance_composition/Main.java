package example_inheritance_composition;

public class Main {

	public static void main(String[] args) {
		
		Employeer employeer=new Employeer(500, "Revature", "Vinal");
		
		Employee e=new Employee(100, "Rajesh", employeer, "Trainee", 1200.00);
		//e.printEmployee();
		printAnything(e);
		
		Team team=new Team(99, "Kickers", "Jay");
		Player p=new Player(101, "Bob", team, "Forward");
		//p.printPlayer();
		printAnything(p);
		
		Person per=new Person(999, "Lucky");
		printAnything(per);

		printAnything(new Object());
	}
	// .equals method wil replace this eventually
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
