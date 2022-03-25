package examen2Evaluacion;

public class Fecha {

	// ATRIBUTOS
	private int dia, mes, año;

	// CONSTRUCTOR VACIO
	public Fecha() {
	}

	// CONSTRUCTOR POR PARÁMETROS
	public Fecha(int dia, int mes, int año) {
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}

	// GETTERS AND SETTERS
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	// MÉTODO ESBISIESTO
	private boolean esBisiesto() {
		return (año % 4 == 0 && año % 100 != 0 || año % 400 == 0);
	}

	// MÉTODO FECHACORRECTA
	public boolean fechaCorrecta() {
		boolean diaCorrecto, mesCorrecto, añoCorrecto;
		mesCorrecto = mes >= 1 && mes <= 12;
		añoCorrecto = año > 0;
		switch (mes) {
		case 2:
			if (esBisiesto()) {
				diaCorrecto = dia >= 1 && dia <= 29;
			} else {
				diaCorrecto = dia >= 1 && dia <= 28;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			diaCorrecto = dia >= 1 && dia <= 30;
			break;
		default:
			diaCorrecto = dia >= 1 && dia <= 31;
		}
		return diaCorrecto && mesCorrecto && añoCorrecto;
	}

	// MÉTODO DIA SIGUIENTE
	public void diaSiguiente() {
		dia += 1;
		if (!fechaCorrecta()) {
			dia = 1;
			mes++;
		}
		if (!fechaCorrecta()) {
			mes = 1;
			año++;
		}
	}

	@Override
	public String toString() {
		// si el dia tiene solo una cifra se le añade un 0 delante
		String diaFinal;
		if (dia < 10) {
			diaFinal = "0" + dia;
		} else {
			diaFinal = "" + dia;
		}

		// lo mismo con el mes
		String mesFinal;
		if (mes < 10) {
			mesFinal = "0" + mes;
		} else {
			mesFinal = "" + mes;
		}
		return diaFinal + "-" + mesFinal + "-" + año;
	}

}
