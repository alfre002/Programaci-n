package relación2;

//Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de los 5 primeros números enteros
//a partir de uno que se introduce por teclado.

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {

		System.out.println("escribe un número");
		Scanner sn = new Scanner(System.in);
		int num=sn.nextInt();
		int cont=1;
		
		while (cont<=5) {
			cont=cont+1;
			System.out.println(num+1 + " ,cuadrado: " + (num+1)*(num+1) + " ,cubo: " + (num+1)*(num+1)*(num+1));
			num=num+1;
		}
		sn.close();
		
	}

}
