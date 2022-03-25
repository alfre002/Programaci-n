/*
 * Boletin6Ejercicio7
 * Contar cuántas veces aparece una subcadena dentro de una cadena
 */
package soluciones;

/**
 *
 * @author jose
 */
public class Boletin6Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena = "El hijo de la mujer de mi primo se ha ido de vacaciones este finde";
        System.out.println(contarApariciones(cadena, " de "));
        
    }
    
    public static int contarApariciones(String cadena, String subcadena) {
        int cuenta = 0;
        int posicion = 0;
        int indice;
        do {
            indice = cadena.indexOf(subcadena, posicion);
            if (indice >= 0) {
                cuenta++;
                posicion = indice + 1;
            }
        } while (indice >= 0);
        return cuenta;
    }
    
}
