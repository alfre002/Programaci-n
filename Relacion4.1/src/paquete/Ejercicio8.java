package paquete;
import java.util.Scanner;

public class Ejercicio8 {
	
//	Realiza un programa que pida la temperatura media que ha hecho en cada mes de un
//	determinado año y que muestre a continuación un diagrama de barras horizontales con
//	esos datos. Las barras del diagrama se pueden dibujar a base de asteriscos o cualquier otro
//	carácter.
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		//array
		int numeros[] = new int[12];
		
		//mes
		int mes = 1;

		//pedir temperatura por cada mes
		for (int i = 0; i < 12; i++) {
			System.out.println("introduzca la temperatura del mes " + mes);
			numeros[i] = s.nextInt();
			mes +=1;
		}
		
		//pintar barras
		pintarBarra(numeros);
		
		
//		//pintar 1ª barra
//		for (int i = 0; i < numeros[0]; i++) {
//			System.out.print("*");
//		}
		
	}
	
	public static void pintarBarra(int[] numeros) {
		for (int x = 0; x < 12; x++) {
			System.out.printf("mes  %2d : " ,(x+1));
		for (int i = 0; i < numeros[x]; i++) {

			System.out.print("*");
		}
		System.out.println("");
		}
	}

}
