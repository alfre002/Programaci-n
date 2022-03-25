package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

//	. Diseñar una aplicación que pida al usuario que introduzca una frase por teclado e
//	indique cuántos espacios en blanco tiene.

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Introduzca una frase");
		String frase = s.nextLine();
		System.out.println("La frase tiene " + contarEspacios(frase) + " espacios");
	}

	public static int contarEspacios(String frase) {
		int cuenta = 0;
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == ' ') {
				cuenta++;
			}
		}
		return cuenta;

	}

}
