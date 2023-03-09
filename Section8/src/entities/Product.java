package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product() {
		
	}
	
	// Métodos
	public double TotalValueInStock() {
		return quantity * price;
	}
	
	public void AddProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void RemoveProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String resumoDeCompra() {
		return String.format("%s, $ %.2f, %d units, TOTAL: $ %.2f\n",name, price, quantity, TotalValueInStock());
	}
	
	public String toString() {
		return name 
				+ ", $"
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " units, Total: $"
				+ TotalValueInStock();
	}
}
