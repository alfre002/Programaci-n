package ejercicio3;

public class Empleados {
	
	// atributos
	private String nombre;
	private int edad;
	private double salario;
	static int plus = 300;
	
	// getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getPlus() {
		return plus;
	}
	public void setPlus(int plus) {
		Empleados.plus = plus;
	}
	
	// constructor
	public Empleados(String nombre, int edad, double salario) {
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}
	
	// toString
	public String toString() {
		return "Empleado: " + nombre + "\nEdad: " + edad + "\nSalario: " + salario;
	}
	
	

}
