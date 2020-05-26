package application;

import java.util.Scanner;

public class MatrizesExecSec10Aula97 {

	public static void main(String[] args) {
		// Fazer um programa para ler dois n�meros inteiros M e N, 
		// e depois ler uma matriz de M linhas por N colunas contendo n�meros inteiros, 
		// podendo haver repeti��es. Em seguida, ler um n�mero inteiro X que pertence � matriz. 
		// Para cada ocorr�ncia de X, mostrar os valores � esquerda, acima, � direita e abaixo de X, quando houver, conforme exemplo.
		
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt(); // 3
		int n = sc.nextInt(); // 4
		int[][] mat = new int[m][n];
		
		// 10 8 15 12
		// 21 11 23 8
		// 14 5 13 19
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int x = sc.nextInt(); // 8
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":"); // 0,1   /   1,3
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]); // 10   /   23
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);   // n�o tem   /  12
					}
					if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]); // 15  / n�o tem
					}
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);  // 11  /  19
					}
				}
			}
		}
		
		sc.close();
	}

}
