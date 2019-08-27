package time_api;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class AgeCalci2 {

	public static void main(String[] args) {

		String s="11-05-1988";
				
		// create now date object
		LocalDate curr=LocalDate.now();
		
		// create Date of Birth object from date string, all properly formatted
		LocalDate dob=LocalDate.parse(s, DateTimeFormatter.ofPattern("MM-dd-yyyy"));
		
		// calculate period between 
		Period p=Period.between(dob,  curr);
		
		// load the Years difference into age
		int age=p.getYears();
		
		// add age in years to Date of Birth
		dob=dob.plusYears(age);
		System.out.println(dob);
		System.out.println("Age = "+age+" years, "+ChronoUnit.DAYS.between(dob, curr)+" days.");

	}

}
