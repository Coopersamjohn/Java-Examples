package example1;

public class CharApiDemo {

	public static void main(String[] args) {

		String s="As f**(w45374647 kjhf  ALS *&$%^&@*$&)!)(@$%&^*()jh8&*^(8  87***88nnj  **,;';[][] ]  kjkjkdf[[]5  _=+sdf  +";

		int alpha=0, upper=0, lower=0, digit=0, alphanum=0, spaces=0, special=0;
		
		for (int i = 0; i < s.length(); i++) {
			char c=s.charAt(i);
			if(Character.isAlphabetic(c)) {
				alpha++;
			};
			if(Character.isUpperCase(c)) {
				upper++;
			};
			if(Character.isLowerCase(c)) {
				lower++;
			};
			if(Character.isDigit(c)) {
				digit++;
			};
			if(Character.isLetterOrDigit(c)) {
				alphanum++;
			};
			if(Character.isWhitespace(c)) {
				spaces++;
			};
			// special characters are everything NOT letters, digits & white spaces
			if(!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
				special++;
			}
		};
		System.out.println("Alpha count = "+alpha);
		System.out.println("Upper count = "+upper);
		System.out.println("Lower count = "+lower);
		System.out.println("Digit count = "+digit);
		System.out.println("Alpha numeric count = "+alphanum);
		System.out.println("Special count = "+special);
		
		
		
	}

}
