package soluciones;
/*  4. Dise�ar una aplicaci�n que pida al usuario que introduzca una frase por teclado
 *  e indique cu�ntos espacios en blanco tiene.
 */

import java.util.Scanner;

public class Ejercicio_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Introduzca cadena");
		        String cadena = sc.nextLine();
		        System.out.println("El n�mero de espacios es " +
		                contarEspacios(cadena));  
		        sc.close();
		    }
		    
		    public static int contarEspacios(String cadena) {
		        int cuenta = 0;
		        for (int i = 0; i < cadena.length(); i++) {
		            if (cadena.charAt(i) == ' ') {
		                cuenta++;
		            }
		        }
		        return cuenta;
		    }
		    
		}
	


