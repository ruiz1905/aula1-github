import java.util.Locale;
import java.util.Scanner;

public class sec5exercicio {

	public static void main(String[] args) {
/*		
		// EXERCICIO 1 - Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/cond01.java 
		// Fazer um programa para ler um número inteiro, 
		// e depois dizer se este número é negativo ou não. 
		// ENTRADA:		SAIDA:
		// -10			NEGATIVO
		// 8			NAO NEGATIVO
		// 0			NAO NEGATIVO
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if (n < 0) {
			System.out.println("NEGATIVO");
		}	
		else {
			System.out.println("NAO NEGATIVO");
		}
		
		sc.close(); // FIM EXEC 1

		// EXERCICIO 2 - Correção:  https://github.com/acenelio/nivelamento-java/blob/master/src/cond02.java 
		// Fazer um programa para ler um número inteiro 
		// e dizer se este número é par ou ímpar. 
		// ENTRADA:		SAIDA:
		// 12			PAR
		// -27			IMPAR
		// 0			PAR

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();

		if (N % 2 == 0) {  // % - operador "mod" se N dividido por 2 e o resto for igual a zero é par
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}

		sc.close(); // FIM EXEC 2
	 
       
		// EXERCICIO 3 - Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1044.java 
		// Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", 
		// indicando se os valores lidos são múltiplos entre si. 
		// Atenção: os números devem poder ser digitados em ordem crescente ou decrescente. 
		// ENTRADA:		SAIDA:
		// 6 24			Sao Multiplos
		// 6 25			Nao Sao Multiplos
		// 24 6			Sao Multiplos
				
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		if (A % B == 0 || B % A == 0) { // % - resto da divisão   || - ou(or) 
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos");
		}

		sc.close(); // FIM EXEC 3 
		
		// EXERCICIO 4 - Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1046.java 
		// Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, 
		// sabendo que o mesmo pode começar em um dia e terminar em outro, 
		// tendo uma duração mínima de 1 hora e máxima de 24 horas. 
        // ENTRADA:		SAIDA:
		// 16 2 		O JOGO DUROU 10 HORA(S) 
		// 0 0			O JOGO DUROU 24 HORA(S) 
		// 2 16 		O JOGO DUROU 14 HORA(S) 
		
		Scanner sc = new Scanner(System.in);

		int horaInicial = sc.nextInt();
		int horaFinal   = sc.nextInt();
		int duracao;

		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
		}
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

		sc.close(); // FIM EXEC 4

		// EXERCICIO 5 - Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1038.java 
		// Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. 
		// A seguir, calcule e mostre o valor da conta a pagar
		// CODIGO	ESPECIFICACAO	PREÇO
		// 1		Cachorro Quente	R$ 4.00
		// 2		X-Salada		R$ 4.50
		// 3		X-Bacon			R$ 5.00
		// 4 		Torrada Simples R$ 2.00
		// 5 		Refrigerante	R$ 1.50
		
		// ENTRADA:	SAIDA:
		// 3 2 		Total: R$ 10.00 
		// 2 3 		Total: R$ 13.50
		
		Scanner sc = new Scanner(System.in);

		int    codigo     = sc.nextInt();
		int    quantidade = sc.nextInt();
		double total;

		if (codigo == 1) {
			total = quantidade * 4.0;
		}
		else if (codigo == 2) {
			total = quantidade * 4.5;
		}
		else if (codigo == 3) {
			total = quantidade * 5.0;
		}
		else if (codigo == 4) {
			total = quantidade * 2.0;
		}
		else {
			total = quantidade * 1.5;
		}
		System.out.printf("Total: R$ %.2f%n", total);

		sc.close(); // FIM EXEC 5
		
		// EXERCICIO 6 - Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1037.java   
        // Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo 
		// em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra.
		// Obviamente se o valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”. 
	    // ENTRADA:	SAIDA:
	    // 25.01 	Intervalo (25,50] 
		// 25.00 	Intervalo [0,25] 
		// 100.00 	Intervalo (75,100] 
		// -25.02 	Fora de intervalo 
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double numero = sc.nextDouble();

		if (numero < 0.0 || numero > 100.0) {

			System.out.println("Fora de intervalo");
		}
		else if (numero <= 25.0) {
			System.out.println("Intervalo [0,25]");
		}
		else if (numero <= 50.0) {
			System.out.println("Intervalo (25,50]");
		}
		else if (numero <= 75.0) {
			System.out.println("Intervalo (50,75]");
		}		
		else {
			System.out.println("Intervalo (75,100]");
		}
		
		sc.close(); // FIM EXEC 6

        // EXERCICIO 7 - Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1041.java 
		// Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0). 
		// Se o ponto estiver na origem, escreva a mensagem “Origem”. 
		// Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação. 
	    // Entrada: Saída:   
		// 4.5 -2.2 Q4       
		// 0.1 0.1  Q1 
		// 0.0 0.0  Origem 
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double x = sc.nextDouble();
		double y = sc.nextDouble();

		if (x == 0.0 && y == 0.0) {    // && = and
			System.out.println("Origem");
		}
		else if (x == 0.0) {
			System.out.println("Eixo Y");
		}
		else if (y == 0.0) {
			System.out.println("Eixo X");
		}
		else if (x > 0.0 && y > 0.0) {
			System.out.println("Q1");
		}
		else if (x < 0.0 && y > 0.0) {
			System.out.println("Q2");
		}
		else if (x < 0.0 && y < 0.0) {
			System.out.println("Q3");
		}
		else {
			System.out.println("Q4");
		}

		sc.close(); // FIM EXEC 7
*/
		// EXERCICIO 8 - Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1051.java 
		// Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, 
		// pois sabem que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população,
		// sem qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$. 
		// Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. 
		// Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo. 
	
		// Renda							Imposto de Renda
		// de 0.0 a R$ 2000.00				Isento
		// de R$ 2000.01 ate R$ 3000.00		8%
		// de R$ 3000.01 ate R$ 4500.00		18%
		// acima de 4500.00					28%
		
		// ENTRADA:		SAIDA:
		// 3002.00 		R$ 80.36
		// 1701.12 		Isento
		// 4520.00 		R$ 355.60 
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();
		double imposto;

		if (salario <= 2000.0) {
			imposto = 0.0;
		}
		else if (salario <= 3000.0) {
			imposto = (salario - 2000.0) * 0.08;
		}
		else if (salario <= 4500.0) {
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08; // primiero a multiplicação depois a soma
			// 4520.0 - 4500,00 = 20 * 0.28 = 5.6
			// 1500.0 * 0.18 = 270.0
			// 1000.0 * 0.08 = 80
			// 5.6 + 270.0 + 80 = 355.60
		}
		if (imposto == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f%n", imposto);
		}

		sc.close();


		
	}

}
