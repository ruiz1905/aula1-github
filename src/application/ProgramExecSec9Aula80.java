package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class ProgramExecSec9Aula80 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);  // separador de decimais
		Scanner sc = new Scanner(System.in);
		
		Account account;

		System.out.print("Enter account number: "); // 8532 --> numero da conta
		int number = sc.nextInt();
		
		System.out.print("Enter account holder: "); // Alex Green  --> nome do titular da conta
		sc.nextLine();  // quebra de linha
		
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? "); // y --> existe um deposito inicial ?
		
		char response = sc.next().charAt(0); // faz a leitura do caracter
		if (response == 'y') {
			System.out.print("Enter initial deposit value: "); // 500.00  --> valor do deposito inicial
			double initialDeposit = sc.nextDouble();
			// instancia a conta utilizando o construtor de 3 argumentos
			account = new Account(number, holder, initialDeposit);
		}
		else {
			// instancia a conta utilizando o construtor de 2 argumentos
			account = new Account(number, holder);
		}
		
		System.out.println(); // pular a linha
		System.out.println("Account data:");
		System.out.println(account); // Account 8532, Holder: Alex Green, Balance: $ 500.00
		
		System.out.println(); 
		System.out.print("Enter a deposit value: "); // 200.00  --> insira um valor de deposito
		double depositValue = sc.nextDouble();
		
		account.deposit(depositValue); // chama o metodo para o deposito
		System.out.println("Updated account data:");
		System.out.println(account);  // Account 8532, Holder: Alex Green, Balance: $ 700.00
		
		System.out.println();
		System.out.print("Enter a withdraw value: "); // 300.00 --> digite um valor de retirada
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated account data:");
		System.out.println(account); // Account 8532, Holder: Alex Green, Balance: $ 395.00
		
		sc.close();

	}
}
