package hundirFlota;

import java.util.Scanner;

//Juego de tablero para dos jugadores
// Tablero con 10x10 posiciones (A-J, 1-10)
// Se colocan varios barcos en posición horizontal o vertical
// Comienza un usuario diciendo unas coordenadas, y el contrario le indica si la bomba lanzada toca un
//barco o cae en él.
// Colocamos 2 barcos de 5 casillas, 3 de 3 casillas y 5 de 1 casilla (24 en total)
// No vamos a detectar si un tiro hunde completamente un barco (complejidad de comprobar todas las
//casillas de alrededor).
// Por contra, contabilizamos (y vamos restando) los PUNTOS del usuario (inicialmente 24).
// Aunque no podemos ver el mapa del oponente (lógico) vamos llevando un registro de dónde tiramos
//una bomba, para no repetir, en una matriz adicional.

public class HundirFlota {

	public static void main(String[] args) {

		// tablero
		String[][] tablero = new String[10][10];

		// relleno la matriz con . para que posteriormente guarde valores
		for (int filas = 0; filas < 10; filas++) {
			for (int columnas = 0; columnas < 10; columnas++) {
				tablero[filas][columnas] = "."; // lo de dentro de la matriz

			}
		}

		// booleanos
		boolean ganador = false;

		// escáner
		Scanner s = new Scanner(System.in);

		// pedir nombre del jugador
		System.out.println("¿CUÁL ES EL NOMBRE DEL JUGADOR?");
		String jugador = s.next();

		System.out.println();
		barcosOrdenador(tablero);
		do {
			// TURNO DEL JUGADOR
			System.out.println("TURNO DE " + jugador);
			System.out.println();
			System.out.println("INTRODUZCA UNA CASILLA, por ejemplo, c6");
			String casilla = s.next();
			
			pintarTablero(tablero);

		} while (!ganador);

		System.out.println();

		// tablero del ordenador
		System.out.println("                         TABLERO DEL ORDENADOR");
		System.out.println();

	}

	public static void pintarTablero(String[][] tablero) {

		// array auxiliar para pintar la fila principal
		String[] caracterFila = new String[] { "[a]", "[b]", "[c]", "[d]", "[e]", "[f]", "[g]", "[h]", "[i]", "[j]" };
		// array auxiliar para pintar la columna principal
		String[] caracterColumna = new String[] { "[0]", "[1]", "[2]", "[3]", "[4]", "[5]", "[6]", "[7]", "[8]",
				"[9]" };

		// fila principal (a-j)
		System.out.print("    ");
		for (int filaPrincipal = 0; filaPrincipal < 10; filaPrincipal++) {
			System.out.printf("   %.3s", caracterColumna[filaPrincipal]);
		}
		System.out.println();
		System.out.println();

		// relleno de la matriz
		for (int filas = 0; filas < 10; filas++) {
			System.out.print(caracterFila[filas]);
			for (int columnas = 0; columnas < 10; columnas++) {
				// columna principal (0-9)
				System.out.printf("     %.1s", tablero[filas][columnas]);
			}
			System.out.println();
			System.out.println();
		}

	}

	public static void barcosOrdenador(String[][] tablero) {

		// COLOCAR BARCOS (FILAS a-j)
		int posicionFilaP = (int) (Math.random() * 5); // portaaviones H (0-4)
		int posicionFilaB = (int) (Math.random() * 3 + 5); // buque H (6-8)
		int posicionFilaB2 = (int) (Math.random() * 3 + 5); // buque V (6-8)
		int posicionFilaB3 = (int) (Math.random() * 3 + 5); // buque V (2) (6-8)
		int posicionFilaS = (int) (Math.random() * 2 + 8); // submarino (8-9)

		// COLOCAR BARCOS (COLUMNAS 0-9)
		int posicionColumnaP = (int) (Math.random() * 5 + 5); // portaaviones V (6-9)
		int posicionColumnaB = (int) (Math.random() * 2); // buque V (0-1)
		int posicionColumnaS = (int) (Math.random() * 3 + 2); // submarino (2-4)

		// portaaviones H
		for (int filas = posicionFilaP; filas < posicionFilaP + 1; filas++) {
			for (int columnas = 0; columnas < 5; columnas++) {
				tablero[filas][columnas] = "5";
			}
		}

		// portaaviones V
		for (int filas = 0; filas < 5; filas++) {
			for (int columnas = posicionColumnaP; columnas < posicionColumnaP + 1; columnas++) {
				tablero[filas][columnas] = "5";
			}
		}

		// buque H
		for (int filas = posicionFilaB; filas < posicionFilaB + 1; filas++) {
			for (int columnas = 2; columnas < 5; columnas++) {
				tablero[filas][columnas] = "3";
			}
		}

		// buque V
		for (int filas = posicionFilaB2; filas < posicionFilaB2 + 3; filas++) {
			for (int columnas = posicionColumnaB; columnas < posicionColumnaB + 1; columnas++) {
				tablero[filas][columnas] = "3";
			}
		}

		// buque V (2)
		for (int filas = posicionFilaB3; filas < posicionFilaB3 + 3; filas++) {
			for (int columnas = posicionColumnaB + 8; columnas < posicionColumnaB + 9; columnas++) {
				tablero[filas][columnas] = "3";
			}
		}

		// submarino 1
		for (int filas = posicionFilaS; filas < posicionFilaS + 1; filas++) {
			for (int columnas = posicionColumnaS; columnas < posicionColumnaS + 1; columnas++) {
				tablero[filas][columnas] = "1";
			}
		}

		// submarino 2
		for (int filas = posicionFilaS; filas < posicionFilaS + 1; filas++) {
			for (int columnas = posicionColumnaS; columnas < posicionColumnaS + 1; columnas++) {
				tablero[filas][columnas] = "1";
			}
		}

		// String posicionFilaSt = null; // pasar de número a letra
		//
//				// pasar de número a letra
//				if (posicionFilaP == 0) {
//					posicionFilaSt = "a";
//				}
//				if (posicionFilaP == 1) {
//					posicionFilaSt = "b";
//				}
//				if (posicionFilaP == 2) {
//					posicionFilaSt = "c";
//				}
//				if (posicionFilaP == 3) {
//					posicionFilaSt = "d";
//				}
//				if (posicionFilaP == 4) {
//					posicionFilaSt = "e";
//				}
//				if (posicionFilaP == 5) {
//					posicionFilaSt = "f";
//				}
//				if (posicionFilaP == 6) {
//					posicionFilaSt = "g";
//				}
//				if (posicionFilaP == 7) {
//					posicionFilaSt = "h";
//				}
//				if (posicionFilaP == 8) {
//					posicionFilaSt = "i";
//				}
//				if (posicionFilaP == 9) {
//					posicionFilaSt = "j";
//				}

	}

}
