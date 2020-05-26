import java.util.Scanner;

public class sec6aula48EstruturaFOR {

	public static void main(String[] args) {
/*		
		// Estrutura repetitiva "para" (for)
		// É uma estrutura de controle que repete um bloco de comandos para um certo intervalo de valores.
        // Quando usar: quando se sabe previamente a quantidade de repetições, ou o intervalo de valores.
        
		// Por exemplo:
        // Fazer um programa que lê um valor inteiro N e depois N números inteiros. 
		// Ao final, mostra a soma dos N números lidos
        // ENTRADA:	SAIDA:
		// 3		11
		// 5
		// 2
		// 4
		
		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		int N    = sc.nextInt();
			
		//for ( início ; condição ; incremento) {} // início-Executa somente na primeira vez
	    //                                            condição-V:Executa e volta  F:pula fora
		//                                            incremento-Executa toda vez depois de voltar
		//                  
		
		for (int i=0; i<N; i++) {
			int x = sc.nextInt();
			soma  = soma + x;
		}	
		
		System.out.println(soma);
		
		sc.close();

		// Importante
		// Perceba que a estrutura "para" é ótima para se fazer uma repetição baseada em uma CONTAGEM:
		
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i<5; i++) {
			System.out.println("Valor de i: " + i);
			// Valor de i: 0
			// Valor de i: 1
			// Valor de i: 2
			// Valor de i: 3
			// Valor de i: 4
		}
		
		sc.close();
*/
		//Contagem regressiva
		Scanner sc = new Scanner(System.in);
		
		for (int i=4; i>=0; i--) {
			System.out.println("Valor de i: " + i);
			// Valor de i: 4
			// Valor de i: 3
			// Valor de i: 2
			// Valor de i: 1
			// Valor de i: 0
		}
		sc.close();
	}
}
