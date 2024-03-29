package com_main;

import java.util.List;
import java.util.Scanner;

import com.business.impl.ProductBusinessImpl;

import com_business.ProductBusiness;
import com_pojo.Product;

public class ProductMain {

	public static void main(String[] args) {

		ProductBusiness pb=new ProductBusinessImpl();
		Scanner sc=new Scanner(System.in);
		
		pb.addProduct(new Product(100, "cup", 3.95, 5, "Ozarka"));
		pb.addProduct(new Product(101, "table", 5.95, 5, "Ozarka"));
		pb.addProduct(new Product(102, "chair", 5.95, 4, "Ikea"));
		pb.addProduct(new Product(103, "couch", 10.95, 4, "Ikea"));

		

				// initialize choice variable
				int ch=0;
				
				// Products Management App V2.0
				do {
					System.out.println("");
					System.out.println("");
					System.out.println(" Welcome to the Product Management App V2.0 ");
					System.out.println("--------------------------------------------");
					System.out.println("");
					System.out.println(" What would you like to do? Enter Your Choice (1-7)");
					System.out.println("");
					System.out.println("--------------------------------------------");
					System.out.println("");
					System.out.println("1) Add a product");
					System.out.println("2) Update a product's price");
					System.out.println("3) Delete a product");
					System.out.println("4) Search by product ID");
					System.out.println("5) Search by product name");
					System.out.println("6) See a list of all products");
					System.out.println("7) Exit");
					System.out.println("");
					System.out.println("--------------------------------------------");
					System.out.println("");
					System.out.println("> ");
					System.out.println("");
					ch=sc.nextInt();
					
					switch (ch) {
					case 1: 
						System.out.println("Okay, let's add a product:::");
						System.out.println("----------------------------");
						System.out.println("What's this product's Id?");
						int prodID=sc.nextInt();
						
						System.out.println("What's this product's name?");
						String prodName=sc.next();
						
						System.out.println("What's this product's price (xxx.xx format)");
						double prodPri=sc.nextDouble();
						
						System.out.println("What's this product's rating? ");
						int prodRat=sc.nextInt();
						
						System.out.println("What's this product's manufacturer");
						String prodMan=sc.next();
						
						System.out.println(pb.addProduct(new Product(prodID, prodName, prodPri, prodRat, prodMan)));						
						
						break;
					case 2:
						System.out.println(" Enter ID to update it's price: ");
						
						// user search ID
						int pid=sc.nextInt();
						
						System.out.println(" What price should it be? (Please enter in $xxx.xx format");
						
						double newPrice=sc.nextDouble();
						
						Product prod=pb.updateProductPrice(pid, newPrice);
						
						// printing search results
						printProduct(prod);
					
						
						break;
					case 3:
						System.out.println(" Delete a product by Id : ");

						int pid1 = sc.nextInt();
						
						pb.deleteProduct(pid1);
						
						printProducts(pb.getAllProducts());
						
						break;
					case 4:
						System.out.println(" Enter product Id to search for : ");
						
						// user search Id
						int pid2=sc.nextInt();
						
						Product prod2=pb.getProductById(pid2);
						
						// printing search results
						printProduct(prod2);
							
						break;
					case 5:
						
						//DONE
						System.out.println("Enter product Name to search for :");
						
						// user search manufacturer
						String pname=sc.next();
						
						// load search results into variable
						List<Product> prod1 = pb.getProductsByName(pname);
						
						printProducts(prod1);
						
						break;
					case 6:
						
						printProducts(pb.getAllProducts());
						
						break;
					case 7:
						System.out.println("Thanks for using the Product Management App V2.0");
						System.out.println("Exiting.... Done!");
						System.out.println("Please close this console window.");
						break;
					default: 
						System.out.println("Try another option");
						break;
					}
				}while(ch !=7);

				sc.close();

	}
	
	public static void printProduct(Product product) {
		System.out.println(product);
	}
	
	public static void printProducts(List<Product> productList) {
		System.out.println("There are "+productList.size()+" product(s) to manage.");
		
		for(Product p:productList) {
			System.out.println(p);
		}
	}

}
