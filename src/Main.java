import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		String nome  = "Maria"; 
		int idade    =  31; 
		double renda = 4000.0;
		double x     = 10.35784;
		System.out.println(x);
		System.out.printf("%.2f%n", x); // f=formatação - 2f=duas casas decimais (10,36)
		System.out.printf("%.4f%n", x); // 4f=quatro casas decimais (10,3578)
		Locale.setDefault(Locale.US);   // Locale é uma classe do JDK,
		                                // para utilizar tem que dar o comando import no inicio(java.util.Locale)
		System.out.printf("%.4f%n", x); // 10.3578
		
		System.out.println("RESULTADO = " + x + " METROS"); // RESULTADO = 10.35784 METROS
		
		System.out.printf("RESULTADO = %.2f metros%n", x); // RESULTADO = 10.36 metros
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		//%f = ponto flutuante - %d = inteiro - %s = texto - %n = quebra de linha
		//Maria tem 31 anos e ganha R$ 4000.00 reais


	}

}
