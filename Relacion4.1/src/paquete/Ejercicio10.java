package paquete;

public class Ejercicio10 {

//	Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y que los
//	almacene en un array. El programa debe ser capaz de pasar todos los números pares a las
//	primeras posiciones del array (del 0 en adelante) y todos los números impares a las celdas
//	restantes. Utiliza arrays auxiliares si es necesario.

	public static void main(String[] args) {

		// ARRAY NUMEROS ALEATORIOS
		int numeros[] = new int[20];

		// PARES
		int par[] = new int[20];
		int pares = 0;

		// IMPARES
		int impar[] = new int[20];
		int impares = 0;
		
		int i;
		

		// NUMEROS ALEATORIOS
		for (i = 0; i < 20; i++) {
			numeros[i] = (int) (Math.random() * 101);

			if (numeros[i] % 2 == 0) {
				par[pares++] = numeros[i];
			} else {
				impar[impares++] = numeros[i];
			}
			System.out.printf("  %2d", numeros[i]);
		}
		
		System.out.println();
		
		// ARRAY ORDENADO
		for (i = 0; i < pares; i++) {
			numeros[i] = par[i];
		}
		
		for (i = pares; i < 20; i++) {
			numeros[i] = impar[i - pares];
		}
		
		System.out.println("ARRAY ORDENADO" );
		for (i = 0; i < 20; i++) {
			System.out.printf("  %2d" , numeros[i]);
			
		}
		
	}

}
