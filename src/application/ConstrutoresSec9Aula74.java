package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ConstrutoresSec9Aula74 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Product product = new Product();
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		//product.name = sc.nextLine();
		String name = sc.nextLine();     // criar uma variavel temporaria
		
		System.out.print("Price: ");
		//product.price = sc.nextDouble();
		double price = sc.nextDouble();  // criar uma variavel temporaria
		
		System.out.print("Quantity in stock: ");
		//product.quantity = sc.nextInt();
		int quantity = sc.nextInt();     // criar uma variavel temporaria
		
		// apos a digita��o dos 3 valores instanciar 
		Product product = new Product(name, price, quantity);
		
		System.out.println();
		System.out.println("Product data: " + product);

		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		//int quantity = sc.nextInt();
		quantity = sc.nextInt(); // aula 74
		product.AddProducts(quantity);

		System.out.println();
		System.out.println("Updated data: " + product);

		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.RemoveProducts(quantity);

		System.out.println();
		System.out.println("Updated data: " + product);

		sc.close();

	}

}
