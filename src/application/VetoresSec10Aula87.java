package application;

import java.util.Locale;
import java.util.Scanner;

public class VetoresSec10Aula87 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// Fazer um programa para ler um número inteiro N e a altura de N pessoas. 
		// Armazene as N alturas em um vetor. Em seguida, mostrar a altura média dessas pessoas.	
		
		// Input:	Output:
		//   3	    AVERAGE HEIGHT = 1.69
		// 1.72	
		// 1.56	
		// 1.80	

		int n = sc.nextInt();	// 3	
		double[] vect = new double[n]; // "[]" declarando um vetor
		
		// criar um laço para alimentar o array
		for (int i=0; i<n; i++) {
			vect[i] = sc.nextDouble(); //  1.72 , 1.56 , 1.80
		}
		
		double sum = 0.0;
		
		// leitura do array
		for (int i=0; i<n; i++) {
			sum += vect[i];
		}
		double avg = sum / n;
		
		System.out.printf("AVERAGE HEIGHT: %.2f%n", avg); // 1.69
		
		sc.close();
	}

}
