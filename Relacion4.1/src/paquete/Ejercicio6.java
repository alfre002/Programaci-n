package paquete;
import java.util.Scanner;

public class Ejercicio6 {

//	Escribe un programa que lea 15 números por teclado y que los almacene en un array. Rota
//	los elementos de ese array, es decir, el elemento de la posición 0 debe pasar a la posición
//	1, el de la 1 a la 2, etc. El número que se encuentra en la última posición debe pasar a la
//	posición 0. Finalmente, muestra el contenido del array

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		// array
		int[] numeros = new int[15];
		// primer número de la matriz
		int primero = numeros[0];

		// rellenar la matriz por teclado
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("introduzca un número por teclado");
			numeros[i] = s.nextInt();
		}

		// pintar matriz normal
		System.out.println("Matriz normal: ");
		for (int j = 0; j < numeros.length; j++) {
			System.out.print(numeros[j] + " ");
		}

		// rotar matriz
		rotar(numeros);
		
		System.out.println(" ");

		// pintar matriz rotada
		System.out.println("Matriz rotada: ");
		for (int j = 0; j < numeros.length; j++) {
			System.out.print(numeros[j] + " ");
		}

	}

	public static void rotar(int[] numeros) {
		int aux = numeros[0];
		// todos rotan menos el último
		for (int i = 0; i < numeros.length -1 ; i++) {
			numeros[i] = numeros[i + 1];
		}
		// el último pasa al primero
		numeros[numeros.length - 1] = aux;
	}
}
