package example2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Validate {

	public void openFile(String fileName) throws FileNotFoundException {
		FileInputStream fis=new FileInputStream(fileName);
	}

	public int divide(int a,int b) {
		return a/b;
	}
	
	public boolean isValidContactNumber(String contact) throws Exception {
		if(!contact.matches("\\+1-[0-9]{10}")) {
			throw new Exception("Invalid mobile Number");
		}
		return true;
	}
	
	public boolean isValidAge(int age) {
		if(age<=0) {
			throw new RuntimeException("Age cannot be -ve or zero");
		} else if (age<18 || age>32) {
			throw new RuntimeException("Age should be between 18 & 32");
		}
		return true;
	}
	
}
