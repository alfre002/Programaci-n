/*
 * Boletin6Ejercicio3
 * Leer palabras por separado y mostrarlas en una frase.
 * Las palabras terminarán con "fin"
 */
package soluciones;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Boletin6Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] tablaPalabras = new String[100];
        int numeroPalabras = 0;
        
        String palabra;
        do {
            System.out.println("Introduzca una palabra");
            palabra = sc.nextLine();
            if (!palabra.equalsIgnoreCase("fin")) {
                tablaPalabras[numeroPalabras] = palabra;
                numeroPalabras++;
            }
        } while (!palabra.equalsIgnoreCase("fin") && 
                numeroPalabras < tablaPalabras.length);
        System.out.println("La frase es ");
        for (int i = 0; i < numeroPalabras; i++) {
            System.out.print(tablaPalabras[i] + " ");
        }
        System.out.println();
    }
    
}
