package override_object;

public class Main {

	public static void main(String[] args) {

		Player p1=new Player(100, "Sachin");
		System.out.println(p1);
		//System.out.println(p1.toString());
		Player p2=new Player(101, "Virat");
		System.out.println(p2);
		
		if(p1.equals(p2)) {
			System.out.println("Both are same");
		} else {
			System.out.println("They're different");
		}
		
	}

}
