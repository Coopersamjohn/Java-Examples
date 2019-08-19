package question5;

public class Substring {
	
	// Write a substring method that accepts a string str and an integer idx and 
	// returns the substring contained between 0 and idx-1 inclusive.
	
	public String substring(String sup, int idx) {
		
		char y[]=sup.toCharArray();
		String sub = "";
		
		for (int i = 0; i < idx; i++) {
			sub += y[i];
		}
		
		
		return sub;
		
	}

}
