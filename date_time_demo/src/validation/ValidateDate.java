package validation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ValidateDate {

	public static void main(String[] args) {

		String s="09-09-2019";
		
		//leinient
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		sdf.setLenient(false);
		
		// this marks if date entered passed REGEX
		boolean b=false;
		
		Date d=null;
		
		if(s.matches("[0-3]{1}[0-9]{1}-[0-9]{2}-[0-9]{4}")) {
			try {
				d=sdf.parse(s);
				b=true;
				
			} catch (ParseException e) {
				System.out.println("Enter the date like this: DD-MM-YYYY");
			}
		}
		if(b) {
			System.out.println("Valid date "+d);
		} else {
			System.out.println("Enter the date like this: DD-MM-YYYY");
		}
		
		

	}

}
