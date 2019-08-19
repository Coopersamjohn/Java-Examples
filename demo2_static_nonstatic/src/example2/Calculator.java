package example2;

public class Calculator {
	public static void sayHelloStatic() {
		System.out.println("Hello from static method");
	}
	
	public void sayHelloNonStatic() {
		System.out.println("Hello from non static method");
	}
	
	public int add (int a,int b) {
		return a+b;
	}
	
	public int multiply(int a, int b, int c) {
		return a*b*c;
	}
	
	public float divide(float a, float b) {
		return  a/b;
	}
	
}
