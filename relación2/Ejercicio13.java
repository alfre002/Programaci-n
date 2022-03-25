package relación2;

import java.util.Scanner;

//Escribe un programa que lea una lista de diez números y determine cuántos son positivos, y cuántos son
//negativos.

public class Ejercicio13 {

	public static void main(String[] args) {
		
		System.out.println("escribe un número");
		Scanner sn = new Scanner(System.in);
		int cont=0;
		int pos=0;
		int neg=0;
		
		while (cont<=10) {
			cont=cont+1;
			int n=sn.nextInt();
			if (n>0) {
				pos=pos+1;}
				else  {
				neg=neg+1;
			}
			
			System.out.println("positivos: " + pos);
			System.out.println("negativos: " + neg);
			
		}
		
		sn.close();
		
	}

	}
