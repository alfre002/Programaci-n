/*
 * Boletin6Ejercicio1
 * Aceptar dos palabras por teclado y dedcir cuál es la más corta
 */
package soluciones;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Boletin6Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una cadena");
        String palabra1 = sc.nextLine();
        System.out.println("Introduzca otra");
        String palabra2 = sc.nextLine();
        if ( palabra1.length() < palabra2.length() ) {
            System.out.println("La palabra " + palabra1 + " es la más corta");
        } else if (palabra1.length() > palabra2.length()) {
            System.out.println("La palabra " + palabra2 +  " es la más corta");
        } else {
            System.out.println("Son iguales de largas");
        }
        
    }
    
}
