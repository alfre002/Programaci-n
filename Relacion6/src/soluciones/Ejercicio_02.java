package soluciones;
/* 2. Dise�ar el juego acierta la contrase�a. La mec�nica del juego es la siguiente: 
 * el primer jugador introduce la contrase�a; a continuaci�n, el segundo jugador debe teclear 
 * palabras hasta que la acierte. Realizar dos versiones; en la primera las �nicas pistas que 
 * se proporcionan son el n�mero de caracteres y cu�les son el primer y el �ltimo car�cter 
 * de la contrase�a. En la segunda versi�n se facilita el juego indicando si 
 * la palabra introducida es mayor o menor, alfab�ticamente, que la contrase�a
 */

import java.util.Scanner;

public class Ejercicio_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	Scanner sc = new Scanner (System.in);
	        System.out.println("Introduce la contrase�a a adivinar: ");
	        String pass = sc.nextLine();
	        boolean adivina = false;
	        
	        System.out.println("Pistas...");
	        
	        System.out.println("Numero de caracteres: " + pass.length());
	        System.out.println("Caracter inicial: " + pass.charAt(0));//c[0]);
	        System.out.println("Caracter final: " + pass.charAt(pass.length()-1));//c[c.length-1]);
	        
	        while (!adivina){
	            System.out.println("Adivina la contrase�a: ...");
	            String intento = sc.nextLine();
	            
	            if (pass.equals(intento)){
	                adivina=true;
	            } else {
	                int r;
	                r=pass.compareTo(intento);
	                if(r>0){
	                    System.out.println("La contrase�a es posterior alfab�ticamente");
	                }else {
	                    System.out.println("La contrase�a es anterior alfab�ticamente");
	                }
	            }
	            
	        }
	        if(adivina) {
	        	System.out.println(" �Contrase�a correcta!");
	        	
	        }
	      sc.close();  
	        
	    }

	}

