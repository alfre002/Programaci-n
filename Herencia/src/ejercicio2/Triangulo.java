package ejercicio2;

public class Triangulo extends Poligono{

	// atributos
	private double lado1, lado2, lado3;

	// constructor
	public Triangulo(double lado1, double lado2, double lado3) {
		super(3);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	
	// setters
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	// metodo area
	@Override
	public double area() {
		double p = (lado1 + lado2 + lado3) / 2;
		return Math.sqrt((p * (p - lado1) * (p - lado2) * (p - lado3)));
	}

	// toString
	@Override
	public String toString() {
		return "El triángulo con lado 1 " + lado1 + ", lado 2 " + lado2 + " y lado 3 " + lado3 + " tiene " + area() + " de area";
	}

}
