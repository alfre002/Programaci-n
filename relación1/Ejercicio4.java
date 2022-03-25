package relación1;

import javax.swing.JOptionPane;

public class Ejercicio4 {

	public static void main(String[] args) {
		double euros;
		String texto=JOptionPane.showInputDialog("Introduce el número de euros");
		euros=Double.parseDouble(texto);
		System.out.println("conversor a pesetas: "+euros*166.386);
	}

}
