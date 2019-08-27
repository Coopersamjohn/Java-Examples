package example2;

import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) {

		Validate v=new Validate();
		try {
			v.openFile("zdfsd");
			v.divide(10,0); // this doesn't run
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		
		try {
			v.divide(10,0);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		
		try {
			// the if loop isn't necessary to check
			if(v.isValidContactNumber("+1-5675675676")) {
				System.out.println("Contact Validated");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			if(v.isValidAge(21)) {
				System.out.println("Age is validated");
			}
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
