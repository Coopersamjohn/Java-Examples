package overload;

public class Calculator {
	
	public void add(int a, int b) {
		System.out.println("calling int, int result is "+(a+b));
		
	}
	
	// overloading: changing number of params
	public int add(int a, int b, int c) {
		return a + b + c;
	}
	
	// overloading: changing type of params
	public void add(float a, float b) {
		System.out.println("Calling float, float result is "+(a+b));
	}
	
	// overloading
	public void add(int a, float b) {
		System.out.println("Calling int, float result is "+(a+b));
	}
}
