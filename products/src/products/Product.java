package products;

public class Product {
	
	public Product() {
		//business standard
	}
	
	private int pid;
	private String pname;
	private int price;
	private int rating;
	private String manufacturerName;
	
	public Product(int pid, String pname, int price, int rating, String manufacturerName) {
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
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
	
}
