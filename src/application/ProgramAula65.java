package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

// classe principal
public class ProgramAula65 {

	public static void main(String[] args) {
		// Enter product data:
	    // Name: TV
	    // Price: 900.00
	    // Quantity in stock: 10

	    // Product data: TV, $ 900.00, 10 units, Total: $ 9000.00 
	    // Enter the number of products to be added in stock: 5
	    // Updated data: TV, $ 900.00, 15 units, Total: $ 13500.00 
	    // Enter the number of products to be removed from stock: 3 
	    // Updated data: TV, $ 900.00, 12 units, Total: $ 10800.00
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product(); // declarar variavel do tipo product
		
		
		System.out.println("Enter product data: "); // interação com o usuario
		
		System.out.print("Name: "); // interação com o usuario
		product.name = sc.nextLine(); // ler o nome do produto e armazenar
		
		System.out.print("Price: "); // interação com o usuario
		product.price = sc.nextDouble();
		
		System.out.println("Quantity in Stock: "); // interação com o usuario
		product.quantity = sc.nextInt();
		
		// System.out.println(product.name + ", " + product.price + ", " + product.quantity);
		System.out.println(); // pular 1 linha
		System.out.println("Product data: " + product); // chamou o metodo(função) toString do Product.java
		
		// Registrar entrada no estoque
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt(); // 5
		
		product.AddProducts(quantity); // chamando o metodo(função) para adcionar no estoque , irá atualizar a quantidade dentro do objeto product
		
		System.out.println(); // pular 1 linha
		System.out.println("Update data: " + product); // Update data: TV, $ 900.00, 15 units, Total: $ 13500.00
		
		// Registrar saida no estoque
		System.out.println();
		System.out.println("Enter the number of products to be removed in stock: ");
		quantity = sc.nextInt();
		
		product.RemoveProducts(quantity); // 3
		
		System.out.println(); // pular 1 linha
		System.out.println("Update data: " + product); // Update data: TV, $ 900.00, 12 units, Total: $ 10800.00

		sc.close();

	}

}
