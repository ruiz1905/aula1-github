package application;

import java.util.Locale;
import java.util.Scanner;

import entities.EmployeeExec2Aula68;
import entities.RectangleExec1Aula68;
import entities.StudentExec3Aula68;

public class ProgramExecSec8Aula68 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
/*
        // --------------	EXERCICIO 1 - SEÇÃO 8 AULA 68		
		// Fazer um programa para ler os valores da largura e altura de um retângulo. 
		// Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal. 
		// Usar uma classe como mostrado no projeto ao lado.
		
		// Enter rectangle width and height:
		// 3.00
		// 4.00
		// AREA = 12.00
		// PERIMETER = 14.00
		// DIAGONAL = 5.00
		
		RectangleExec1Aula68 rect = new RectangleExec1Aula68(); 
		
		System.out.println("Enter rectangle width and height: ");
		rect.width = sc.nextDouble(); // 3.00
		rect.height = sc.nextDouble(); // 4.00
		
		System.out.printf("AREA = %.2f%n", rect.area());  // 12.00 
		System.out.printf("PERIMETER = %.2f%n", rect.perimeter()); // 14.00
		System.out.printf("DIAGONAL = %.2f%n", rect.diagonal()); // 5.00
		
		sc.close();
		
        // FIM EXERCICIO 1	
		
	    // --------------	EXERCICIO 2 - SEÇÃO 8 AULA 68	
	    // Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). 
	    // Em seguida, mostrar os dados do funcionário (nome e salário líquido). 
	    // Em seguida, aumentar o salário do funcionário com base em uma porcentagem dada (somente o salário bruto é afetado pela porcentagem)
	    // e mostrar novamente os dados do funcionário. Use a classe projetada abaixo.

	    // Name: Joao Silva
	    // Gross salary: 6000.00
	    // Tax: 1000.00
	    // Employee: Joao Silva, $ 5000.00
	    // Which percentage to increase salary? 10.0
        // Updated data: Joao Silva, $ 5600,00      
	
		EmployeeExec2Aula68 emp = new EmployeeExec2Aula68();
		
		System.out.println("Name: "); // Joao Silva
		emp.name = sc.nextLine();
		System.out.println("Gross salary: "); // 6000.00
		emp.grossSalary = sc.nextDouble();
		System.out.println("Tax: "); // 1000.00
		emp.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + emp);  // Joao Silva, $ 5000.00
		System.out.println();
		
		System.out.print("Which percentage to increase salary? ");  // 10.0
		double percentage = sc.nextDouble(); 
		emp.increaseSalary(percentage);

		System.out.println(); 
		System.out.println("Updated data: " + emp); // Joao Silva, $ 5600.00
		
		sc.close();

		// FIM EXERCICIO 2
*/		
		// --------------	EXERCICIO 3 - SEÇÃO 8 AULA 68
		// Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
		// (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). 
		// Ao final, mostrar qual a nota final do aluno no ano. 
		// Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, 
		// quantos pontos faltam para o aluno obter o mínimo para ser aprovado (que é 60% da nota). 
		// Você deve criar uma classe Student para resolver este problema.
		
		// Entrada:		Saída:
		// Alex Green	FINAL GRADE = 90.00
		// 27.00		PASS
		// 31.00	
		// 32.00	

		// Entrada:		Saída:
		// Alex Green	FINAL GRADE = 52.00
		// 17.00		FAILED
		// 20.00		MISSING 8.00 POINTS
		// 15.00	

		StudentExec3Aula68 student = new StudentExec3Aula68();
		
		student.name   = sc.nextLine();
		student.grade1 = sc.nextDouble();
		student.grade2 = sc.nextDouble();
		student.grade3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade()); // chama o metodo(função) student.finalGrade
		
		if (student.finalGrade() < 60.0) { System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", student.missingPoints()); // MISSING 8.00 POINTS
		}
			else {
				System.out.println("PASS");
		}
		sc.close();

		// FIM EXERCICIO 3
		
	}

}
