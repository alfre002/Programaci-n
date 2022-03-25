package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
	
//	Diseñar una función a la que se le pase una cadena de caracteres y la devuelva invertida.
//	Un ejemplo, la cadena “Hola mundo” quedaría “odnum aloH”
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("introduce una frase");
		String cadena = s.nextLine();
	}
	
	public static String invertir(String cadena) {
		String resultado = "";
		for (int i = cadena.length()-1; i >= 0; i--) {
			resultado += cadena.charAt(i);
		}
		
		return cadena;
		
	}
	
}
	

