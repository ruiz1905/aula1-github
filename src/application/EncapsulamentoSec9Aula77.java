package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class EncapsulamentoSec9Aula77 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Product product = new Product();
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");  // TV
		//product.name = sc.nextLine();
		String name = sc.nextLine();     // criar uma variavel temporaria
		
		System.out.print("Price: "); // 900.00
		//product.price = sc.nextDouble();
		double price = sc.nextDouble();  // criar uma variavel temporaria
						
		Product product = new Product(name, price);
		
		product.setName("Computer"); // encapsulamento aula 77	
		System.out.println("Update name: " + product.getName()); // Update name: Computer
		
		product.setPrice(1200.00);
		System.out.println("Update price: " + product.getPrice()); // Update price: 1200.0
		
		System.out.println();
		System.out.println("Product data: " + product); // TV, $ 900.00, 0 units, Total: $ 0.00
		                                                // Computer, $ 900.00, 0 units, Total: $ 0.00 - aula 77

		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		//int quantity = sc.nextInt(); // 10
		int quantity = sc.nextInt();   // aula 74
		product.AddProducts(quantity);

		System.out.println();
		System.out.println("Updated data: " + product); // TV, $ 900.00, 10 units, Total: $ 9000.00

		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt(); // 3
		product.RemoveProducts(quantity);

		System.out.println();
		System.out.println("Updated data: " + product); // TV, $ 900.00, 7 units, Total: $ 6300.00

		sc.close();

	}

}
