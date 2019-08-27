package example1;

public class Demo1 {

	public static void main(String[] args) {

		int a=10;
		int b=2;
		int res=0;
		
		try {
			res=a/b;
			String s="lksjdflkjsf";
			System.out.println("Length of the given string is "+s.length());
			System.out.println(args[0]);
		} catch (ArithmeticException e) {
			System.out.println("You can't devide by zero. This is the catch block...");
		} catch (NullPointerException e) {
			System.out.println("Something is null");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Internal error");
		} finally {
			System.out.println("Result is " +res);
		}
				
		System.out.println("I wish to be printed too.... (outside of try/catch)");

	}

}
