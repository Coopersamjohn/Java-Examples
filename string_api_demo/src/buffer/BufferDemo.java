package buffer;

public class BufferDemo {

	public static void main(String[] args) {

		StringBuffer sb=new StringBuffer("hello"); // 2 objects in this line, "hello" is String obj and sb is StringBuffer obj
		System.out.println(sb); // anything within " " is a String object

		sb.append(" Heyjyyyy ");
		System.out.println(sb);
		
		System.out.println(sb.length());
		System.out.println(sb.charAt(9));
		
		sb.insert(1, "java");
		System.out.println(sb);
		
		sb.delete(5, 8);
		System.out.println(sb);
		
		sb.deleteCharAt(0);
		System.out.println(sb);
		
		System.out.println(sb.reverse());
		
		// STRING BUFFER
		
		StringBuffer sb1=new StringBuffer("java");
		StringBuffer sb2=new StringBuffer("java");
		
		System.out.println(sb1.equals(sb2)); // doesn't work
		System.out.println(sb1.toString().equals(sb2.toString())); // does work
		
		
	}

}
