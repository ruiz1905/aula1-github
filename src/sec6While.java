import java.util.Scanner;

public class sec6While {

	public static void main(String[] args) {
		// � uma estrutura de controle que repete um bloco de comandos 
		// enquanto uma condi��o for verdadeira.
        // Quando usar: quando n�o se sabe previamente a 
		// quantidade de repeti��es que ser� realizada.
		
		// Regra:
		// V: executa e volta 
		// F: pula fora

		// Problema exemplo:
        // Fazer um programa que l� n�meros inteiros at� que um zero seja lido. 
        // Ao final mostra a soma dos n�meros lidos.
		// ENTRADA:	SAIDA:
		// 5		11
		// 2
		// 4
		// 0
		
		Scanner sc = new Scanner(System.in);
		
		int x    = sc.nextInt();
		int soma = 0;
		
		while (x != 0) {
			soma = soma + x;
			x = sc.nextInt();
		}
		
		System.out.println(soma);
		
		sc.close();
	}

}
