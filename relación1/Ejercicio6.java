package relación1;

import java.util.Scanner;



public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		double IVA=1.21;
		
		
		System.out.println("Introduce la base imponible");
		double base=sn.nextDouble();
		
		System.out.println("el total de la factura es de "+base*IVA+" euros");
	

	}

}
