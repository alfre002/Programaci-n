package ejercicio1;

public class Tecnico extends Empleado{
	
	public Tecnico(String nombre) {
		super(nombre);
	}
	
	@Override
	public String toString() {
		return "Empleado " + getNombre() + " -> Técnico";
	}

}
