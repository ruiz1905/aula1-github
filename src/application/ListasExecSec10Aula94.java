package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.EmployeeExecAula94;

public class ListasExecSec10Aula94 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<EmployeeExecAula94> list = new ArrayList<>();
		
		// PART 1 - READING DATA:
		// Fazer um programa para ler um n�mero inteiro N e depois os dados (id, nome e salario) de N funcion�rios. 
		// N�o deve haver repeti��o de id.
		
		System.out.print("How many employees will be registered? "); // Quantos funcion�rios ser�o registrados?
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Employee #" + i + ": ");

			System.out.print("Id: ");
			int id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.print("Id already taken. Try again: "); // Eu j� peguei. Tente novamente:
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new EmployeeExecAula94(id, name, salary));
		}
		
		// PART 2 - UPDATING SALARY OF GIVEN EMPLOYEE:
		// Em seguida, efetuar o aumento de X por cento no sal�rio de um determinado funcion�rio. 
		// Para isso, o programa deve ler um id e o valor X. Se o id informado n�o existir, 
		// mostrar uma mensagem e abortar a opera��o. 
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: "); // Digite o ID do funcion�rio que ter� aumento salarial
		int id = sc.nextInt();
		EmployeeExecAula94 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		// PART 3 - LISTING EMPLOYEES:
		// Ao final, mostrar a listagem atualizada dos funcion�rios, 
		// conforme exemplos.		
		
		System.out.println();
		System.out.println("List of employees:");
		for (EmployeeExecAula94 obj : list) {
			System.out.println(obj);
		}
				
		sc.close(); 

	}
	public static boolean hasId(List<EmployeeExecAula94> list, int id) {
		EmployeeExecAula94 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}	
}
