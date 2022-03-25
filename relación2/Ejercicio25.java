package relación2;

import java.util.Scanner;

public class Ejercicio25 {

	//Realiza un programa que pida un número por teclado y que luego muestre ese número al revés
	
	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);
		System.out.println("introduce un número");
		int num = sn.nextInt();
		
		while (num>0) {
			System.out.println(num%10);
			num = num/10;
		}
		sn.close();
	}

}
