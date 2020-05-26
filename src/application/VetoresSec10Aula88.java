package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ProductAula88;

public class VetoresSec10Aula88 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Fazer um programa para ler um número inteiro N e os dados (nome e preço) de N Produtos. 
		// Armazene os N produtos em um vetor. Em seguida, mostrar o preço médio dos produtos.
        // Input:	Output:
		// 3		AVERAGE PRICE = 700.00
		// TV	
		// 900.00	
		// Fryer	
		// 400.00	
		// Stove	
		// 800.00	
		
		int n = sc.nextInt();
		// vetor do tipo referencia, tem que instanciar para carregar o vetor
		ProductAula88[] vect = new ProductAula88[n];
		
		//ler o Product estanciar os objetos e guardar no vetor
		//for (int i=0 ; i<n ; i++) {
		for (int i=0 ; i<vect.length ; i++) { // length é a quantidade de elementos do vetor
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new ProductAula88(name,price);
		}
		
		double sum = 0.0;
		//for (int i=0 ; i<n ; i++) {
		for (int i=0 ; i<vect.length ; i++) {
			sum += vect[i].getPrice();
		}
		//double avg = sum / n;
		double avg = sum / vect.length;
		
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		
		sc.close();

	}

}
