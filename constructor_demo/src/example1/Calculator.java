package example1;

public class Calculator {
	super();
	int a;
	int b;

	public Calculator(String name) {
		System.out.println("Hello "+name);
	}
	
	public Calculator(int x, int y) {
		a=x;
		b=y;
	}
	
	public int add() {
		return a+b;
	}

	public int multiply() {
		return a*b;
	}
}
