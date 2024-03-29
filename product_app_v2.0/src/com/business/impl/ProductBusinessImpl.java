package com.business.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com_business.ProductBusiness;
import com_pojo.Product;

public class ProductBusinessImpl implements ProductBusiness {

	private Map<Integer, Product> productMap=new HashMap<>();

	@Override
	public Product addProduct(Product product) {
		/*
		 * productMap.put(product.getPid(), product); return product;
		 */
		
		if(productMap.containsKey(product.getPid())) {
			return null;
		} else {
			productMap.put(product.getPid(), product) ;
			return product;
		}
	}

	@Override
	public Product updateProductPrice(int pid, double newPrice) {
		Product x=productMap.get(pid);
		x.setPrice(newPrice);
		return x;
	}

	@Override
	public void deleteProduct(int pid) {
		productMap.remove(pid);
		System.out.println("Product "+pid+" removed");
	}

	@Override
	public Product getProductById(int pid) {
		Product p=productMap.get(pid);
		return p;
	}

	@Override
	public List<Product> getProductsByName(String name) {
		List<Product> found=new LinkedList<>();
		for(Product e:productMap.values()) {
			if (e.getPname().equals(name)) {
				found.add(e);
			}
		}
		return found;
	}

	@Override
	public List<Product> getAllProducts() {
		
		// study this, <stuff between angles> not necessary to functioning
		return new ArrayList<Product>(productMap.values());
	}

	public Map<Integer, Product> getProductMap() {
		return productMap;
	}

	public void setProductMap(Map<Integer, Product> productMap) {
		this.productMap = productMap;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((productMap == null) ? 0 : productMap.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductBusinessImpl other = (ProductBusinessImpl) obj;
		if (productMap == null) {
			if (other.productMap != null)
				return false;
		} else if (!productMap.equals(other.productMap))
			return false;
		return true;
	}
	
	
	
}
