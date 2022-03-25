package relación1;

import javax.swing.JOptionPane;

public class Ejercicio5 {

	public static void main(String[] args) {
		double pesetas;
		String texto=JOptionPane.showInputDialog("Introduce el número de pesetas");
		pesetas=Double.parseDouble(texto);
		System.out.println("conversor a euros: "+pesetas*0.006);
	}

}



