package ejercicio2;

public abstract class Poligono {
	
	// atributos
	protected int numeroLado;
	
	// constructor
	public Poligono(int numeroLado) {
		this.numeroLado = numeroLado;
	}
	
	// GETTERS Y SETTERS
	public int getNumeroLado() {
		return numeroLado;
	}

	public void setNumeroLado(int numeroLado) {
		this.numeroLado = numeroLado;
	}

	// metodo area
	public abstract double area();

	public String toString() {
		return "Poligono [numeroLado=" + numeroLado + "]";
	}
	
	

}
