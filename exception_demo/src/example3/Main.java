package example3;

import com.exception.BusinessException;
import com.exception.InvalidAgeException;

public class Main {

	public static void main(String[] args) {

		Validate v=new Validate();
		
		try {
			if (v.isValidAge(22)) {
				System.out.println("Age Validated");
			}
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			if (v.isValidContactNumber("+1-kjhsdfkljh")) {
				System.out.println("Phone number validated");
			}
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}

	}

}
