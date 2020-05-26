import java.util.Scanner;

public class sec5aula38expressaoTernaria {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*
		double preco = 34.5; 
		double desconto;
		if (preco < 20.0) { 
			desconto = preco * 0.1;
		}
		else {
			desconto = preco * 0.05;
		}
        
		System.out.println(desconto);
		
		sc.close();
		*/
		
		double preco = 34.5; 
		double desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;
		// expressão Ternaria             verdadeiro      falso    34.5 * 0.05 = 1.725
		System.out.println(desconto);
		
		sc.close();

	}

}
