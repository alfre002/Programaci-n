/*
 * Boletin6Ejercicio15
 * Juego del anagrama mejorado
 * Muestra en cada intento el número de coincidencias.
 */
package soluciones;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Boletin6Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce la palabra: ");
        String pass = sc.nextLine();
        for (int i= 0; i < 20; i++) {
            System.out.println("");
        }
        String anagrama = anagramaAlAzar(pass);
        System.out.println("El anagrama es " + anagrama);
        char c[];
        //c= pass.toCharArray();
        boolean adivina = false;
        
        System.out.println("Pistas...");
        
        System.out.println("Numero de caracteres: " + pass.length());
        System.out.println("Caracter inicial: " + pass.charAt(0));//c[0]);
        System.out.println("Caracter final: " + pass.charAt(pass.length()-1));//c[c.length-1]);
        
        while (!adivina){
            System.out.println("Adivina la contraseña: ...");
            String intento = sc.nextLine();
            
            if (pass.equals(intento)){
                adivina=true;
            } else {
                int r;
                r=pass.compareTo(intento);
                if(r>0){
                    System.out.println("La contraseña es posterior alfabéticamente");
                }else {
                    System.out.println("La contraseña es anterior alfabéticamente");
                }
                System.out.println("El número de coincidencias es " +
                        coincidencias(intento, pass));
            }
            
        }       
    }
    
    public static String anagramaAlAzar(String cadena) {
        char[] tabla = cadena.toCharArray();
        // Barajamos
        for (int i = 0; i < tabla.length; i++) {
            // Creamos dos índices al azar
            int i1 = (int)(Math.random() * tabla.length);
            int i2 = (int)(Math.random() * tabla.length);
            // intercambiamos los elementos
            char aux = tabla[i1];
            tabla[i1] = tabla[i2];
            tabla[i2] = aux;
        }
        return new String(tabla);
    }
    
    public static int coincidencias(String s1, String s2) {
        int cuenta = 0;
        for (int i = 0;  i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                cuenta++;
            }
        }
        return cuenta;
    }
}
