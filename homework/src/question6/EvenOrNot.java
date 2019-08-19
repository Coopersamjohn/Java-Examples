package question6;

public class EvenOrNot {

	// Write a program to determine if an integer 
	// is even without using the modulus operator (%)
	
	public String evenOrNot(int num) {
		
		int x = num/2;
		if (x*2==num) {
			return "Even";
		} else {
			return "Odd";
		}
	}
	
}
