package com_business;

import java.util.List;

import com_pojo.Product;

public interface ProductBusiness {

	// adding a product, return product, use .put()
	public Product addProduct(Product product);
	
	// updating a product price, return product, .get() & .put()
	public Product updateProductPrice(int pid, double newPrice);
	
	// delete product, use .remove()
	public void deleteProduct(int pid);
	
	// get product, use .get()
	public Product getProductById(int pid);
	
	// list of products by names, use any loop -> as you find product w/ search name-> add it to the list and return it 
	public List<Product> getProductsByName(String name);
	
	// list of all products, use .values()
	public List<Product> getAllProducts();
	
}
