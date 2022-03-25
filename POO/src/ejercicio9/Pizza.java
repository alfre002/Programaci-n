package ejercicio9;

public class Pizza {

	// ATRIBUTOS
	private String tamaño, tipo, estado;
	private static int pedidas = 0, servidas = 0;

	// CONSTRUCTOR
	public Pizza(String tamaño, String tipo) {
		this.tamaño = tamaño;
		this.tipo = tipo;
		this.estado = "pedida";
		Pizza.pedidas++;
	}

	// GETTERS
	public static int getPedidas() {
		return Pizza.pedidas;
	}

	public static int getServidas() {
		return Pizza.servidas;
	}

	// TOSTRING
	@Override
	public String toString() {
		return "pizza " + this.tipo + " " + this.tamaño + ", " + this.estado;
	}

	// MÉTODO SERVIR
	public void servir() {
		if (estado.equals("pedida")) {
			estado = "servida";
			Pizza.servidas++;
		} else {
			System.out.println("Esa pizza ya se ha servido");
		}
	}

}
