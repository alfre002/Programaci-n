package ejercicio8Solucion;

public class Disco {
private String codigo = "LIBRE";
private String autor;
private String titulo;
private String genero;
private int duracion; // duraci�n total en minutos

public String getCodigo() {
return codigo;
}
public void setCodigo(String codigo) {
	this.codigo = codigo;
}

public String getAutor() {
	return autor;
}

public void setAutor(String autor) {
	this.autor = autor;
}

public String getGenero() {
return genero;
}

public void setGenero(String genero) {
	this.genero = genero;
}

public String getTitulo() {
	return titulo;
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public int getDuracion() {
	return duracion;
}

public void setDuracion(int duracion) {
	this.duracion = duracion;
}

public String toString() {
	String cadena = "\n------------------------------------------";
	cadena += "\nC�digo: " + this.codigo;
	cadena += "\nAutor: " + this.autor;
	cadena += "\nT�tulo: " + this.titulo;
	cadena += "\nG�nero: " + this.genero;
	cadena += "\nDuraci�n: " + this.duracion;
	cadena += "\n------------------------------------------";
	return cadena;
}
}
