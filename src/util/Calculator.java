package util;

public class Calculator { // classe normal, os membros n�o s�o static, tem que ser instanciado no programa principal
	
	public static final double PI = 3.14159;
	
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}

	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}

}
