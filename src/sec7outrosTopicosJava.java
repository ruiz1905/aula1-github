import java.util.Scanner;

public class sec7outrosTopicosJava {

	public static void main(String[] args) {
		// Aula 56. OPERADORES bitwise - aplicação programar interface de rede,comparar bit do endereço da rede
		// Operador	Significado
		//     &	Operação "E" bit a bit
		//     |	Operação "OU" bit a bit
		//     ^	Operação "OU-exclusivo" bit a bit
		// C1	C2	C1 E C2(&)   C1 	C2	C1 OU C2(|)    C1	C2	C1 XOR C2(^)
		// F    F   F            F	    F	F              F	F	F
		// F    V   F            V     F   V               F	V	V
		// V    F   F            V     F   V               V	F	V
		// V    V   V            V     V   V               V	V	F
/*
		int n1 = 89; // 0101 1001
		int n2 = 60; // 0011 1100
		System.out.println(n1 & n2); // 0001 1000 24
		System.out.println(n1 | n2); // 0111 1101 125
		System.out.println(n1 ^ n2); // 0110 0101 101
		
		// testar de o sexto bit vale 1 ou zero
		Scanner sc = new Scanner(System.in); 
		int mask = 0b100000; // significa 32
		int n    = sc.nextInt();

		if ((n & mask) != 0) {
		System.out.println("6th bit is true!"); // 32 o sexto bit é 1
		}
		else {
		System.out.println("6th bit is false"); // 89 o sexto bit é zero
		}

		sc.close();

		
		// Aula 57. FUNÇÕES INTESSANTES PARA STRING
		// •	Formatar: toLowerCase(), toUpperCase(), trim() ; transformar para minusculo, transformar para maiusculo, remove espaços
		// •	Recortar: substring(inicio), substring(inicio, fim) ; recortar string
		// •	Substituir: Replace(char, char), Replace(string, string) ; substituir caracteres
		// •	Buscar: IndexOf, LastIndexOf ; buscar a posição de alguma parte da string	
		// •	str.Split(" ") ; recortar uma string com base em um separador informado entre aspas
		
		String original = "abcde FGHIJ ABC abc DEFG ";

		String s01 = original.toLowerCase(); 
		String s02 = original.toUpperCase(); 
		String s03 = original.trim();        
		String s04 = original.substring(2);  
		String s05 = original.substring(2, 9); 
		String s06 = original.replace('a', 'x'); 
		String s07 = original.replace("abc", "xy"); 
		int i = original.indexOf("bc");             
		int j = original.lastIndexOf("bc");         
                                                                   // posição    01234567890123456789012345
		System.out.println("Original: -" + original + "-");        // Original: -abcde FGHIJ ABC abc DEFG -
		System.out.println("toLowerCase: -" + s01 + "-");          // toLowerCase: -abcde fghij abc abc defg - : letras minusculas
		System.out.println("toUpperCase: -" + s02 + "-");          // toUpperCase: -ABCDE FGHIJ ABC ABC DEFG - : letras maiusculas
		System.out.println("trim: -" + s03 + "-");                 // trim: -abcde FGHIJ ABC abc DEFG- : eliminou espaços nos cantos
		System.out.println("substring(2): -" + s04 + "-");         // substring(2): -cde FGHIJ ABC abc DEFG - : pegou da posição 2 
		System.out.println("substring(2, 9): -" + s05 + "-");      // substring(2, 9): -cde FGH- : pegou da posição 2 a 8
		System.out.println("replace('a', 'x'): -" + s06 + "-");    // replace('a', 'x'): -xbcde FGHIJ ABC xbc DEFG - : trocou o a por x
		System.out.println("replace('abc', 'xy'): -" + s07 + "-"); // replace('abc', 'xy'): -xyde FGHIJ ABC xy DEFG - : trocou abc por xy
		System.out.println("Index of 'bc': " + i);                 // Index of 'bc': 1 : primeira ocorrencia do bc
		System.out.println("Last index of 'bc': " + j);            // Last index of 'bc': 17 : ultima ocorrencia do bc

		// OPERAÇÃO split - SERVE PARA RECORTAR UMA STRING
		
		String s = "potato apple lemon";
		String[] vect = s.split(" ");
		System.out.println(vect[0]); // potato
		System.out.println(vect[1]); // apple
		System.out.println(vect[2]); // lemon
		
        // Aula 59 - FUNÇÕES(SINTAXE)
		// Funções
		// •	Representam um processamento que possui um significado
		// •	Math.sqrt(double)    -  função para calcular raiz quadrada
		// •	System.out.println(string) - função para impressão

		// •	Principais vantagens: modularização, delegação e reaproveitamento
		
		// •	Dados de entrada e saída
		//       •	Funções podem receber dados de entrada (parâmetros ou argumentos)
		//       •	Funções podem ou não retornar uma saída

		// •	Em orientação a objetos, funções em classes recebem o nome de "métodos"

		double y = 25.0;
		double x = Math.sqrt(y); // calcula a raiz quadrada de 25
		System.out.println(x);   // 5
*/
		// Fazer um programa para ler três números inteiros e mostrar na tela o maior deles.
		
		// exemplo: 5,8,3  o maior é 8
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt(); // 5
		int b = sc.nextInt(); // 8
		int c = sc.nextInt(); // 3
		
		int higher = max(a,b,c); // criar a função max para retornar o numero maior
		
		showResult(higher); // 8
		
		
		sc.close();
		
	} // - fecha função main
	
	public static int max(int x, int y, int z) {  
		int aux;
		if (x > y && x >z) {
			aux = x;
		}
		else if (y > z) {
			aux = y;
		}
		else {
			aux = z;
		}
		return aux;
		
	} // fim função max
	
	public static void showResult(int value) {	// void função sem retorno
		System.out.println("Higher = " + value);
	}
	

} // - fecha classe
