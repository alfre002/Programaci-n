package ejercicio2;

public class Rectangulo extends Poligono{

	// atributos
	private double lado1, lado2;
	
	// constructor
	public Rectangulo(double lado1, double lado2) {
		super(2);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	// metodo area
	@Override
	public double area() {
		return lado1 * lado2;
	}
	
	// toString
	@Override
	public String toString() {
		return "El rectángulo con lado 1 " + lado1 + " y lado 2 " + lado2
				+ " tiene " + area() + " de area";
	}
	
}
