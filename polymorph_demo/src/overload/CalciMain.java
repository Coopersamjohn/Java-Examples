package overload;

public class CalciMain {

	public static void main(String[] args) {

		Calculator c=new Calculator();
		c.add(12,  11111);
		c.add(12.444f, 8999.99f);
		c.add(343, 789.99f);
		
		System.out.println("int, int, int called result is " + " " + c.add(12, 89, 88));

	}

}
