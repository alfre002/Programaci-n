package paquete;

import java.util.Scanner;

public class ExamenFebrero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		char resp;

		String movimiento = "";
		int[] tablero = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		int x1, x2, x3; // programa X---> 2
		// int o1, o2, o3; // usuario O --->1
		int aux = 0;
		boolean ganaUsuario = false;
		boolean repetir;

		System.out.println("�Juguemos al tres en raya!");
		do {
			x1 = x2 = x3 = 0;
			// o1=o2=o3=0;
			repetir = false;
			ganaUsuario = false;
			imprimeTablero(tablero);

			// --------------------------------------------------------------
			// ------------------primera jugada
			// --------------------------------------------------------------

			// 1� jugada del usuario
			System.out.println("�Tu turno!");
			System.out.println("Elige donde quieres colocar la ficha:");
			movimiento = s.nextLine();

			aux = conviertePosicionAMovimiento(movimiento);

			// Comprueba que el movimiento es v�lido
			while (aux == -1) {
				System.out.println("\nMOVIMIENTO NO VALIDO, VUELVE A INTRODUCIRLO");
				movimiento = s.nextLine();
				aux = conviertePosicionAMovimiento(movimiento);
			}

			// si es v�lido lo guardo en o1 y en el tablero
			if (usuarioMueveFicha(movimiento, tablero)) {

				System.out.println("\nMOVIMIENTO V�LIDO");
				// o1 = aux;// lo guardo en la primera variable

			}

			// Imprimo el tablero

			imprimeTablero(tablero);

			// 1� jugada del programa

			System.out.println(" \nTurno de la m�quina!");
			x1 = mueveFichaAleatoria(tablero);

			if (x1 != -1) {

				System.out.println("\nMOVIMIENTO V�LIDO");

			}
			imprimeTablero(tablero);

			// --------------------------------------------------------------
			// ------------------segunda jugada
			// --------------------------------------------------------------
			// 2� jugada del usuario
			System.out.println("�Tu turno!");
			System.out.println("Elige donde quieres colocar la ficha:");
			movimiento = s.nextLine();

			aux = conviertePosicionAMovimiento(movimiento);

			// Comprueba que el movimiento es v�lido
			while (aux == -1) {
				System.out.println("\nMOVIMIENTO NO VALIDO, VUELVE A INTRODUCIRLO");
				movimiento = s.nextLine();
				aux = conviertePosicionAMovimiento(movimiento);
			}

			// si es v�lido lo guardo en o2 y en el tablero
			if (usuarioMueveFicha(movimiento, tablero)) {

				System.out.println("\nMOVIMIENTO V�LIDO");
				// o2 = aux;// lo guardo en la primera variable

			}

			// Imprimo el tablero

			imprimeTablero(tablero);

			// 2� jugada del programa

			System.out.println(" \nTurno de la m�quina!");
			x2 = mueveFichaAleatoria(tablero);

			if (x2 != -1) {

				System.out.println("\nMOVIMIENTO V�LIDO");

			}
			imprimeTablero(tablero);

			// --------------------------------------------------------------
			// ------------------tercera jugada
			// --------------------------------------------------------------
			// 3� jugada del usuario
			System.out.println("�Tu turno!");
			System.out.println("Elige donde quieres colocar la ficha:");
			movimiento = s.nextLine();

			aux = conviertePosicionAMovimiento(movimiento);

			// Comprueba que el movimiento es v�lido
			while (aux == -1) {
				System.out.println("\nMOVIMIENTO NO VALIDO, VUELVE A INTRODUCIRLO");
				movimiento = s.nextLine();
				aux = conviertePosicionAMovimiento(movimiento);
			}

			// si es v�lido lo guardo en o3 y en el tablero
			if (usuarioMueveFicha(movimiento, tablero)) {

				System.out.println("\nMOVIMIENTO V�LIDO");
				// o3 = aux;// lo guardo en la variable

			}

			// Imprimo el tablero
			imprimeTablero(tablero);
			if (ganaUsuario(tablero)) {
				System.out.println("\n!Ganaste�");
				ganaUsuario = true;
			}

			// 3� jugada del programa

			if (ganaUsuario == false) {

				System.out.println(" \nTurno de la m�quina!");
				x3 = mueveFichaAleatoria(tablero);

				if (x3 != -1) {

					System.out.println("\nMOVIMIENTO V�LIDO");

				}
				imprimeTablero(tablero);
				if (ganaPrograma(x1, x2, x3)) {
					System.out.println("\n!Ha ganado el Programa�");
				}
			}
			if (ganaUsuario == false && ganaPrograma(x1, x2, x3) == false) {

				System.out.println("�\nEmpate!");
			}
			System.out.println("�Otra partidita?");
			resp = s2.next().charAt(0);
			if (resp == 's' || resp == 'S') {

				repetir = true;
				limpiarTablero(tablero);
			} else {
				System.out.println("�ADIOSSSSS!");
			}
		} while (repetir == true);
		s.close();
		s2.close();

	}

