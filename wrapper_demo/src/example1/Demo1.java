package example1;

public class Demo1 {

	public static void main(String[] args) {

		Integer i1=10;
		Integer i2=20;
		Integer i3=10;
		Integer i4=new Integer(10); // assigned to heap, NOT Common Primitive Pool
		
		System.out.println("i1==i2"+(i1==i2));
		System.out.println("i1==i3"+(i1==i3));
		System.out.println("i1==i4"+(i1==i4));
		
		System.out.println("i1.equals(i2)"+i1.equals(i2)); // compares values
		System.out.println("i1.equals(i3)"+i1.equals(i3));
		System.out.println("i1.equals(i4)"+i1.equals(i4));
		
		// AUTOBOXING - converting primitive value to wrapper class, thus loading into common primitive pool
		int x=20;
		Integer i5=x;
		System.out.println("i5 = "+i5);
		i5=99;
		System.out.println("x before = "+x);
		x=i5;
		System.out.println("x = "+x);
		
		// convert string to int
		String s="121";
		i3=Integer.parseInt(s); // className.parseXYZ(String)
		System.out.println("i3 = "+i3);
		
		//convert int to string
		i3=10000;
		s=i3.toString();// object to string
		System.out.println("s = "+s);
		
		int z=1999;
		s=z+"";// primitive to string - just by adding empty quotes
		System.out.println("s = "+s);
		
		System.out.println(Integer.MAX_VALUE);// static and final, constant for all capitals
		System.out.println(Integer.MIN_VALUE);
		
		Integer i6=100;
		Integer i7=200;
		
		// compareTo -> if both values are same, it will return 0
		// if x>y, it will return 1 or positive result
		// if x<y, it will return -1 or negative result
		
		System.out.println(i7.compareTo(i6));
		System.out.println(i6.compareTo(i7));
		System.out.println(i7.compareTo(200));
		
		// make sure Double is capitalized!!
		Double d=i7.doubleValue(); // convert integer to double
		System.out.println("d = "+d);
		
		d=1999.999999;
		i7=d.intValue(); // when object
		
		System.out.println("i7 = "+i7);
		
		double d1=2999.8888;
		i7=(int)d1; // when primitive
		
		System.out.println("i7 = "+i7);
		
		// for encryption
		System.out.println(Integer.toBinaryString(20));
		
		// Float & Long Values
		Float f=i7.floatValue();
		Long l=i7.longValue();
		
		System.out.println(f);
		System.out.println(l);
		
		
	}

}
