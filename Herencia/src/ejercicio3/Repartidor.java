package ejercicio3;

public class Repartidor extends Empleados {

	// atributos
	private String zona;

	// constructor
	public Repartidor(String nombre, int edad, double salario, String zona) {
		super(nombre, edad, salario);
		this.zona = zona;
	}

	// getters y setters
	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	@Override
	// toString
	public String toString() {
		return "Empleado: " + getNombre() + "\nEdad: " + getEdad() + "\nSalario: " + getSalario();
	}
	
	// metodo plus
	public static void plus(int edad, String zona, double salario) {
		if(edad < 25 && zona.equals("zona 3")) {
			salario += plus;
		}
	}

}
