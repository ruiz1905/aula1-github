import java.util.Scanner;

public class sec4aula25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
/*		
		String s1, s2, s3;
		
		// Para ler um texto ATÉ A QUEBRA DE LINHA 
		// nextLine faz a leitura da linha inteira, só next a leitura só da 1.o palavra
		s1 = sc.nextLine(); 
		s2 = sc.nextLine(); 
		s3 = sc.nextLine();

		System.out.println("DADOS DIGITADOS:"); // Bom dia - Boa tarde - Boa noite
		System.out.println(s1); // Bom dia
		System.out.println(s2); // Boa tarde
		System.out.println(s3); // Boa noite
*/
		// quebra de linha pendente
		int x;
		String s1, s2, s3;

		x  = sc.nextInt();  // digitei 30
		sc.nextLine();      // limpar o buffer de leitura para consumir a quebra de linha que ficou pendente no comando acima
		s1 = sc.nextLine(); // digitei Bom dia
		s2 = sc.nextLine(); // digitei Boa tarde
		s3 = sc.nextLine(); // digitei Boa noite

		System.out.println("DADOS DIGITADOS:"); 
		System.out.println(x);  // 30
		System.out.println(s1); // Bom dia 
		System.out.println(s2); // Boa tarde
		System.out.println(s3); // Boa noite

		
			
		sc.close();


	}

}
