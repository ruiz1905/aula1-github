import java.util.Locale;
import java.util.Scanner;

public class sec6aula53_do_while {

	public static void main(String[] args) {
		
		//Estrutura repetitiva "faça-enquanto"
        //  Menos utilizada, mas em alguns casos se encaixa melhor ao problema.
        //  O bloco de comandos executa pelo menos uma vez, pois a condição é verificada no final.
		
		// Sintaxe / regra: V:volta   F:pula fora
        // do {
        //    comando 1
        //    comando 2
        // } while ( condição );
		
        // Problema exemplo:
        // Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente em Fahrenheit. 
		// Perguntar se o usuário deseja repetir (s/n). Caso o usuário digite "s", repetir o programa.
        
		// Formula: F = 9C / 5 + 32
		
		// EXEMPLO:
		// Digite a temperatura em Celsius: 30.0 
		// Equivalente em Fahrenheit: 86.0 
		// Deseja repetir (s/n)? s
		// Digite a temperatura em Celsius: 21.0 
		// Equivalente em Fahrenheit: 69.8 
		// Deseja repetir (s/n)? s
		// Digite a temperatura em Celsius: -10.5 
		// Equivalente em Fahrenheit: 13.1 
		// Deseja repetir (s/n)? n
		
		 Locale.setDefault(Locale.US); 
		 Scanner sc = new Scanner(System.in);

		 char resp; 
		 do {  // executa pelo menos uma vez
			 System.out.print("Digite a temperatura em Celsius: ");
			 double C = sc.nextDouble(); 
			 double F = 9.0 * C / 5.0 + 32.0;
			 
			 System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
			 
			 System.out.print("Deseja repetir (s/n)? ");
			 resp = sc.next().charAt(0);
		
		 } while (resp != 'n'); // repete enquanto resp diferente de n - condição é verificada no final

		 sc.close();




	}

}
