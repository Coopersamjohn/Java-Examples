package example_functional_lambda;

public class HelloImpl { //implements HelloFunctional {

	/*
	 * @Override public void hello() {
	 * 
	 * System.out.println("Hey");
	 * 
	 * }
	 */

	public static void main(String[] args) {
		
		/*
		 * HelloFunctional h=new HelloImpl(); h.hello();
		 */
		
		// supershortcut to accessing. when there is only one function in an interface
		HelloFunctional h1=()->{
			System.out.println("Hey Lambda");
		};
		
		HelloFunctional h2=()->{
			System.out.println("Heyyyy Lambda aGAIN");
		};
		
		h1.hello();
		h2.hello();
		
		// ONE LINE VERSION
		Sum s1=(x, y)-> x + y;
		
		System.out.println(s1.add(99, 99));
		System.out.println(s1.add(889, 9));
		
		Hey h=(String n)-> System.out.println("Helloooo "+n);
		
		h.hello("Sachin");
		h.hello("Bobby");
	}
	
	

}
