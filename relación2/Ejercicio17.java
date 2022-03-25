package relación2;

import java.util.Scanner;

//Realiza un programa que sume los 100 números siguientes a un número entero y positivo introducido por
//teclado. Se debe comprobar que el dato introducido es correcto (que es un número positivo).

public class Ejercicio17 {

	public static void main(String[] args) {


		Scanner sn = new Scanner(System.in);
		System.out.println("introduce un número");
		int n=sn.nextInt();
		int cont=0;
		int suma=0;
		
		if (n>0) {
		while (cont<=100) {
			cont=cont+1;
			suma=suma+n;
			n=n+1;
			
		}}
		else {
			System.out.println("el número introducido es negativo");
		}
		sn.close();
		System.out.println("la suma es de " + suma);
	}}



