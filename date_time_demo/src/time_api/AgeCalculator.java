package time_api;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class AgeCalculator {

	public static void main(String[] args) {


		String s="03.09.1983";
		
		// use localdate class & local time class
		
		LocalDate ld=LocalDate.now();
		System.out.println("Time Now: "+ld);
		
		LocalDate dob=LocalDate.parse(s, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
		
		System.out.println("DOB "+dob);
		
		Period period = Period.between(dob, ld);
		
		System.out.println("Age - "+period.getYears());
		
		System.out.println("You are "+period.getYears()+" years, "+period.getMonths()+" month(s), "+period.getDays()+" day(s) young");

		dob=dob.plusYears(5);
		System.out.println(dob);
		
		System.out.println(ChronoUnit.DAYS.between(dob, ld));
		System.out.println(ChronoUnit.CENTURIES.between(dob, ld));
		System.out.println(ChronoUnit.DECADES.between(dob, ld));
		
	}

}
