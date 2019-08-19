package buffer;

public class TitleCase {

	public static void main(String[] args) {


		String s="hello hii im feeling drowsy";
		
		// expected output - Hello, I'm Feeling Drowsy?
		// split, letter at first location, toUpperCase, recombine, toString
		
		StringBuilder sb=new StringBuilder();
		StringBuilder sb1=new StringBuilder();
		
		String ar[]=s.split(" ");
		
		for (int j = 0; j < ar.length; j++) {
			sb.append(
					Character.toUpperCase(
							ar[j].charAt(
									0))
					).append(
							ar[j].substring(
									1)
							).append(" ");
		}
		System.out.println(sb.toString().trim());
		
		StringBuilder sb2=new StringBuilder();
		for (int i = 0; i < ar.length; i++) {
			if (ar[i].length()%2==0) {
				sb2.append(ar[i]);
			} else {
				char c[]=ar[i].replaceAll("[^a-zA-Z0-9]", "").toCharArray();
				c[c.length/2]=Character.toUpperCase(c[c.length/2]);
				sb2.append(new String(c));
			}
			sb2.append(" ");
		}
		System.out.println(sb2.toString().trim());
		
		// try with last character
		// if the word's length is odd, then convert middle character to uppercase
		
		
		for (int i=0; i<ar.length; i++) { // this selects up to 2nd to last Char //this is selecting last letter and capitalizing  		space at end
			sb1.append(    ar[i].substring(0, ar[i].length()-1)    ).append(  Character.toUpperCase(ar[i].charAt((ar[i].length())-1))   ).append(" ");
		}
		System.out.println(sb1.toString().trim());

	}

}
