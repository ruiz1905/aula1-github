package application;

import java.util.Locale;
import java.util.Scanner;

import entities.RentExecSec10Aula88;

public class VetoresExecSec10Aula88 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// entities
		RentExecSec10Aula88[] vect = new RentExecSec10Aula88[10];
		
		System.out.println("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) { 
			System.out.println(); 
			System.out.println("Rent #" + i + ":"); 
			
			System.out.print("Name: "); 
			sc.nextLine();
     		String name = sc.nextLine(); 
     		
     		System.out.print("Email: "); 
     		String email = sc.nextLine(); 
     		
     		System.out.print("Room: "); 
     		int room = sc.nextInt();
     		
     		vect[room] = new RentExecSec10Aula88(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms");
		for (int i=0; i<vect.length; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
		//		Busy rooms
		//		1: Marco Antonio , marco@gmail.com 
		//		5: Maria Green , maria@gmail.com 
		//		8: Alex Brown , alex@gmail.com 
			}
		}

		sc.close();
	}

}
