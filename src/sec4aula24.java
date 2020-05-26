import java.util.Locale;
import java.util.Scanner;

public class sec4aula24 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // para apresentar com ponto (4.5)
		// Scanner - objeto para entrada de dados
		Scanner sc = new Scanner(System.in); // associar objeto Scanner sc ao teclado no modo console
/*		
		String x;
		x = sc.next(); // comando de entrada de dados(texto), a digitação ficará armazenada na variavel x
		System.out.println("Voce digitou: " + x); // digitou Maria - Voce digitou: Maria

		int x; // numero inteiro
		x = sc.nextInt();
		System.out.println("Voce digitou: " + x); // digitou 15 - Voce digitou: 15

		double x; // casas decimais
		x = sc.nextDouble();
		System.out.printf("Voce digitou: %.2f%n", x); // digitou 4.5 - Voce digitou: 4.50

	    // Para ler um caractere
		char x;
		x = sc.next().charAt(0); // charAt(0) lê o 1.o caracter da string
		System.out.println("Voce digitou: " + x ); // digitei Carlos - Voce digitou: C
*/
		// Para ler varios dados na mesma linha
		String x;
		int    y;
		double z;
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		// foi digitado Maria 30 4.5 - varios dados na mesma linha sparados por espaço
		// Dados digitados: Maria 30 4.5
				
		sc.close(); // encerrar o recurso do modo teclado

	}

}
