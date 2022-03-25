/*
 * Boletin6Ejercicio5
 * Pedir el nombre completo del usuario y mostrarlo sin vocales
 */
package soluciones;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Boletin6Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su nombre completo");
        String nombre = sc.nextLine();
        System.out.println("Sin vocales: " + quitarVocales(nombre));
    }
    
    public static String quitarVocales(String cadena) {
        String resultado = "";
        for (int i = 0; i < cadena.length(); i++) {
            if (!esVocal(cadena.charAt(i))) {
                resultado += cadena.charAt(i);
            }
        }
        return resultado;
    }
    
    public static boolean esVocal(char c) {
        boolean vocal; 
        c = Character.toUpperCase(c);
         switch (c) {
             case 'A':
             case 'E':
             case 'I':
             case 'O':
             case 'U':
             case 'Á':
             case 'É':
             case 'Í':
             case 'Ó':
             case 'Ú':
                 vocal = true;
                 break;
             default:
                 vocal = false;         
         }
         return vocal;
    }
}
