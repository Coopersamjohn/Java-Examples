package products;

public class ProductSearch {
	
	public ProductSearch() {};
		
	public Product getProductById(Product productList[], int id) {
		Product product=null;
		
		
		for (int i = 0; i < productList.length; i++) {
			if (productList[i].getPid()==id) {
				product = productList[i];
			} else {
				product = null;
			}
		}
		return product;
	};
	
	public Product[] getProductByName(Product[] productList, String pname) {
		Product[] searchList=new Product[productList.length];
		int x=0;
		for (int i = 0; i < productList.length; i++) {
			if (productList[i].getPname().equals(pname)) {
				searchList[x++] = productList[i];
			} else {
				searchList[i] = null;
			}
		}
		return searchList;
		
	};
	
	public Product[] getProductsByPrice(Product[] productList, int price) {
		Product[] searchList=new Product[productList.length];
		int x=0;
		for (int i = 0; i < productList.length; i++) {
			if (productList[i].getPrice()==price) {
				searchList[x++] = productList[i];
			}
		}
		return searchList;
		
	};
	
	public Product[] getProductsByRating(Product[] productList, int rating) {
		Product[] searchList=new Product[productList.length];
		int x=0;
		for (int i = 0; i < productList.length; i++) {
			if (productList[i].getRating()==rating) {
				searchList[x++] = productList[i];
			}
		}
		return searchList;
	}
	
	public Product[] getProductsByManufacturer(Product[] productList, String manufacturerName) {
		Product[] searchList=new Product[productList.length];
		int x=0;
		for (int i = 0; i < productList.length; i++) {
			if (productList[i].getManufacturerName().equals(manufacturerName)) {
				searchList[x++] = productList[i];
			}
		}
		return searchList;
	}
	
	
	public void printProduct(Product searchList) {
		if (searchList==null) {
			System.out.println("Product not found");
		} else {
			System.out.println("Product found");
			System.out.println("Id = "+searchList.getPid());
			System.out.println("Name = "+searchList.getPname());
			System.out.println("Price = "+searchList.getPrice());
			System.out.println("Rating = "+searchList.getRating());
			System.out.println("Manufacturer = "+searchList.getManufacturerName());
		};
	}
	public void printProducts(Product[] searchList) {
		for (int i = 0; i < searchList.length; i++) {
			if (searchList[0]==null) {
				System.out.println("Product not found");
				break;
			}
			if(!(searchList[i]== null)) {
				System.out.println("Product(s) found");
				System.out.println("Id = "+searchList[i].getPid());
				System.out.println("Name = "+searchList[i].getPname());
				System.out.println("Price = "+searchList[i].getPrice());
				System.out.println("Rating = "+searchList[i].getRating());
				System.out.println("Manufacturer = "+searchList[i].getManufacturerName());
			}
		}
	}
}
