package relación2;

import java.util.Scanner;

//Escribe un programa que dados dos números, uno real (base) y un entero positivo(exponente), saque por
//pantalla todas las potencias con base el numero dado y exponentes entre uno y el exponente introducido. No
//se deben utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5, se deberán mostrar
//2¹ 2² 2³ 2⁴ y 2⁵.

public class Ejercicio15 {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);
		System.out.println("introduce la base");
		int b=sn.nextInt();
		System.out.println("introduce el exponente (entero positivo)");
		int e=sn.nextInt();
		int resultado=1;
	
		//para i = 1 hasta que i sea igual o menor que e, i va incrementando)
		for (int i=1; i<=e; i++) {
			resultado=resultado*b;
			System.out.println("el " + b + " elevado a " + i + " es " + resultado);
		}
		
		sn.close();
		
		}
	
	}


		
	
	


