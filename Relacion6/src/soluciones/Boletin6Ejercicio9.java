/*
 * Boletin6Ejercicio9
 * Comprobar si una cadena está en Javalandés, y en caso afirmativo
 * mostrar el mensaje que contiene .
 */
package soluciones;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Boletin6Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean javalandes, dialecto;
        Scanner sc = new Scanner(System.in);
        String mensaje;
        
        System.out.println("Introduzca una frase en Javalandés");
        String frase = sc.nextLine();
        javalandes = frase.indexOf("Javalin, javalon") == 0;
        dialecto = frase.lastIndexOf("javalen, len, len") == frase.length() - 17;
        if (javalandes) {
            System.out.println("La frase está en Javalandés");
            mensaje = frase.substring(16).trim();
            System.out.println("Mensaje: " + mensaje);
        }
        if (dialecto) {
            System.out.println("La frase está en el dialecto de Javalandia");
            mensaje = frase.substring(0, frase.length() - 17).trim();
            System.out.println("Mensaje: " + mensaje);
        }
        if (!javalandes && !dialecto) {
            System.out.println("La frase no está en Javalandés ni en su dialecto");
        }    
        
    }
    
}
