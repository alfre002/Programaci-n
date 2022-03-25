package relación2;

import java.util.Scanner;

//Escribe un programa que diga si un número introducido por teclado es o no primo. Un número primo es
//aquel que sólo es divisible entre él mismo y la unidad.

public class Ejercicio16 {

		public static void main(String[] args) {

			Scanner sn = new Scanner(System.in);
			System.out.println("introduce un número");
			int n = sn.nextInt();
			
			boolean esPrimo ;
		

				esPrimo = true;
			
				for (int i = 2 ; i < n ; i++) {
					if (n%i==0) {
						esPrimo = false;
						}
					
					}	//comprueba si hay divisores

				if (esPrimo){
					System.out.println("el número " + n + " es primo");}
					else {
					System.out.println("no es primo");
				}
				sn.close();
				
			}
			
			}
	