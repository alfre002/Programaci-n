package paquete;

import java.util.Scanner;

public class TresRaya {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		// tablero
		String[] tablero = new String[] { "-", "-", "-", "-", "-", "-", "-", "-", "-" };
		// fichas del ordenador
		int x1 = 0;
		int x2 = 0;
		int x3 = 0;
		// fichas del usuario
		int o1 = 0;
		int o2 = 0;
		int o3 = 0;

		// bienvenida
		System.out.println("¡¡Bienvenido al juego!!"); // da la bienvenida
		System.out.println();
		imprimeTablero(tablero); // imprime el tablero

		do {
			System.out.println();
			System.out.println("Es turno del usuario"); // turno del usuario
			System.out.println("Elige la posición donde quieras colocar tu ficha"); // pide posición al usuario
			String movimiento = s.nextLine();
			while (conviertePosicionMovimiento(movimiento) == -1) { // para movimientos inválidos
				System.out.println("Movimiento inválido, vuelva a introducir uno");
				movimiento = s.nextLine();
			}
			System.out.println("Movimiento válido"); // para movimientos válidos
			System.out.println();
			usuarioMueveFicha(tablero, movimiento); // se coloca la ficha del usuario
			imprimeTablero(tablero); // imprime de nuevo el tablero
			ganaUsuario(o1, o2, o3); // comprueba si gana el usuario
			System.out.println();
			System.out.println();
			System.out.println("Es turno de la máquina"); // turno de la máquina
			System.out.println();
			mueveFichaAleatoria(tablero); // la máquina realiza un movimiento
			imprimeTablero(tablero); // vuelve a imprimir el tablero
			ganaPrograma(x1, x2, x3); // comprueba si gana el programa

		} while (ganaUsuario(o1, o2, o3) == false || ganaPrograma(x1, x2, x3) == false); // repetir mientras no haya
																							// ganador

		if (ganaPrograma(x1, x2, x2) == true) { // mensaje si gana la máquina
			System.out.println("HA GANADO LA MÁQUINA!!!");
		}

		if (ganaUsuario(o1, o2, o3) == true) { // mensaje si gana el usuario
			System.out.println("HA GANADO EL USUARIO!!!");
		}

		System.out.println("LA PARTIDA HA TERMINADO EN EMPATE, ¿¿QUIERES VOLVER A JUGAR?? , (s/n)"); // mensaje de
																										// empate y si
																										// se quiere
																										// volver a
																										// jugar

		String otraPartida = s.nextLine();
		if (otraPartida == "s") {

		} else {
			System.out.println("ADIOS!!");
		}

		s.close(); // cierra escáner

	}

	public static void imprimeTablero(String[] tablero) {

		if (usuarioMueveFicha(tablero, null) == true) {
//			tablero[conviertePosicionMovimiento(movimiento)] = "O";
		}

		for (int i = 0; i < 9; i++) {
			System.out.printf("           %s", tablero[i]);
			if (i == 2 || i == 5) {
				System.out.println();
				System.out.println();
			}
		}

	}

	public static int conviertePosicionMovimiento(String movimiento) {

		// convertir todo en minúscula
		String movimiento2 = movimiento.toLowerCase();

		switch (movimiento2) {
		case "arriba izquierda":
			return 0;

		case "arriba centro":
			return 1;

		case "arriba derecha":
			return 2;

		case "centro izquierda":
			return 3;

		case "centro centro":
			return 4;

		case "centro derecha":
			return 5;

		case "abajo izquierda":
			return 6;

		case "abajo centro":
			return 7;

		case "abajo derecha":
			return 8;

		default:
			return -1;
		}

	}

	public static boolean usuarioMueveFicha(String[] tablero, String movimiento) {

		if (tablero[conviertePosicionMovimiento(movimiento)] == "-") {
			return true;
		} else {
			return false;
		}
	}

	public static int mueveFichaAleatoria(String[] tablero) {

		int numAleatorio = (int) (Math.random() * 9);

		return numAleatorio;
	}

	public static void limpiarTablero(int x1, int x2, int x3, int o1, int o2, int o3) {

		x1 = 0;
		x2 = 0;
		x3 = 0;
		o1 = 0;
		o2 = 0;
		o3 = 0;

	}

	public static boolean ganaPrograma(int x1, int x2, int x3) {

		if ((x1 == 0 && x2 == 1 && x3 == 2) || (x1 == 0 && x2 == 2 && x3 == 1) || (x1 == 1 && x2 == 0 && x3 == 2)
				|| (x1 == 1 && x2 == 2 && x3 == 0) || (x1 == 2 && x2 == 0 && x3 == 1)
				|| (x1 == 2 && x2 == 1 && x3 == 0)) {
			return true;
		} else {
			return false;
		}

//		if ((x1 == 3 && x2 == 4 && x3 == 5) || (x1 == 3 && x2 == 5 && x3 == 4) || (x1 == 4 && x2 == 3 && x3 == 5)
//				|| (x1 == 4 && x2 == 5 && x3 == 3) || (x1 == 5 && x2 == 3 && x3 == 4)
//				|| (x1 == 5 && x2 == 4 && x3 == 3)) {
//			return true;
//		}else {
//			return false;
//		}

	}

	public static boolean ganaUsuario(int o1, int o2, int o3) {
		if ((o1 == 0 && o2 == 1 && o3 == 2) || (o1 == 0 && o2 == 2 && o3 == 1) || (o1 == 1 && o2 == 0 && o3 == 2)
				|| (o1 == 1 && o2 == 2 && o3 == 0) || (o1 == 2 && o2 == 0 && o3 == 1)
				|| (o1 == 2 && o2 == 1 && o3 == 0)) {
			return true;
		} else {
			return false;
		}
	}

}
