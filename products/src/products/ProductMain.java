package products;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		/*
		 * System.out.println("Enter number of products you'd like to enter this batch"
		 * ); int size=sc.nextInt();
		 */
		
		// creates array, not product object
		Product productList[]=new Product[4];
		//initialize Product Search
		ProductSearch productSearch=new ProductSearch();
		
		/*
		 * for (int i = 0; i < productList.length; i++) {
		 * System.out.println("Enter product details - "+(i+1));
		 * System.out.println("Enter product id"); int pid=sc.nextInt();
		 * System.out.println("Enter product name"); String pname=sc.next();
		 * System.out.println("Enter price"); int price=sc.nextInt();
		 * System.out.println("Enter rating"); int rating = sc.nextInt();
		 * System.out.println("Enter manufacturer name"); String manufacturerName =
		 * sc.next();
		 * 
		 * productList[i] = new Product(pid, pname, price, rating, manufacturerName); };
		 */
		
		productList[0] = new Product(100, "cup", 3, 5, "Ozarka");
		productList[1] = new Product(101, "table", 5, 5, "Ozarka");
		productList[2] = new Product(102, "chair", 5, 4, "Ikea");
		productList[3] = new Product(103, "couch", 10, 4, "Ikea");
		
		// to print products just entered
		/*
		 * productSearch.printProduct(productList[0]);
		 * productSearch.printProduct(productList[1]);
		 * productSearch.printProduct(productList[2]);
		 * productSearch.printProduct(productList[3]);
		 */
		
		// initialize choice variable
		int ch=0;
		
		// search Products Menu Start
		do {
			System.out.println("Search Products Menu");
			System.out.println("-------------------------");
			System.out.println("1) By Id");
			System.out.println("2) By Name");
			System.out.println("3) By Price");
			System.out.println("4) By Rating");
			System.out.println("5) By Manufacturer Name");
			System.out.println("6) Exit");
			System.out.println("Enter Your Choice (1-6)");
			ch=sc.nextInt();
			
			switch (ch) {
			case 1: 
				System.out.println("Enter ID to search for product by ID");
				// user search ID
				int pid=sc.nextInt();
				
				//load search results into variable
				Product y=productSearch.getProductById(productList, pid);
				
				// printing search results
				productSearch.printProduct(y);
				
				break;
			case 2:
				System.out.println("Enter name to search for product by name");
				
				// user search name
				String pname=sc.next();				
				
				// load search results into variable
				Product[] x=productSearch.getProductByName(productList, pname);
				
				// printing search results
				productSearch.printProducts(x);
			
				
				break;
			case 3:
				System.out.println("Enter a price to search for product by price");

				// user search price
				int price=sc.nextInt();
				
				// load search results into variable
				Product z[]=productSearch.getProductsByPrice(productList, price);
				
				// printing search results
				productSearch.printProducts(z);
				
				break;
			case 4:
				System.out.println("Enter Rating (1-5) to search for products by rating");
				
				// user search rating
				int rating=sc.nextInt();
				
				// load search results into variable
				Product q[]=productSearch.getProductsByRating(productList, rating);

				productSearch.printProducts(q);
					
				break;
			case 5:
				System.out.println("Enter Manufacturer name to search products by that");
				
				// user search manufacturer
				String manufacturer=sc.next();
				
				// load search results into variable
				Product m[]=productSearch.getProductsByManufacturer(productList, manufacturer);
				
				productSearch.printProducts(m);
				
				break;
			default: 
				System.out.println("Try another option");
				break;
			}
		}while(ch !=6);

		sc.close();
	}

}
