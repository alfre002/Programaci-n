package relación2;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {

		System.out.println("escribe un número");
		Scanner sn = new Scanner(System.in);
		int num=sn.nextInt();
		
		if (num>0 & num<10) {
			System.out.println("este número tiene 1 dígito");
		}
	
		if (num>=10 & num<100) {
			System.out.println("este número tiene 2 dígitos");
		}
		
		if (num>=100 & num<1000) {
			System.out.println("este número tiene 3 dígitos");
		}
		
		if (num>=1000 & num<10000) {
			System.out.println("este número tiene 4 dígitos");
		}
		sn.close();
	}

}
