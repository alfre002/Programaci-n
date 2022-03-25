package ejercicio4;

public class Libro {
	
	// ATRIBUTOS
	String titulo;
	String autor;
	int ejemplaresLibro;
	int ejemplaresPrestados;
	
	// CONSTRUCTOR POR DEFECTO
	public Libro() {
	}

	// CONSTRUCTOR CON PARÁMETROS
	public Libro(String titulo, String autor, int ejemplaresLibro, int ejemplaresPrestados) {
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplaresLibro = ejemplaresLibro;
		this.ejemplaresPrestados = ejemplaresPrestados;
	}
	
	// GETTERS/SETTERS
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getEjemplaresLibro() {
		return ejemplaresLibro;
	}

	public void setEjemplaresLibro(int ejemplaresLibro) {
		this.ejemplaresLibro = ejemplaresLibro;
	}

	public int getEjemplaresPrestados() {
		return ejemplaresPrestados;
	}

	public void setEjemplaresPrestados(int ejemplaresPrestados) {
		this.ejemplaresPrestados = ejemplaresPrestados;
	}
	
	// MÉTODO PRÉSTAMO
	public boolean prestamo() {
		if(ejemplaresLibro > ejemplaresPrestados) {
			ejemplaresPrestados++;
			return true;
		} else {
			return false;
		}
	}
	
	// MÉTODO DEVOLUCIÓN
	public boolean devolucion() {
		if(ejemplaresPrestados > 0) {
			ejemplaresPrestados--;
			return true;
		} else {
			return false;
		}
	}

	// MÉTODO TOSTRING
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", ejemplaresLibro=" + ejemplaresLibro
				+ ", ejemplaresPrestados=" + ejemplaresPrestados + "]";
	}	

}
