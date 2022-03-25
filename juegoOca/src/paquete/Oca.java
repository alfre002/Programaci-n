package paquete;

import java.util.Scanner;

public class Oca {

	static int TAMCIRCUITO = 11;

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		// ATRIBUTOS
		int minDado, maxDado, tirada1, tirada2;
		String nomJ1, nomJ2;
		int fichaJ1 = 0;
		int fichaJ2 = 0;

		System.out.println("Bienvenido al juego de la oca");

		// minimo y maximo de dados
		System.out.println("¿Cuál es el número mínimo del dado?");
		minDado = s.nextInt();
		System.out.println("¿Cuál es el número máximo del dado?");
		maxDado = s.nextInt();

		// nombre de los jugadores
		s.nextLine();
		System.out.println("¿Cuál es el nombre del jugador 1?");
		nomJ1 = s.nextLine();
		System.out.println("¿Cuál es el nombre del jugador 2?");
		nomJ2 = s.nextLine();
		while (nomJ2.equals(nomJ1)) {
			System.out.println("Los 2 jugadores no se pueden llamar igual");
			System.out.println("¿Cuál es el nombre del jugador 2?");
			nomJ2 = s.nextLine();
		}
		System.out.println("\n¡EMPIEZA EL JUEGO!");
		pintaPista(fichaJ1, fichaJ2);

		do {
			// introducir carácter
			System.out.println("\nPulse cualquier tecla para continuar");
			String x = s.nextLine();
			// TURNO DEL JUGADOR 1
			System.out.println("\nTurno para el jugador 1, " + nomJ1);
			// tiradas J1
			tirada1 = tiraDados(minDado, maxDado);
			tirada2 = tiraDados(minDado, maxDado);
			System.out.println("Ha sacado un " + tirada1 + " en la primera tirada");
			System.out.println("Ha sacado un " + tirada2 + " en la segunda tirada");
			// comprobar primo
			if (sumaDeNumerosEsPrimo(tirada1, tirada2)) {
				System.out.println("TIRADA VÁLIDA");
				fichaJ1 += tirada1 + tirada2;
			} else {
				System.out.println("TIRADA NO VÁLIDA");
				System.out.println("No suma puntos ya que la suma de las tiradas NO ES PRIMO");
			}
			// imprime tablero y comprueba carrera
			pintaPista(fichaJ1, fichaJ2);
			imprimeComoVaLaCarrera(nomJ1, nomJ2, fichaJ1, fichaJ2);

			// TURNO DEL JUGADOR 2
			System.out.println("\nTurno para el jugador 2, " + nomJ2);
			// tiradas J2
			tirada1 = tiraDados(minDado, maxDado);
			tirada2 = tiraDados(minDado, maxDado);
			System.out.println("Ha sacado un " + tirada1 + " en la primera tirada");
			System.out.println("Ha sacado un " + tirada2 + " en la segunda tirada");
			// comprueba primo
			if (sumaDeNumerosEsPrimo(tirada1, tirada2)) {
				System.out.println("TIRADA VÁLIDA");
				fichaJ2 += tirada1 + tirada2;
			} else {
				System.out.println("TIRADA NO VÁLIDA");
				System.out.println("No suma puntos ya que la suma de las tiradas NO ES PRIMO");
			}
			// imprime tablero y comprueba carrera
			pintaPista(fichaJ1, fichaJ2);
			imprimeComoVaLaCarrera(nomJ1, nomJ2, fichaJ1, fichaJ2);
		} while (esGanador(nomJ1, nomJ2, fichaJ1, fichaJ2) == "");
		
		// ganador
		System.out.println("\n¡¡¡ENHORABUENA " + esGanador(nomJ1, nomJ2, fichaJ1, fichaJ2) + " , HAS GANADO!!!");

	}

	// TIRAR DADOS
	public static int tiraDados(int minDado, int maxDado) {
		int intervalo = maxDado - minDado + 1;
		int aleatorio = (int) (Math.random() * intervalo + minDado);
		return aleatorio;
	}

	// PINTAR PISTA
	public static void pintaPista(int fichaJ1, int fichaJ2) {
		for (int i = 1; i <= TAMCIRCUITO; i++) {
			System.out.print("\t" + i);
		}
		// ficha J1
		System.out.println();
		for (int i = 0; i <= fichaJ1 - 1; i++) {
			System.out.print("\t");
		}
		System.out.println("J1");
		// ficha J2
		for (int i = 0; i <= fichaJ2 - 1; i++) {
			System.out.print("\t");
		}
		System.out.println("J2");
	}

	// ES PRIMO
	public static boolean sumaDeNumerosEsPrimo(int tirada1, int tirada2) {
		int suma = tirada1 + tirada2;
		if (suma < 2) {
			return false;
		} else {
			for (int i = suma - 1; i >= 2; i--) {
				if (suma % i == 0) {
					return false;
				}
			}
		}
		return true;
	}

	// IMPRIME COMO VA LA CARRERA
	public static void imprimeComoVaLaCarrera(String nomJ1, String nomJ2, int fichaJ1, int fichaJ2) {
		if (fichaJ1 > fichaJ2) {
			System.out.println("\nVa ganando el jugador 1, " + nomJ1);
		} else if (fichaJ2 > fichaJ1) {
			System.out.println("\nVa ganando el jugador 2, " + nomJ2);
		} else {
			System.out.println("\nVan empate");
		}

	}
	
	// ES GANADOR
	public static String esGanador(String nomJ1, String nomJ2, int fichaJ1, int fichaJ2) {
		if(fichaJ1 >= 11) {
			return nomJ1;
		} else if(fichaJ2 >= 11) {
			return nomJ2;
		} else {
			return "";
		}
	}

}
