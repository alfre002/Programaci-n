package ejercicio7;

public class Empleado {

	// ATRIBUTOS
	private String nif, nombre;
	private int horasExtra, numeroHijos;
	private float IRPF, sueldoBase;
	private char casado;
	private static double importeHoraExtra;

	// CONSTRUCTOR POR DEFECTO
	public Empleado() {
	}

	// CONSTRUCTOR CON PARÁMETRO NIF
	public Empleado(String nif) {
		this.nif = nif;
	}

	// GETTERS AND SETTERS
	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(float sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public int getHorasExtra() {
		return horasExtra;
	}

	public void setHorasExtra(int horasExtra) {
		this.horasExtra = horasExtra;
	}

	public int getNumeroHijos() {
		return numeroHijos;
	}

	public void setNumeroHijos(int numeroHijos) {
		this.numeroHijos = numeroHijos;
	}

	public float getIRPF() {
		return IRPF;
	}

	public void setIRPF(float IRPF) {
		this.IRPF = IRPF;
	}

	public char isCasado() {
		return casado;
	}

	public void setCasado(char casado) {
		this.casado = casado;
	}

	public static double getImporteHoraExtra() {
		return importeHoraExtra;
	}

	public static void setImporteHoraExtra(double importeHoraExtra) {
		Empleado.importeHoraExtra = importeHoraExtra;
	}

	// MÉTODO IMPORTE HORAS EXTRA
	public double importeHorasExtra() {
		return horasExtra * importeHoraExtra;
	}

	// MÉTODO SUELDO BRUTO
	public double sueldoBruto() {
		return sueldoBase + importeHorasExtra();
	}

	// MÉTODO RETENCIONES IRPF
	public double retencionesIRPF() {
		if (casado=='S') {
			IRPF -= 2;
			;
		}
		if (numeroHijos > 0) {
			IRPF -= numeroHijos;
		}
		return sueldoBruto() * IRPF / 100;
	}
	
	// IMPORTE NETO
	public double calcularSueldo() {
		return sueldoBruto() - retencionesIRPF();
	}

	@Override
	public String toString() {
		return nif + " " + nombre + "\n" 
				+ "Sueldo Base: " + sueldoBase + "\n"
				+ "Horas Extra: " + horasExtra + "\n"
				+ "Tipo IRPF: " + IRPF + "\n"
				+ "Casado: " + casado + "\n"
				+ "Número de hijos: " + numeroHijos;
	}

}
