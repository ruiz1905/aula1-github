import java.util.Locale;
import java.util.Scanner;

public class sec4exercicio {

	public static void main(String[] args) {
/*
		// •	https://www.youtube.com/watch?v=Ah1Y6d6deq0
		// Fazer um programa para ler as medidas da largura e comprimento de um terreno
		// retangular com uma casa decimal, bem como o valor do metro quadrado do terreno
		// com duas casas decimais. Em seguinda, o programa deve mostrar o valor da area do
		// terreno, bem como o valor do preço do terreno, ambos com duas casas decimais,
		// conforme exemplo;
		// entrada: 10.0 / 30.0 / 200.0
		// saida : area = 300.00 / preco = 60000.00
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		double largura       = sc.nextDouble(); // 10.0
		double comprimento   = sc.nextDouble(); // 30.0
		double metroQuadrado = sc.nextDouble(); // 200.00
		
		double area  = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.println("Area = " + area);   // 300.0
		System.out.println("Preco = " + preco); // 60000.0
		
		System.out.printf("Area = %.2f%n", area);   // 300.00 , utilizar o %.2f%n para casa decimal
		System.out.printf("Preco = %.2f%n", preco); // 60000.00
		
		sc.close();

		//=========== EXERCICIO 1 - Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1003.java
		// Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números
		// com uma mensagem explicativa, conforme exemplos.
		// Entrada: 10 30   Saida: 40
		// Entrada: -30 10  Saida: -20
		// Entrada: 0 0     Saida: 0
		
		//Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		int A    = sc.nextInt(); // 10 
		int B    = sc.nextInt(); // 30
		int soma = A + B;
		System.out.println("Soma = " + soma); // 40
				 
		sc.close();	 // Fim exec1

		// =========== EXERCICIO 2 - Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1002.java
		// Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo
		// com quatro casas decimais conforme exemplos.
		// Fórmula da área: area = π . raio2 
		// Considere o valor de π = 3.14159
		// exemplos:
		// Entrada: Saida:
		// 2.00     A=12.5664
		// 100.64	A=31819.3103
		// 150.00	A=70685.7750		

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		double R, A, pi = 3.14159;
		
		R = sc.nextDouble(); // 150.00

	    A = pi * R * R;      // 3.14159 * 150.00 * 150.00 = 70685.7750
		
	    System.out.printf("A=%.4f%n", A); 
		
		sc.close(); // Fim exec 2

		// =========== EXERCICIO 3 - Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1007.java
		// Fazer um programa para ler quatro valores inteiros A, B, C e D. 
		// A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D 
		// segundo a fórmula: DIFERENCA = (A * B - C * D).
		// Entrada:	Saida:
		// 5,6,7,8	DIFERENCA -26
		// 5,6,-7,8	DIFERENCA 86
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		int a, b, c, d, dif ;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		dif= (a * b - c * d);
		System.out.println("DIFERENCA = " + dif);
		
		sc.close(); // Fim exec 3

		// =========== EXERCICIO 4 - Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1008.java
		// Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas,
		// o valor que recebe por hora e calcula o salário desse funcionário. 
		// A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
        
		// Entrada:	Saida:
		// 25		NUMBER	=	25
		// 100		SALARY	=	U$	550.00
		// 5.50
        // ==================================
		// 1		NUMBER	=	1
		// 200		SALARY	=	U$	4100.00
		// 20.50
		// ==================================
		// 6		NUMBER	=	6
		// 145		SALARY	=	U$	2254.75
		// 15.55
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		int nfunc    = sc.nextInt();
		int nhrs     = sc.nextInt();
		double vlhrs = sc.nextDouble();
		
		double sal   = nhrs * vlhrs;
		
		System.out.println("NUMBER = " + nfunc);
		System.out.printf("SALARY = %.2f%n" , sal );
		
		sc.close(); // Fim exec 4
		
		// =========== EXERCICIO 5 - Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1010.java
		// Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, 
		// o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. 
		// Calcule e mostre o valor a ser pago.
		
		// Entrada:		Saida:
		// 12 1 5.30	VALOR A PAGAR: R$ 15.50
		// 16 2 5.10
		// =========================================
		// 13 2 15.30	VALOR A PAGAR: R$ 51.40
		// 161 4 5.20
        // =========================================
		// 1 1 15.10	VALOR A PAGAR: R$ 30.20
		// 2 1 15.10
		// =========================================
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		int cpc1    = sc.nextInt();
		int npc1    = sc.nextInt();
		double vpc1 = sc.nextDouble();
		
		int cpc2    = sc.nextInt();
		int npc2    = sc.nextInt();
		double vpc2 = sc.nextDouble();
		
		double vpgt = npc1 * vpc1 + npc2 * vpc2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", vpgt);
		
		sc.close(); // Fim exec 5
*/		
		// =========== EXERCICIO 6 - Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1012.java
		// Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
		// a)	a área do triângulo retângulo que tem A por base e C por altura.
	    // b)	a área do círculo de raio C. (pi = 3.14159)
	    // c)	a área do trapézio que tem A e B por bases e C por altura.
	    // d)	a área do quadrado que tem lado B.
	    // e)	a área do retângulo que tem lados A e B.
		
		// Entrada:			Saida:
        // 3.0 4.0 5.2  	TRIANGULO: 7.800
		//              	CIRCULO: 84.949
		//             		TRAPEZIO: 18.200
		//              	QUADRADO: 16.000
		//              	RETANGULO: 12.000
        //====================================
		// 12.7 10.4 15.2	TRIANGULO: 96.520
		//                  CIRCULO: 725.833
		//                  TRAPEZIO: 175.560
		//                  QUADRADO: 108.160
		//                  RETANGULO: 132.080
        //=====================================
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 

		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		double pi = 3.14159;
		
		double triangulo = A * C / 2.0;
		double circulo   = pi * C * C;
		double trapezio  = (A + B) / 2.0 * C;
		double quadrado  = B * B;
		double retangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO..: %.3f%n", circulo);
		System.out.printf("TRAPEZIO.: %.3f%n", trapezio);
		System.out.printf("QUADRADO.: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
		
		sc.close(); // Fim exec 6
		
	}
}
