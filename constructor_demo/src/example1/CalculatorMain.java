package example1;

public class CalculatorMain {

	public static void main(String[] args) {

		Calculator c =new Calculator("ganesh");
		
		Calculator c1=new Calculator(10, 20);
		
		System.out.println(c);
		System.out.println(c1.add());
		System.out.println(c1.multiply());
		

	}

}
