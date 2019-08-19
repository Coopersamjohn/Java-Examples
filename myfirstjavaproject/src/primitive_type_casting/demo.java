package primitive_type_casting;

public class demo {

	public static void main(String[] args) {
		/*
		 * type casting? conversion of one data type to another
		 * Implicit Casting - where smaller data types is converted to larger data type implicitly by java compiler
		 * 
		 * Char - when converted to int or some number, it will give the ascii key value
		 * 
		 * Explicit Casting - larger to smaller by specifying the smaller
		 */
		
		int x=10;
		long l=x;
		double d=x;
		float f=x;
		System.out.println("f = " +f);
		char c ='a';
		x=c;
		System.out.println("x="+x);
		
		x = 99;
		
		char z=(char) x;
		System.out.println("z + "+z);
		
		long lo=123565688787687687l;
		int n=(int) lo;
		System.out.println("n = "+n);
		
		float fl=13453.24352f;
		int o=(int) fl;
		System.out.println("o = "+o);
		
		double dl=123.444555555;
		int m=(int) dl;
		System.out.println("m = "+m);
		
		
	}

}
