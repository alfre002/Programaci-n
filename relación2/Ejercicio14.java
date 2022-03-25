package relación2;

import java.util.Scanner;

//Escribe un programa que pida una base y un exponente (entero positivo) y 
//que calcule la potencia.

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("introduce la base");
		int b=sn.nextInt();
		System.out.println("introduce el exponente (entero positivo)");
		int e=sn.nextInt();
		int resultado=1;
		int i;
	
		//para i = 1 hasta que i sea igual o menor que e, i va incrementando)
		for (i=1; i<=e; i++) {
			resultado=resultado*b;
			
		}
		System.out.println("el " + b + " elevado a " + (i-1) + " es " + resultado);
		sn.close();
		
		}
	
	}
