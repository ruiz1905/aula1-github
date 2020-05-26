import java.util.Scanner;

public class sec6exercicioWhile {

	public static void main(String[] args) {
/*		
		// EXERCICIO 1 - Corre��o: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1114.java 
		// Escreva um programa que repita a leitura de uma senha at� que ela seja v�lida. 
		// Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida". 
		// Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" 
		// e o algoritmo encerrado. Considere que a senha correta � o valor 2002.
		// ENTRADA:	SAIDA:
		// 2200 	Senha Invalida
		// 1020		Senha Invalida
		// 2022		Senha Invalida
		// 2002 	Acesso Permitido
		 
		Scanner sc = new Scanner(System.in);

		int senha = sc.nextInt();

		while (senha != 2002) {
			System.out.println("Senha Invalida");
			senha = sc.nextInt();
		}
		System.out.println("Acesso Permitido");

		sc.close(); // FIM EXEC 1

		// EXERCICIO 2 - Corre��o: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1115.java 
		// Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema cartesiano. 
		// Para cada ponto escrever o quadrante a que ele pertence.
		// O algoritmo ser� encerrado quando pelo menos uma de duas coordenadas
		// for NULA (nesta situa��o sem escrever mensagem alguma).
		// ENTRADA:	SAIDA:
		// 2 2		primeiro
		// 3 -2		quarto
		// -8 -1	terceiro
		// -7 1     segundo
		// 0 2		
		
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			}
			else if (x < 0 && y > 0) {
				System.out.println("segundo");
			}
			else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			}
			else {
				System.out.println("quarto");
			}
			x = sc.nextInt();
			y = sc.nextInt();
        
			sc.close(); // FIM EXEC 2
		}	
*/	
		// EXERCICIO 3 - Corre��o: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1134.java 
		// Um Posto de combust�veis deseja determinar qual de seus produtos tem a prefer�ncia de seus clientes. 
		// Escreva um algoritmo para ler o tipo de combust�vel abastecido 
		// (codificado da seguinte forma: 1.�lcool 2.Gasolina 3.Diesel 4.Fim). 
		// Caso o usu�rio informe um c�digo inv�lido (fora da faixa de 1 a 4) deve ser solicitado um novo c�digo 
		// (at� que seja v�lido). O programa ser� encerrado quando o c�digo informado for o n�mero 4. 
		// Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combust�vel, 
		// conforme exemplo.
		// ENTRADA:	SAIDA:
		// 8 		MUITO OBRIGADO
		// 1		Alcool: 1
		// 7		Gasolina: 2
		// 2		Diesel: 0
		// 2
		// 4 
		
		Scanner sc = new Scanner(System.in);

		int alcool   = 0;
		int gasolina = 0;
		int diesel   = 0;

		int tipo = sc.nextInt();

		while (tipo != 4) {
			if (tipo == 1) {
				alcool = alcool + 1;
			}
			else if (tipo == 2) {
				gasolina = gasolina + 1;
			}
			else if (tipo == 3) {
				diesel = diesel + 1;
			}
			tipo = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		sc.close(); // FIM EXEC 3

	}
}
