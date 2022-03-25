/*
 * Boletin6Ejercicio13
 * Mostrar cada letra de una cadena con el número de
 * veces que aparece en ella.
 */
package soluciones;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Boletin6Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una cadena");
        String cadena = sc.nextLine();
        
        cadena = cadena.toLowerCase();
        int[] veces = new int['z' - 'a' +1];
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            int indice = c -'a';
            if (indice >= 0 && indice < veces.length) {
                veces[indice]++;
            }
        }
        for (char c = 'a' ; c <= 'z'; c++) {
            int indice = c- 'a';
            if (veces[indice] > 0) {
                System.out.println(c + ": " + veces[indice] + " veces");
            }
        }
    }
    
}
