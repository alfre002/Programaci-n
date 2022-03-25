package relación2;

import java.util.Scanner;

//Escribe un programa que permita ir introduciendo una serie indeterminada de números 
//mientras su suma no supere el valor 10000. Cuando esto último ocurra, se debe mostrar 
//el total acumulado, el contador de los números introducidos y la media.

public class Ejercicio23 {

	public static void main(String[] args) {

		System.out.println("introduce números");
		Scanner sn = new Scanner(System.in);

		int suma = 0;
		int cont=0;
		
		for (int n = 0; suma < 10000;) {
			n=sn.nextInt();
			suma = suma + n;
			cont +=1;
		}
		sn.close();
			System.out.println(" la suma de todos esos números es " + suma);
			System.out.println(" hay " + cont + " números introducidos");
			System.out.println(" la media de esos números es " + (suma/cont));
		}
		
		
		
		
	}
	

