package ejercicio2;

public class Cuenta {

	// ATRIBUTOS 
	String nombreCliente;
	String numeroCuenta;
	double tipoInteres;
	double saldo;
	
	// CONSTRUCTOR POR DEFECTO
	public Cuenta() {
	}
	
	// CONSTRUCTOR CON PARÁMETROS
	public Cuenta(String nombreCliente, String numeroCuenta, double tipoInteres, double saldo) {
		this.nombreCliente = nombreCliente;
		this.numeroCuenta = numeroCuenta;
		this.tipoInteres = tipoInteres;
		this.saldo = saldo;
	}
	
	// Constructor copia
    public Cuenta(final Cuenta c) {
        nombreCliente = c.nombreCliente;
        numeroCuenta = c.numeroCuenta;
        tipoInteres = c.tipoInteres;
        saldo = c.saldo;
    }

	// GETTERS AND SETTERS
	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double getTipoInteres() {
		return tipoInteres;
	}

	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	// MÉTODO INGRESO
	public boolean ingreso(double cantidad) {
		if(cantidad>0) {
			saldo += cantidad;
			return true;
		}else {
			return false;
		}
	}
	
	// MÉTODO REINTEGRO
	public boolean reintegro(double cantidad) {
		if(cantidad>0 && saldo>=0) {
			saldo -= cantidad;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean transferencia(Cuenta cuentaDestino, double cantidad) {
		if(saldo >= cantidad && cantidad>0) {
			reintegro(cantidad);
			cuentaDestino.ingreso(cantidad);
			return true;
		}else {
			return false;
		}
	}
	
}
