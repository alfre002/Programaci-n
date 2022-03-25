package relación2;

import java.util.Scanner;

//Realiza un programa que pinte una pirámide por pantalla. La altura se debe pedir por teclado. El carácter con
//el que se pinta la pirámide también se debe pedir por teclado.

public class Ejercicio19 {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);

		System.out.println("introduce la altura");
		int altura = sn.nextInt();

		System.out.println("introduce el carácter con el que se va a pintar la pirámide");
		String caracter = sn.next();

		int espacios = altura - 1;
		
		int longitudlinea = 1;

		// espacios

		int p = 1;
		
		while (p < altura) {
		
		for (int i = 0; i < espacios; i++) {
			System.out.print(" ");
		}

		// relleno

		for (int i = 0; i < longitudlinea; i++) {
			System.out.print(caracter);
		}

		sn.close();

		
		System.out.println();
		espacios--;
		p++;
		longitudlinea+=2;

}}}
