package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class MembrosEstaticosAula69p1 {
	
	public static final double PI = 3.14159; // membro estatico a palavra "final" define uma constante não pode mudar
	                                         // padrão para constante são letras maiusculas(PI)

	public static void main(String[] args) { // dentro de um metodo static só aceita outros metodos static(circumference e volume)
	
        // Fazer um programa para ler um valor numérico qualquer, e daí mostrar 
		// quanto seria o valor de uma circunferência e do volume de uma esfera
		// para um raio daquele valor. Informar também o valor de PI com duas casas decimais.
		
		// Enter radius: 3.0
		// Circumference: 18.85
		// Volume: 113.10
        // PI value: 3.14

		// RESOLUÇÃO EM 3 VERSÕES
		// •	VERSÃO 1: métodos na própria classe do programa
		// 		•	Nota: dentro de um método estático você não pode chamar membros de 
		//          instância da mesma classe.
		
		// •	Versão 2: classe Calculator com membros de instância
		
		// •	Versão 3: classe Calculator com método estático
		
		Locale.setDefault(Locale.US);
		Scanner sc      = new Scanner(System.in);
		//Calculator calc = new Calculator(); // na versão 2 - qdo os metodos(util.circumference e util.volume) não são static é 
		                                      // obigatorio estanciar o objeto
		// na versão 3 os metodos(util.circumference e util.volume) foram criados como static não sendo necessario estanciar
				
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble(); 
		//double c      = circumference(radius); // versão 1
		//double v      = volume(radius);        // versão 1  
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
	public static double circumference(double radius) { // obrigatorio definir como static, pq o main é static
		return 2.0 * PI * radius; // formula circunferencia
	}
	public static double volume(double radius) { // obrigatorio definir como static, pq o main é static
		return 4.0 * PI * radius * radius * radius / 3.0; // formula volume
	}
	// FIM VERSÂO 1

}
