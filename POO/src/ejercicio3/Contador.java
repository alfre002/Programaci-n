package ejercicio3;

public class Contador {

	// ATRIBUTOS
	int cont;
	
	// CONSTRUCTOR POR DEFECTO
	public Contador() {
	}

	// CONSTRUCTOR CON PARÁMETROS
	public Contador(int cont) {
		if(cont<0) {
			this.cont = 0;
		} else {
		this.cont = cont;
		}
	}
	
	// CONSTRUCTOR COPIA
	public Contador(final Contador c) {                                                                           
        cont = c.cont;
    }

	// GETTER
	public int getCont() {
		return cont;
	}

	// SETTER
	public void setCont(int cont) {
		this.cont = cont;
	}
	
	// MÉTODO INCREMENTAR
	public void incrementar() {
		cont++;
	}
	
	// MÉTODO DECREMENTAR
	public void decrementar() {
		if(cont-- < 0) {
			cont = 0;
		} else {
			cont--;
		}
	}
	
}
