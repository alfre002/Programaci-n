package ejercicio5;

public class Fraccion {

	// ATRIBUTOS
	private int num;
	private int den;

	// CONSTRUCTOR CON 2 PARÁMETROS
	public Fraccion(int num, int den) {
		super();
		this.num = num;
		if (den == 0) {
			den = 1;
		}
		this.den = den;
		simplificar();
	}

	// CONSTRUCTOR SIN PARÁMETROS
	public Fraccion() {
		super();
		this.num = 0;
		this.den = 1;
		simplificar();
	}

	// CONSTRUCTOR CON 1 PARÁMETRO
	public Fraccion(int num) {
		super();
		this.num = num;
		this.den = 1;
		simplificar();
	}

	// GETTERS AND SETTERS
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getDen() {
		return den;
	}

	public void setDen(int den) {
		this.den = den;
	}

	// MCD
	private int mcd() {
		int u = Math.abs(num);
		int v = Math.abs(den);
		if (v == 0) {
			return u;
		}
		int r;
		while (v != 0) {
			r = u % v;
			u = v;
			v = r;
		}
		return u;
	}

	// MÉTODO SIMPLIFICAR
	private void simplificar() {
		int n = mcd();
		num /= n;
		den /= n;
	}

	// MÉTODO SUMAR
	public Fraccion sumar(Fraccion f) {
		Fraccion aux = new Fraccion();
		aux.num = this.num * f.den + this.den * f.num;
		aux.den = this.den * f.den;
		aux.simplificar();
		return aux;
	}

	// MÉTODO RESTAR
	public Fraccion restar(Fraccion f) {
		Fraccion aux = new Fraccion();
		aux.num = this.num * f.den - this.den * f.num;
		aux.den = this.den * f.den;
		aux.simplificar();
		return aux;
	}

	// MÉTODO PRODUCTO
	public Fraccion multiplicar(Fraccion f) {
		Fraccion aux = new Fraccion();
		aux.num = this.num * f.num;
		aux.den = this.den * f.den;
		aux.simplificar();
		return aux;
	}

	// MÉTODO COCIENTE
	public Fraccion dividir(Fraccion f) {
		Fraccion aux = new Fraccion();
		aux.num = this.num * f.den;
		aux.den = this.den * f.num;
		aux.simplificar();
		return aux;
	}

	// TO STRING
	@Override
	public String toString() {
		return num + "/" + den;
	}

}
