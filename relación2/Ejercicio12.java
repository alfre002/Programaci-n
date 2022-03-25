package relación2;

import java.util.Scanner;

//Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. El primer término de la
//serie de Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los dos anteriores, por lo que
//tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se debe introducir
//por teclado.

public class Ejercicio12 {

	public static void main(String[] args) 
	{System.out.println("escribe un número");
	Scanner sn = new Scanner(System.in);
	int n=sn.nextInt();
	int cont = 1;
	int fn_1 = 0;
	int fn_2 = 1;
	System.out.println(fn_1);
	System.out.println(fn_2);
	
	while (n>cont) {
		cont=cont+1;
		 
		int fn = fn_1+fn_2;
		fn_1=fn_2;
		fn_2=fn;
		System.out.println(fn);
		
		
	}
	
sn.close();
		
		
	}

}
