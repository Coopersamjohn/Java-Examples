package buffer;

public class Palindrome {

	public static void main(String[] args) {

		String s="madam";
		System.out.println(isPalindrome(s));
		System.out.println(isPalindrome("akljskljhsjjdfjsf"));
		
		// check if a number is a Palindrome
		int x=121;
		System.out.println(isPalindrome(x+""));

	}
	
	public static boolean isPalindrome(String s) {
		// boolean b=false;
		
		/*
		 * StringBuffer sb=new StringBuffer(s); sb.reverse(); String s2=s.toString();
		 * if(s.equals(s2)) { b=true; }
		 */
		
		// this is the one line version of the above commented-out code
		return new StringBuffer(s).reverse().toString().equals(s);
	}

}
