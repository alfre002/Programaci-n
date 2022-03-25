package paquete;

public class Ejercicio5 {

//	Realiza un programa que rellene un array de 6 filas por 10 columnas con números enteros positivos
//	comprendidos entre 0 y 1000 (ambos incluidos). A continuación, el programa deberá dar la posición tanto del
//	máximo como del mínimo.

	public static void main(String[] args) {

		int[][] numeros = new int[6][10];

		int maximo = 0;
		int filaMaximo = 0;
		int columnaMaximo = 0;

		int minimo = 1000;
		int filaMinimo = 0;
		int columnaMinimo = 0;
		;

		System.out.print("         ");

		for (int i = 0; i < 10; i++) {
			System.out.printf("    Columna%2s", i);
		}

		System.out.println();
		System.out.println();

		for (int i = 0; i < 6; i++) {
			System.out.print("Fila " + i);
			for (int j = 0; j < 10; j++) {
				int tirada = (int) (Math.random() * 1001);
				numeros[i][j] = tirada;
				System.out.printf("          %2d", numeros[i][j]);
				if (tirada > maximo) {
					maximo = tirada;
					filaMaximo = i;
					columnaMaximo = j;
				}
				if (tirada < minimo) {
					minimo = tirada;
					filaMinimo = i;
					columnaMinimo = j;
				}
			}
			System.out.println();
			System.out.println();
		}

		System.out.println(
				"maximo " + maximo + " ; posición de la fila: " + filaMaximo + " ; posición de la columna: " + columnaMaximo);
		System.out.println(
				"minimo " + minimo + " ; posición de la fila: " + filaMinimo + " ; posición de la columna: " + columnaMinimo);
	}

}
