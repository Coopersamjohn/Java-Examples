package com_pojo;

public class Product {
	
	public Product() {
		//business standard
	}
	
	private int pid;
	private String pname;
	private double price;
	private int rating;
	private String manufacturerName;
	
	public Product(int pid, String pname, double price, int rating, String manufacturerName) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.rating = rating;
		this.manufacturerName = manufacturerName;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getManufacturerName() {
		return manufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	@Override
	public String toString() {
		return "\n Product ID #" + pid + "\n Product Name: " + pname + "\n Price: $" + price + "\n Rating:" + rating
				+ "\n Manufacturer: " + manufacturerName + "\n";
	}
	
	
	
}
