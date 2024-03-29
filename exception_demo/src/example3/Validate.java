package example3;

import com.exception.BusinessException;
import com.exception.InvalidAgeException;

public class Validate {
	
	public boolean isValidAge(int age) {
		if(age<=0) {
			throw new InvalidAgeException("Age cannot be -ve or zero");
		} else if (age<18 || age>32) {
			throw new InvalidAgeException("Age should be between 18 & 32");
		}
		return true;
	}
	
	public boolean isValidContactNumber(String contact) throws BusinessException {
		
		if(!contact.matches("\\+1-[0-9]{10}")) {
			throw new BusinessException("Invalid mobile Number");
		}
		return true;
	}
	
	// start
	public boolean isNameRight() {
		return false;
	};

}
