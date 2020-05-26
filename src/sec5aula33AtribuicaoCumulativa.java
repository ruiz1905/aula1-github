import java.util.Locale;
import java.util.Scanner;
		
public class sec5aula33AtribuicaoCumulativa {

	public static void main(String[] args) {
		// Problema exemplo de Operadores de atribui��o cumalitiva
		// Uma operadora de telefonia cobra R$ 50.00 por um plano b�sico que d� direito a 100 minutos de telefone. 
		// Cada minuto que exceder a franquia de 100 minutos custa R$ 2.00. 
		// Fazer um programa para ler a quantidade de minutos que uma pessoa consumiu, da� mostrar o valor a ser pago.
        // ENTRADA:	SAIDA:
		// 22		Valor a pagar: R$ 50.00
		// 103		Valor a pagar: R$ 56.00

		// Operadores de atribui��o cumulativa
		// a += b;	a = a + b;
		// a -= b;	a = a - b;
		// a *= b;	a = a * b;
		// a /= b;	a = a / b;
		// a %= b;	a = a % b;
						
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		int minutos  = sc.nextInt(); 
		double conta = 50.0;
		
		if (minutos > 100) {
		//	conta = conta + (minutos - 100) * 2.0;
			conta += (minutos - 100) * 2.0; // utilizando atribui��o cumulativa
		//   50.0 += ( 103 - 100 ) * 2.0
		//   50.0 +=      3        * 2.0
		//   50.0 +=  6
		//   56.0	
		}

		System.out.printf("Valor da conta = R$ %.2f%n", conta);

		sc.close();
	
	}
	
}


