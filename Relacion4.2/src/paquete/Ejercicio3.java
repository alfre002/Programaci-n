package paquete;

public class Ejercicio3 {

//	Escribe un programa que pida 20 números enteros. Estos números se deben introducir en un array de 4 filas
//	por 5 columnas. El programa mostrará las sumas parciales de filas y columnas igual que si de una hoja de
//	cálculo se tratara. La suma total debe aparecer en la esquina inferior derecha.

//	Modifica el programa anterior de tal forma que los números que se introducen en el array se generen de
//	forma aleatoria (valores entre 100 y 999).

	public static void main(String[] args) {

		// ARRAY
		int[][] num = new int[4][5];

		// SUMA FILAS
		int sumaFilas = 0;
		
		// SUMA COLUMNAS
		int sumaColumnas = 0;
		
		// SUMA TOTAL
		int sumaTotal = 0;

		// ARRAY Y SUMA DE FILAS
		for (int i = 0; i < 4; i++) {
			sumaFilas = 0;
			for (int j = 0; j < 5; j++) {
				int aleatorio = (int) (Math.random() * 899 + 100);
				num[i][j] = aleatorio;
				System.out.printf("     %2d", num[i][j]);
				sumaFilas += num[i][j];
				sumaColumnas += num[i][0]; 
			}
			System.out.printf("   |   %2d" , sumaFilas);
			System.out.println();
			System.out.println();
		}
		
		// SUMA DE COLUMNAS
		System.out.println("------------------------------------------------------");
		
		for (int j = 0; j < 5; j++) {
			sumaColumnas = 0;
			for (int i = 0; i < 4; i++) {
				sumaColumnas += num[i][j]; 
				sumaTotal += sumaColumnas;
			}
			System.out.print("  ");
			System.out.printf("  %2d" , sumaColumnas);
		}
		
		System.out.println("   |" + "   " +  sumaTotal);
		

	}

}
