package entities;

public class Products {
	private String productName;
	private int quantity;
	private double cost;	

	public Products(String productName, int quantity, double cost) {
		super();
		this.productName = productName;
		this.quantity = quantity;
		this.cost = cost;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

}
