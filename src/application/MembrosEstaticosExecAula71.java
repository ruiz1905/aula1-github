package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverterAula71;

public class MembrosEstaticosExecAula71 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		// Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por
		// uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda
		// que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter 
		// para ser responsável pelos cálculos.
		
		// Exemplo:
		// What is the dollar price? 3.10            // qual o preço do dolar?
		// How many dollars will be bought? 200.00   // quantos dolar voce vai comprar?
		// Amount to be paid in reais = 657.20       // valor pago em reais

		System.out.print("What is the dollar price? ");  // 3.10
		double dollarPrice = sc.nextDouble(); 
		
		System.out.print("How many dollars will be bought? ");  // 200.00
		double amount = sc.nextDouble();
		
		double result = CurrencyConverterAula71.dollarToReal(amount, dollarPrice);
		System.out.printf("Amount to be paid in reais = %.2f%n", result); // 657.20

		sc.close();

	}

}
