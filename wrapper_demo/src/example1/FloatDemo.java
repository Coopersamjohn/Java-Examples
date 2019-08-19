package example1;

public class FloatDemo {

	public static void main(String[] args) {

		Float f1=10.5f;
		Float f2=11.5f;
		Float f3=10.5f;
		Float f4=new Float(10.5f);
		
		System.out.println("f1.equals(f2) "+f1.equals(f2));
		System.out.println("f1.equals(f3) "+f1.equals(f3));
		System.out.println("f1.equals(f4) "+f1.equals(f4));
		
		float x=20.7f;
		Float f5=x;
		System.out.println("f5 = "+f5);
		f5=99.7f;
		System.out.println("x before = "+x);
		x=f5;
		System.out.println("x = "+x);

	}

}
