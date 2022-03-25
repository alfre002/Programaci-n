package relación2;

import java.util.Scanner;

//Realiza un programa que vaya pidiendo números hasta que se introduzca un numero 
//negativo y nos diga cuantos números se han introducido, la media de los impares y 
//el mayor de los pares. El número negativo sólo se utiliza para indicar el final de 
//la introducción de datos pero no se incluye en el cómputo.

public class Ejercicio21 {

	public static void main(String[] args) {

		System.out.println("introduce números");
		Scanner sn = new Scanner(System.in);
		
		double recuento = 0;
		int num;
		double suma = 0;
		int pares = 0 ;
		int impares = 0;
		
		  

		do {
			 num = sn.nextInt();
		      recuento++;
		      suma += num;
		      if (num%2==0) {
		    	  pares += 1;}
		    	  else {
		    		  impares+=1;
		    	  }
		
		if (num < 0) {
			pares -= 1;
		
		}
		
		} while (num >= 0) ;
		      
		
		
		      sn.close();
			  System.out.println("La media de los números positivos introducidos es " + (suma - num)/ (recuento - 1));
			  System.out.println("Los números pares introducidos son " + pares);
			  System.out.println("los números impares introducidos son " + impares);
			  
		} }
		    
		 
		

	
	

