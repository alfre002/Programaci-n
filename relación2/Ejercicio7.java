package relación2;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		int contraseña = 6289;
		Scanner sn = new Scanner(System.in);
		
		System.out.println("Introduce la contraseña de la caja fuerte");
		int clave=sn.nextInt();
		
		if (clave==contraseña) {
			System.out.println("la caja fuerte se ha abierto satisfactoriamente");
		}
		
		else {
				System.out.println("Lo siento, esa no es la combinación");
			}
		sn.close();
		}
		
		
	}


