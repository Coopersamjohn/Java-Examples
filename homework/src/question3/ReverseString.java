package question3;

public class ReverseString {
	
	public String reverseString(String word) {
		
		char letters[]=word.toCharArray();
		
		String backwards="";
		
		for (int i = letters.length-1 ; i >= 0 ; i--) {
			backwards += letters[i];
		}
		
		return backwards;
		
	}

}
