package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		// Se��o 8 aula 62 - RESOLVENDO UM PROBLEMA SEM ORIENTA��O A OBJETOS
		// Fazer um programa para ler as medidas dos lados de dois tri�ngulos X e Y (suponha medidas v�lidas). 
		// Em seguida, mostrar o valor das �reas dos dois tri�ngulos e dizer qual dos dois tri�ngulos possui a maior �rea.
		// A f�rmula para calcular a �rea de um tri�ngulo a partir das medidas de seus lados a, b e c � a seguinte (f�rmula de Heron):
        // Exemplo:
		// Enter the measures of triangle X:
		// 3.00
		// 4.00
		// 5.00
		// Enter the measures of triangle Y:
		// 7.50
		// 4.50
		// 4.02
		// Triangle X area: 6.0000
		// Triangle Y area: 7.5638
        // Larger area: Y
/*		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);

		double xA, xB, xC, yA, yB, yC;

		System.out.println("Enter the measures of triangle X: ");
		xA = sc.nextDouble(); 
		xB = sc.nextDouble(); 
		xC = sc.nextDouble();
		System.out.println("Enter the measures of triangle Y: ");
		yA = sc.nextDouble(); 
		yB = sc.nextDouble(); 
		yC = sc.nextDouble();

		// area = raiz quadrada p * (p - a)(p - b)(p - c)    onde p = a + b + c / 2
		double p = (xA + xB + xC) / 2.0; 
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

		p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);

		if (areaX > areaY) {
		   System.out.println("Larger area: X");
		}
		else {
		   System.out.println("Larger area: Y");
		}

		sc.close();
*/
		// Se��o 8 Aula 63 - RESOLVENDO O MESMO PROBLEMA COM ORIENTA��O A OBJETOS
		// Criando uma classe com tr�s atributos para representar melhor o tri�ngulo
		
		// Classe : �	Classe: � a defini��o do tipo
		// �	� um tipo estruturado que pode conter (membros):
		// 		�	Atributos (dados / campos)
		// 		�	M�todos (fun��es / opera��es)

		// �	A classe tamb�m pode prover muitos outros recursos, tais como:
		// 		�	Construtores
		// 		�	Sobrecarga
		// 		�	Encapsulamento
		// 		�	Heran�a
		// 		�	Polimorfismo

		// �	Exemplos:
		// 		�	Entidades: Produto, Cliente, Triangulo
		// 		�	Servi�os: ProdutoService, ClienteService, EmailService, StorageService
		// 		�	Controladores: ProdutoController, ClienteController
		// 		�	Utilit�rios: Calculadora, Compactador
		// 		�	Outros (views, reposit�rios, gerenciadores, etc.)
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);

		//double xA, xB, xC, yA, yB, yC;
        Triangle x, y;
       
        // instanciar o objeto Triangle  
        // �	Objetos: s�o inst�ncias da classe
        x = new Triangle();
        y = new Triangle();
        
		System.out.println("Enter the measures of triangle X: ");
		//xA = sc.nextDouble(); 
		//xB = sc.nextDouble(); 
		//xC = sc.nextDouble();
		//System.out.println("Enter the measures of triangle Y: ");
		//yA = sc.nextDouble(); 
		//yB = sc.nextDouble(); 
		//yC = sc.nextDouble();

		x.a = sc.nextDouble(); // 3.0
		x.b = sc.nextDouble(); // 4.0
		x.c = sc.nextDouble(); // 5.0
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble(); // 7.5
		y.b = sc.nextDouble(); // 4.5
		y.c = sc.nextDouble(); // 4.02

		// area = raiz quadrada p * (p - a)(p - b)(p - c)    onde p = a + b + c / 2
		// double p = (xA + xB + xC) / 2.0; 
		// double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		
		// foi criado o metodo(fun��o) Triangle area para calcular 
		//double p = (x.a + x.b + x.c) / 2.0; 
		//double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
        double areaX = x.area(); // chamando o metodo area para calcular o triangulo x
		
		//p = (yA + yB + yC) / 2.0;
		//double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		//p = (y.a + y.b + y.c) / 2.0;
		//double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
        double areaY = y.area(); // chamando o metodo area para calcular o triangulo y
        
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);

		if (areaX > areaY) {
		   System.out.println("Larger area: X"); // 6.0000
		}
		else {
		   System.out.println("Larger area: Y"); // 7.5638
		}

		sc.close();

	}

}
