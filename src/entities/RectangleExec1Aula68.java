package entities;

// uma classe possui membros = atributos e metodos
public class RectangleExec1Aula68 {
	// atributos
	public double width;  // largura
	public double height; // altura
	
	// metodos
	public double area() { // metodo para calcular a area
		return width * height;
	}	
	public double perimeter() {
		return 2 * (width + height); 
	}
	public double diagonal() {
		return Math.sqrt(width * width + height * height);
	}
}
