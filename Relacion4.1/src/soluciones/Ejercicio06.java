package soluciones;

import java.util.Scanner;

/**
 * Arrays
 * 
 * 6. Escribe un programa que lea 15 n�meros por teclado y que los almacene en un array. Rota los
 *    elementos de ese array, es decir, el elemento de la posici�n 0 debe pasar a la posici�n1,
 *    el de la 1 a la 2, etc. El n�mero que se encuentra en la �ltima posici�n debe pasar a la
 *    posici�n 0. Finalmente, muestra el contenido del array.
 *
 */
public class Ejercicio06 {

  public static void main(String[] args) {
	  
	  Scanner s= new Scanner(System.in);
    
      int[] numero = new int[15];
      int i;
      
      System.out.println("Vaya introduciendo n�meros enteros y pulsando INTRO:");
      
      for (i = 0; i < 15; i++) {
        numero[i] = s.nextInt();
      }
    
      s.close();
      System.out.println();
      
      // Muestra el array original ///////////////
      System.out.println("Array original:\n");
      for (i = 0; i < 15; i++) {
        System.out.printf("|%3d ", i);
      }
      System.out.println("|");
      for (i = 0; i <=75; i++) {
        System.out.print("_");
      }
      System.out.println("");
      for (i = 0; i < 15; i++) {
        System.out.printf("|%3d ", numero[i]);
      }
      System.out.println("|");
      ////////////////////////////////////////////
      
      // rota una posici�n a la derecha //////////
      int aux = numero[14];
      for (i = 14; i > 0; i--) {
        numero[i] = numero[i-1];
      }
      numero[0] = aux;
      ////////////////////////////////////////////

      // Muestra el array rotado /////////////////
      System.out.println("\nArray rotado a la derecha una posici�n:\n");
      for (i = 0; i < 15; i++) {
        System.out.printf("|%3d ", i);
      }
      System.out.println("|");
      for (i = 0; i <= 75; i++) {
        System.out.print("_");
      }
      System.out.println("");
      for (i = 0; i < 15; i++) {
        System.out.printf("|%3d ", numero[i]);
      }
      System.out.println("|");
     
      ////////////////////////////////////////////
   
  }

}