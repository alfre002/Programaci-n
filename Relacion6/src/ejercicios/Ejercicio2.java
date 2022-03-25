package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

//	Diseñar el juego acierta la contraseña. La mecánica del juego es la siguiente: el
//	primer jugador introduce la contraseña; a continuación, el segundo jugador debe
//	teclear palabras hasta que la acierte. Realizar dos versiones; en la primera las
//	únicas pistas que se proporcionan son el número de caracteres y cuáles son el primer y
//	el último carácter de la contraseña. En la segunda versión se facilita el juego indicando
//	si la palabra introducida es mayor o menor, alfabéticamente, que la contraseña.

	public static void main(String[] args) {
		
		boolean acertar = false;

		// escáner
		Scanner s = new Scanner(System.in);

		// introducir contraseña y pistas
		System.out.println("introduzca la contraseña");
		String contraseña = s.nextLine();
		System.out.println("La contraseña tiene " + contraseña.length() + " caracteres");
		System.out.println("El primer caracter de la contraseña es " + contraseña.charAt(0)); 
		System.out.println("El último caracter de la contraseña es " + contraseña.charAt(contraseña.length()-1)); 
		
		
		while(!acertar) {
			System.out.println("intente adivinar la contraseña");
			String intento = s.nextLine();
			if (contraseña.equals(intento)) {
				acertar = true;
			}
		}
		
		if (acertar) {
			System.out.println("correcto");
		}

		s.close();
	}

}
