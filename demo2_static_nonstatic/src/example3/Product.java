package example3;

import java.util.Arrays;

public class Product {
	
	int id;
	String name;
	double price;
	static float discount=5.5f;
	
	public void printProduct() {
		System.out.println("ID = "+id);
		System.out.println("Name = "+name);
		System.out.println("Price = "+price);
		System.out.println("Discount = "+discount);
	}

}
