package soluciones;
/* 8. Realizar un programa que lea una frase del teclado y nos indique 
 * si es pal�ndroma, es decir, que la frase sea igual leyendo de izquierda a derecha, 
 * que de derecha a izquierda, sin tener en cuenta los espacios. 
 * Un ejemplo de frase pal�ndroma es: D�bale arroz a la zorra el abad.
 * Las vocales con tilde hacen que un algoritmo tome una frase pal�ndroma como si no lo fuese. 
 * Por esto, supondremos que el usuario introduce la frase sin tildes.
 * */

import java.util.Scanner;

public class Ejercicio_08 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una frase");
        String frase = sc.nextLine();
        if (esPalindroma(frase)) {
            System.out.println("La frase es pal�ndroma");
        } else {
            System.out.println("La frase no es pal�ndroma");
        }
        sc.close();
    }
    
    //Comprueba si una frase es palindroma
    
    public static boolean esPalindroma(String cadena) {
        String sinEspacios = "";
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (c!=' ') {
                sinEspacios += c;
            }
        }
        sinEspacios = sinEspacios.toLowerCase();
        String invertida = invertir(sinEspacios);
         return sinEspacios.equals(invertida);
    }
    
    
    //Invierte la cadena de caracteres
    
    public static String invertir(String cadena) {
        String resultado = "";
        for (int i = cadena.length() -1; i >= 0; i--) {
            resultado += cadena.charAt(i);
        }
        return resultado;
    }
    
}