package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class MembrosEstaticosAula69p1 {
	
	public static final double PI = 3.14159; // membro estatico a palavra "final" define uma constante n�o pode mudar
	                                         // padr�o para constante s�o letras maiusculas(PI)

	public static void main(String[] args) { // dentro de um metodo static s� aceita outros metodos static(circumference e volume)
	
        // Fazer um programa para ler um valor num�rico qualquer, e da� mostrar 
		// quanto seria o valor de uma circunfer�ncia e do volume de uma esfera
		// para um raio daquele valor. Informar tamb�m o valor de PI com duas casas decimais.
		
		// Enter radius: 3.0
		// Circumference: 18.85
		// Volume: 113.10
        // PI value: 3.14

		// RESOLU��O EM 3 VERS�ES
		// �	VERS�O 1: m�todos na pr�pria classe do programa
		// 		�	Nota: dentro de um m�todo est�tico voc� n�o pode chamar membros de 
		//          inst�ncia da mesma classe.
		
		// �	Vers�o 2: classe Calculator com membros de inst�ncia
		
		// �	Vers�o 3: classe Calculator com m�todo est�tico
		
		Locale.setDefault(Locale.US);
		Scanner sc      = new Scanner(System.in);
		//Calculator calc = new Calculator(); // na vers�o 2 - qdo os metodos(util.circumference e util.volume) n�o s�o static � 
		                                      // obigatorio estanciar o objeto
		// na vers�o 3 os metodos(util.circumference e util.volume) foram criados como static n�o sendo necessario estanciar
				
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble(); 
		//double c      = circumference(radius); // vers�o 1
		//double v      = volume(radius);        // vers�o 1  
		//double c      = calc.circumference(radius); // versao 2
		//double v      = calc.volume(radius);        // versao 2
		double c      = Calculator.circumference(radius); // versao 3 coloca-se a propria classe 
		double v      = Calculator.volume(radius);        // versao 3
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		//System.out.printf("PI value: %.2f%n", PI);  // versao 1
		//System.out.printf("PI value: %.2f%n", calc.PI); // versao 2
		System.out.printf("PI value: %.2f%n", Calculator.PI); // versao 3
		
		sc.close();
	}
	public static double circumference(double radius) { // obrigatorio definir como static, pq o main � static
		return 2.0 * PI * radius; // formula circunferencia
	}
	public static double volume(double radius) { // obrigatorio definir como static, pq o main � static
		return 4.0 * PI * radius * radius * radius / 3.0; // formula volume
	}
	// FIM VERS�O 1

}
