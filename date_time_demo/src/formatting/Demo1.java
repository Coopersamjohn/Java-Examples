package formatting;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo1 {

	public static void main(String[] args) {
		/*
		 * dd - day in 2 digits
		 * MM - Month in 2 digit  MMM - Aug, Sep, etc  MMMM-> full month name August September
		 * yy - lower-case, last 2 digits of year  yyyy - lower-case, full year
		 * EEE - day of week name abbreviation - Thu, Mon
		 * EEEE - full name of day of week - Monday, Thursday
		 * 
		 * time
		 * hh - 12 hour
		 * 		a - AM/PM
		 * HH - 24 hour
		 * mm - minutes
		 * ss - seconds
		 * z - local zone time in 3 digit code: EST, CDT, etc.
		 * Z - zone hours relative to GMT - +0300, -0500, etc.
		 */
		
		// load standard date object
		Date d=new Date();
		System.out.println(d);
		
		// set up the format
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MMMM-yyyy EEE  HH:mm:ss a z Z");
		
		// use the format method on SimpleDateFormat object
		System.out.println(sdf.format(d));
		
		
		
	}

}
