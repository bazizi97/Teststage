package Suppliers;

public class Work {
	private String type;
	private double price;
	public Work(String string, int i) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Work [type=" + type + ", price=" + price + "]";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
