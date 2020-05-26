import java.util.Locale;
import java.util.Scanner;

public class sec6debug {

	public static void main(String[] args) {
		// Como executar o debug do Eclipse

		// •	Para marcar uma linha de breakpoint: Run -> Toggle Breakpoint
		// •	Para iniciar o debug: Botão direito na classe -> Debug as -> Java Application
		// •	Para executar uma linha: F6
		// •	Para interromper o debug:

		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);

		// ler a largura, comprimento e valor do metro quadrado e mostrar a area e preço
		
		double largura       = sc.nextDouble(); 
		double comprimento   = sc.nextDouble(); 
		double metroQuadrado = sc.nextDouble();

		double area  = largura * comprimento; 
		double preco = area * metroQuadrado;

		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);

		sc.close();

	}

}
