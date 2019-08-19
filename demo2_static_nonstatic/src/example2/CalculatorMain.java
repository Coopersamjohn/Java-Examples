package example2;

public class CalculatorMain {
	public static void main(String[] args) {
		Calculator.sayHelloStatic();
		Calculator x=new Calculator();
		x.sayHelloNonStatic();
		System.out.println(x.add(99,  89));
		int res=x.add(989, 786);
		System.out.println("res is " + res);
		System.out.println(new Calculator().add(123,  888));
		System.out.println(new Calculator().multiply(234, 345, 876));
		System.out.println(new Calculator().divide(876876, 342));
	}
}