//imprime el tablero con - en blanco, O ficha usuario y X ficha del programa
	public static void imprimeTablero(int vector[]) {

		char c = ' ';
		for (int i = 0; i < vector.length; i++) {

			switch (vector[i]) {
			case 0:
				c = '-';
				break;
			case 1:
				c = 'O';
				break;
			case 2:
				c = 'X';
				break;

			}

			System.out.print(c + "\t");
			if (i == 2 || i == 5) {
				System.out.println("");
			}
		}

		System.out.println();

	}

	// crea una posici�n aleatoria. Comprueba que est� la posici�n vac�a y la
	// coloca,sino devuelve -1

	public static int mueveFichaAleatoria(int[] vector) {
		int res = -1;
		int aleatorio = (int) ((Math.random() * 9));
		while (vector[aleatorio] != 0) {
			aleatorio = (int) ((Math.random() * 9));
		}
		vector[aleatorio] = 2;
		res = aleatorio;

		return res;

	}

	// convierte la posici�n introducida a movimiento
	public static int conviertePosicionAMovimiento(String movimiento) {

		int pos = -1;

		String mov = movimiento.toLowerCase();
		switch (mov) {
		case "arriba izquierda":
			pos = 0;
			break;
		case "arriba centro":
			pos = 1;
			break;
		case "arriba derecha":
			pos = 2;
			break;
		case "centro izquierda":
			pos = 3;
			break;
		case "centro centro":
			pos = 4;
			break;
		case "centro derecha":
			pos = 5;
			break;
		case "abajo izquierda":
			pos = 6;
			break;
		case "abajo centro":
			pos = 7;
			break;
		case "abajo derecha":
			pos = 8;
			break;

		}

		return pos;
	}

	// usuario mueve ficha.Convierte el movimiento en posici�n y lo anota en el
	// vector

	public static boolean usuarioMueveFicha(String movimiento, int[] vector) {
		boolean res = false;
		int mov = conviertePosicionAMovimiento(movimiento);
		if (vector[mov] == 0) {
			vector[mov] = 1;
			res = true;

		}
		return res;

	}
	// Comprueba si el programa ha ganado

	public static boolean ganaPrograma(int x1, int x2, int x3) {
		boolean res = false;

		if ((x1 == 0 && x2 == 1 && x3 == 2) || ((x1 == 0 && x2 == 2 && x3 == 1)) || (x1 == 1 && x2 == 0 && x3 == 2)
				|| (x1 == 0 && x2 == 2 && x3 == 0) || ((x1 == 2 && x2 == 0 && x3 == 1))
				|| (x1 == 2 && x2 == 1 && x3 == 0)) {
			res = true;
		}
		if ((x1 == 3 && x2 == 4 && x3 == 5) || (x1 == 3 && x2 == 5 && x3 == 4) || (x1 == 4 && x2 == 3 && x3 == 5)
				|| (x1 == 4 && x2 == 5 && x3 == 3) || (x1 == 5 && x2 == 3 && x3 == 4)
				|| (x1 == 5 && x2 == 4 && x3 == 3)) {
			res = true;
		}
		if ((x1 == 6 && x2 == 7 && x3 == 8) || (x1 == 6 && x2 == 8 && x3 == 7) || (x1 == 7 && x2 == 6 && x3 == 8)
				|| (x1 == 7 && x2 == 8 && x3 == 6) || (x1 == 8 && x2 == 7 && x3 == 6)
				|| (x1 == 8 && x2 == 6 && x3 == 7)) {
			res = true;
		}
		if ((x1 == 0 && x2 == 3 && x3 == 6) || (x1 == 0 && x2 == 6 && x3 == 3) || (x1 == 3 && x2 == 0 && x3 == 6)
				|| (x1 == 3 && x2 == 6 && x3 == 0) || (x1 == 6 && x2 == 0 && x3 == 3)
				|| (x1 == 6 && x2 == 3 && x3 == 0)) {
			res = true;
		}
		if ((x1 == 1 && x2 == 4 && x3 == 7) || (x1 == 1 && x2 == 7 && x3 == 4) || (x1 == 4 && x2 == 7 && x3 == 1)
				|| (x1 == 4 && x2 == 1 && x3 == 7) || (x1 == 7 && x2 == 1 && x3 == 4)
				|| (x1 == 7 && x2 == 4 && x3 == 1)) {
			res = true;
		}
		if ((x1 == 2 && x2 == 5 && x3 == 8) || (x1 == 2 && x2 == 8 && x3 == 5) || (x1 == 5 && x2 == 8 && x3 == 2)
				|| (x1 == 5 && x2 == 2 && x3 == 8) || (x1 == 8 && x2 == 5 && x3 == 2)
				|| (x1 == 8 && x2 == 2 && x3 == 5)) {
			res = true;
		}
		if ((x1 == 0 && x2 == 4 && x3 == 8) || (x1 == 0 && x2 == 8 && x3 == 4) || (x1 == 8 && x2 == 0 && x3 == 4)
				|| (x1 == 8 && x2 == 4 && x3 == 0) || (x1 == 4 && x2 == 0 && x3 == 8)
				|| (x1 == 4 && x2 == 8 && x3 == 0)) {
			res = true;
		}
		if ((x1 == 2 && x2 == 4 && x3 == 6) || (x1 == 2 && x2 == 6 && x3 == 4) || (x1 == 4 && x2 == 2 && x3 == 6)
				|| (x1 == 4 && x2 == 6 && x3 == 2) || (x1 == 6 && x2 == 4 && x3 == 2)
				|| (x1 == 6 && x2 == 2 && x3 == 4)) {
			res = true;
		}

		return res;

	}

	// Compueba si gana el usuario usando el vector. En este caso no sera necesario
	// usar las variables o1, o2, o3

	public static boolean ganaUsuario(int[] x) {

		boolean aux = false;

		if ((x[0] == 1 && x[1] == 1 && x[2] == 1) || (x[3] == 1 && x[4] == 1 && x[5] == 1)
				|| (x[6] == 1 && x[7] == 1 && x[8] == 1) || // horizontales
				(x[0] == 1 && x[3] == 1 && x[6] == 1) || (x[1] == 1 && x[4] == 1 && x[7] == 1)
				|| (x[2] == 1 && x[5] == 1 && x[8] == 1) || // verticales
				(x[0] == 1 && x[4] == 1 && x[8] == 1) || (x[2] == 1 && x[4] == 1 && x[6] == 1)) // diagonales

		{
			aux = true;
		}
		return aux;

	}

	// m�todo para limpiar el vector

	public static void limpiarTablero(int[] vector) {
		for (int i = 0; i < vector.length; i++) {
			vector[i] = 0;
		}
	}

}
