package entities;

public class ProductAula88 {
	private String name;
	private double price;
	
	// criar um construtor --> •Botão direito -> Source -> Generate Constructor using Fields
	public ProductAula88(String name, double price) {
		this.name = name;
		this.price = price;
	}

	// criar getters e setters --> •Botão direito -> Source -> Generate Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
