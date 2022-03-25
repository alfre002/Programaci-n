package relación2;

//Escribe un programa que calcule la media de un conjunto de números positivos introducidos por teclado. A
//priori, el programa no sabe cuántos números se introducirán. El usuario indicará que ha terminado de
//introducir los datos cuando meta un número negativo. soy un puto


import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		System.out.println("introduce 10 números");
		Scanner sn = new Scanner(System.in);
		
		int recuento = 0;
		double num = 0;
		double suma = 0;
		
		  while (num >= 0) {
		      num = sn.nextDouble();
		      recuento++;
		      suma += num;
		    }
		  sn.close();
		  System.out.println("La media de los n�meros positivos introducidos es " + (suma - num)/ (recuento - 1));
		}

	
	}


