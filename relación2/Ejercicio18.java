package relación2;

import java.util.Scanner;

//Escribe un programa que obtenga los números enteros comprendidos entre dos números introducidos por
//teclado y validados como distintos, el programa debe empezar por el menor de los enteros introducidos e ir
//incrementando de 7 en 7.

public class Ejercicio18 {

	public static void main(String[] args) {


		Scanner sn = new Scanner(System.in);
		System.out.println("introduce un número");
		int n=sn.nextInt();
		System.out.println("introduce un número");
		int m=sn.nextInt();
		
		if (n!=m) {
			while (n<m) {
			
			System.out.println(n);
			n=n+7;
		}
			while (m<n) {
							
				m=m+7;
			}}
			else {
				System.out.println("los números introducidos son iguales");
		}
		sn.close();
		}
		
	}


