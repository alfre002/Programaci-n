package paquete;
import java.util.Scanner;

public class Ejercicio12 {

//	Realiza un programa que pida 10 números por teclado y que los almacene en un array. A
//	continuación se mostrará el contenido de ese array junto al índice (0 – 9). Seguidamente el
//	programa pedirá dos posiciones a las que llamaremos “inicial” y “final”. Se debe
//	comprobar que inicial es menor que final y que ambos números están entre 0 y 9. El
//	programa deberá colocar el número de la posición inicial en la posición final, rotando el
//	resto de números para que no se pierda ninguno. Al final se debe mostrar el array
//	resultante.

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		// ARRAY PRINCIPAL
		int numeros[] = new int[10];

		for (int i = 0; i < 10; i++) {
			numeros[i] = s.nextInt();
		}

		// INDICE
		System.out.print("INDICE ");
		for (int i = 0; i < 10; i++) {
			System.out.printf("  %2d", i);
		}

		System.out.println();
		System.out.println();

		// VALOR
		System.out.print("VALOR  ");
		for (int i = 0; i < 10; i++) {
			System.out.printf("  %2d", numeros[i]);
		}

		System.out.println();
		
		// INICIAL
		System.out.println("INTRODUZCA LA POSICIÓN INICIAL");
		int pInicial = s.nextInt();

		// FINAL
		System.out.println("INTRODUZCA LA POSICIÓN FINAL");
		int pFinal = s.nextInt();
	
		// ROTAR
		if(pInicial < pFinal && pInicial>=0 && pInicial<=9 && pFinal>=0 && pFinal<=9) {
			// EL INICIAL PASA AL FINAL
			numeros[pFinal] = numeros[pInicial];
			
			for (int i = 0; i < numeros.length - 1; i++) {
				
			}
		}else {
			System.out.println("EL VALOR DE LA POSICIÓN INICIAL DEBE SER MENOR AL DE LA POSICIÓN FINAL Y "
					+ "AMBOS VALORES DEBEN ESTAR ENTRE 0 Y 9");
		}
		

		}
		
	}


