package relación2;

import java.util.Scanner;

//Realiza un programa que pida primero un número y a continuación un dígito. El programa nos debe dar la
//posición (o posiciones) contando de izquierda a derecha que ocupa ese dígito en el número introducido.
public class Ejercicio26 {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);
		System.out.println("introduce un número");
		int num = sn.nextInt();
		System.out.println("introduce un dígito de ese número");
		int dig = sn.nextInt();
		//longitud del número
		int longitud = 0;
		
		while (num>1) {
			num=num/10;
			longitud++;
		}
		
		
		if (num/10==dig) {
			System.out.println();
		}
		
		
		System.out.println(longitud);
		sn.close();
	}

}
