package examen2Evaluacion;

public class Vehiculos {
	
	// ATRIBUTOS
	private String marca;
	private String matricula = "LIBRE";
	private int numeroKm;
	private Fecha fechaMatriculacion;
	private String descripcion;
	private double precio;
	private String nombrePropietario;
	private String dniPropietario;
	
	// CONSTRUCTOR POR DEFECTO
	public Vehiculos() {
	}

	// CONSTRUCTOR CON PARÁMETROS
	public Vehiculos(String marca, String matricula, int numeroKm, Fecha fechaMatriculacion, String descripcion,
			double precio, String nombrePropietario, String dniPropietario) {
		this.marca = marca;
		this.matricula = matricula;
		this.numeroKm = numeroKm;
		this.fechaMatriculacion = fechaMatriculacion;
		this.descripcion = descripcion;
		this.precio = precio;
		this.nombrePropietario = nombrePropietario;
		this.dniPropietario = dniPropietario;
	}
	
	// CONSTRUCTOR COPIA
	public Vehiculos(final Vehiculos v) {
        marca = v.marca;
        matricula = v.matricula;
        numeroKm = v.numeroKm;
        fechaMatriculacion = v.fechaMatriculacion;
        descripcion = v.descripcion;
        precio = v.precio;
        nombrePropietario = v.nombrePropietario;
        dniPropietario = v.dniPropietario;
    }

	// GETTERS AND SETTERS
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getNumeroKm() {
		return numeroKm;
	}

	public void setNumeroKm(int numeroKm) {
		this.numeroKm = numeroKm;
	}

	public Fecha getFechaMatriculacion() {
		return fechaMatriculacion;
	}

	public void setFechaMatriculacion(Fecha fechaMatriculacion) {
		this.fechaMatriculacion = fechaMatriculacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getNombrePropietario() {
		return nombrePropietario;
	}

	public void setNombrePropietario(String nombrePropietario) {
		this.nombrePropietario = nombrePropietario;
	}

	public String getDniPropietario() {
		return dniPropietario;
	}

	public void setDniPropietario(String dniPropietario) {
		this.dniPropietario = dniPropietario;
	}
	
	// MÉTODO AÑOS
	public static int getAnios(Vehiculos v) {
		return 2022 - v.getFechaMatriculacion().getAño();
	}

	@Override
	public String toString() {
		return "\nMarca: " + marca + "\nMatrícula: " + matricula + "\nNúmero de kms: " + numeroKm + "\nFecha matriculación: " + fechaMatriculacion
				+ "\nDescripción: " + descripcion + "\nPrecio: " + precio + "\nNombre del propietario: " + nombrePropietario + "\nDNI del propietario: "
				+ dniPropietario;
	}	
	
}
