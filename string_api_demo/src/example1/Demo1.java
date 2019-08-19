package example1;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {
		String s1 = "hello";
		
		System.out.println(s1);
		System.out.println(s1.toUpperCase());
		System.out.println(s1);
		
		s1=s1.toUpperCase();// NOW it is re-assigned its reference
		System.out.println(s1);
		
		System.out.println(s1.equals("hello")); // false, now capitalized
		System.out.println(s1.equals("HELLO")); // true, use for passwords so that it matches EXACTLY
		System.out.println(s1.equalsIgnoreCase("HeLLo")); // true, use for user names

		System.out.println("s1 ends with ello "+s1.endsWith("ELLO"));
		System.out.println("s1 starts with H "+s1.startsWith("H"));
		
		System.out.println("s1 contains 'EL' "+s1.contains("EL"));// contains character sequence
		System.out.println("s1 contains 'LOL' "+s1.contains("LOL"));
		
		// substring is overloaded with different method implementations
		
		System.out.println(s1.substring(1));
		System.out.println(s1.substring(1,3)); //inclusive start, exclusive end, called offset
		
		System.out.println("s1 has a length of "+s1.length());
		System.out.println("Char at place 4 of s1 is "+s1.charAt(4));
		
		for (int i = 0; i < s1.length(); i++) {
			System.out.println(i+": "+s1.charAt(i));		
		}
		
		char c[]=s1.toCharArray();
		
		// Arrays is a utility class, so you don't have to us a for loop to access contents of array
		System.out.println(Arrays.toString(c));
		
		c[3]='m';
		c[0]='l';
		
		System.out.println(Arrays.toString(c));
		
		// convert to string word
		String s2=new String(c);
		System.out.println(s2);
		
		// when we take data from a data base, often there are leading or trailing spaces.
		// what to do?
		// trim it!! - take of leading and trailing white space
		
		String s3="            slkjsdfksdflkj             ";
		System.out.println(s3);
		System.out.println(s3.trim());
		
		
		// how to split a sentence into individual words
		String s4="Hello Hi Good Morning. Enjoying Java Programming?";
		String s5[]=s4.split(" ");
		for (int i = 0; i < s5.length; i++) {
			System.out.println(s5[i].toUpperCase()); // you can also add methods to it!!
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
