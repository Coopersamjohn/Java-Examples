package example1;

public class ValidateMobileNumber {

	public static void main(String[] args) {

		String s="+1-1231456888";
		
		if(s.matches("\\+1-[0-9]{10}")) {
			System.out.println("Valid mobile number");
		} else {
			System.out.println("Invalid mobile number");
		}

	}

}
