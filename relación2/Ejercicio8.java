package relación2;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		System.out.println("escribe un número");
		Scanner sn = new Scanner(System.in);
		int num=sn.nextInt();
		int cont=1;
		
		while (cont>=1 & cont<=9) {
			cont=cont+1;
			System.out.println(num*cont);
		}
		sn.close();
		
			}
		
		
	}


