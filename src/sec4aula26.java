
public class sec4aula26 {

	public static void main(String[] args) {
		// funções matematicas
		// Math.sqrt(x);	raiz quadrada de x
		// Math.pow(x, y);	resultado de x elevado a y
		// Math.abs(x);	    valor absoluto de x

		double x = 3.0; 
		double y = 4.0; 
		double z = -5.0; 
		double A, B, C;

		A = Math.sqrt(x);   // Variável A recebe a raiz quadrada de x
		B = Math.sqrt(y);   // Variável A recebe a raiz quadrada de y
		C = Math.sqrt(25.0);// Variável A recebe a raiz quadrada de 25
		
		System.out.println("Raiz quadrada de " + x + " = " + A);  // 1.7320508075688772
		System.out.println("Raiz quadrada de " + y + " = " + B);  // 2.0
		System.out.println("Raiz quadrada de 25 = " + C);         // 5.0

		A = Math.pow(x, y);     //x=3.0 y=4.0  // Variável A recebe o resultado de x elevado a y
		B = Math.pow(x, 2.0);   //x=3.0
		C = Math.pow(5.0, 2.0); 
		System.out.println(x + " elevado a " + y + " = " + A); // 81.00
		System.out.println(x + " elevado ao quadrado = " + B); // 9.0
		System.out.println("5 elevado ao quadrado = " + C);    // 25.00

		A = Math.abs(y); // y=4.0 // Variável A recebe o valor absoluto de y
		B = Math.abs(z); // z=-5.0
		System.out.println("Valor absoluto de " + y + " = " + A); // 4.0
		System.out.println("Valor absoluto de " + z + " = " + B); // 5.0


	}

}
