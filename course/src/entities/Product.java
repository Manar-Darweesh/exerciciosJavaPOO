package entities;

public class Product {
	
	public String name;
	public double price;
	public int quant;
	
	public double totalValueInStock() {
		return price * quant;
	}
	
	public void addProduct(int quant) {
		this.quant += quant;
	}
	
	public void removeProduct(int quant) {
		this.quant -= quant;
	}
	public String toString() {
		return name 
			+ " , $ "
			+ String.format("%.2f", price) 
			+ " , "
			+ quant
			+ " units, Total: $ "
			+ String.format("%.2f",totalValueInStock());
	}
}
