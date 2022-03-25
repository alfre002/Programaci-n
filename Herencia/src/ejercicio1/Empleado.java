package ejercicio1;

public class Empleado {

	// ATRIBUTOS
	private String nombre;

	// CONSTRUCTOR POR DEFECTO
	public Empleado() {
	}

	// CONSTRUCTOR CON PARÁMETROS
	public Empleado(String nombre) {
		this.nombre = nombre;
	}

	// GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}
	
	// toString
	public String toString() {
		return "Empleado " + nombre;
	}
	
}
