package example3;

public class ProductMain {
	public static void main(String[] args) {
		
		Product p1=new Product();
		p1.id=100;
		p1.name="TV";
		p1.price=1200.22;
		
		Product p2=new Product();
		p2.id=101;
		p2.name="Washing Machine";
		p2.price=110.22;
		
		Product.discount=9.9f;
		
		p1.printProduct();
		p2.printProduct();
		
	}
}
