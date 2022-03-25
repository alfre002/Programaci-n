package relación2;

import java.util.Scanner;

public class Ejercicio20 {

//Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);

		System.out.println("introduce la altura");
		int altura = sn.nextInt();

		System.out.println("introduce el carácter con el que se va a pintar la pirámide");
		String caracter = sn.next();

		int espaciosFuera = altura - 1;

		int espaciosDentro = 0;



		// espaciosFuera

		int p = 1;

		while (p < altura) {

			for (int i = 0; i < espaciosFuera; i++) {
				System.out.print(" ");
			}

			// relleno

			System.out.print(caracter); // 1ª fila

			for (int i = 1; i < espaciosDentro; i++) { // espaciosDentro
				System.out.print(" ");
			}

			if (p > 1) {
				System.out.print(caracter);
			}

			sn.close();

			System.out.println();
			espaciosFuera--;
			p++;

			espaciosDentro += 2;
			}
		
			// ultima fila

			for (int i = 1; i < (altura * 2) ; i++) {
				System.out.print(caracter);
			}
		
	}
}
