package relación2;

import java.util.Scanner;

//Escribe un programa que lea un número n e imprima una pirámide de números con n filas 
//como en la siguiente figura:

//		   1 
//        121
//       12321 
//      1234321

public class Ejercicio24 {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);

		System.out.println("introduce la altura");
		int altura = sn.nextInt();

		int espaciosFuera = altura - 1;


		// espaciosFuera

		int p = 1;

		while (p <= altura) {

			for (int i = 0; i < espaciosFuera; i++) {
				System.out.print(" ");
			}

			// relleno

			for (int i = 1; i < p; i++) { // espaciosDentro
				System.out.print(i);
			}
			
			for (int i = p; i > 0; i--) {
				System.out.print(i);
			}

			
		
			
			sn.close();

			System.out.println();
			espaciosFuera--;
			p++;

			}
		
			// ultima fila

			
		
	}
}


