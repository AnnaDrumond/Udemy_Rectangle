package entities;

public class Rectangle {
	/*
	 * area = base*altura perimetro = 2*(base+altura) diagonal = (raiz (base2
	 * +altura2))
	 */

	// atributos:
	public double width;
	public double height;

	// métodos:

	public double area() {
		return width * height;
	}

	public double perimeter() {
		return 2 * (width + height);
	}

	public double diagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}

}
