package example1;

public class RegEx {

	public static void main(String[] args) {
		
		/* Reg-Ex(Regular Expressions - common in all languages) 
		 * 
		 * PMA - pattern matching algorithm
		 * 
		 *  [] - expression
		 *
		 */
		
		String s="QDEFU1989P";

		if(s.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
			System.out.println("Validated");
		} else {
			System.out.println("Invalidated");
		}

		String s1="As f**(w45374647 kjhf  ALS *&$%^&@*$&)!)(@$%&^*()jh8&*^(8  87***88nnj  **,;';[][] ]  kjkjkdf[[]5  _=+sdf  +";
		
		if (s1.matches("")) {
			System.out.println("Validated");
		} else {
			System.out.println("Invalidated");
		}
		
		// replaces everything NOT alphabet
		System.out.println(s1.replaceAll("[^a-zA-Z]", ""));
		// returns how many letters
		System.out.println(s1.replaceAll("[^a-zA-Z]", "").length());
		// replaces all letters with nothing, leaving only digits
		System.out.println(s1.replaceAll("[^0-9]", ""));
		// replaces all alphanumerics with nothing, leaving only SPECIAL CHARACTERS and SPACES. NOTE: add a space to exclude spaces, too
		System.out.println(s1.replaceAll("[a-zA-Z0-9]", ""));
		
	}

}
