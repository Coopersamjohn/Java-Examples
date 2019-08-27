package com.business.impl.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.business.impl.ProductBusinessImpl;

import com_business.ProductBusiness;
import com_pojo.Product;

class ProductBusinessImplTest {

	private static ProductBusiness business;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		business=new ProductBusinessImpl();
	}
	
	@Test
	void testAddProduct() {
		Product p=new Product(100, "dsf", 11, 2, "dsjf,sdh");
		assertEquals(p, business.addProduct(p)); 
		// this "test" ACTUALLY DOES THE ADDPRODUCT() METHOD
		assertEquals(null, business.addProduct(p));
	}
	
	@Test
	void testUpdateProductPrice() {
		
	}
	
	
	

}
