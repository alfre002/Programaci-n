package soluciones;

/**
 * Ejercicio 12
 * Realiza un programa que pida 10 n�meros por teclado y que los almacene en un array. A
 * continuaci�n se mostrar� el contenido de ese array junto al �ndice (0 � 9). Seguidamente el
 * programa pedir� dos posiciones a las que llamaremos �inicial� y �final�. Se debe
 * comprobar que inicial es menor que final y que ambos n�meros est�n entre 0 y 9. El
 * programa deber� colocar el n�mero de la posici�n inicial en la posici�n final, rotando el
 * resto de n�meros para que no se pierda ninguno. Al final se debe mostrar el array
 * resultante.
 */
import java.util.Scanner;
public class Ejercicio12 {

  public static void main(String[] args) {
	  Scanner s=new Scanner(System.in);
  
    int[] n = new int[10];
    int[] resultado = new int[10];
    int i;
    int nInicial;
    int nFinal;
    boolean valido;
    
    System.out.println("Introduzca 10 n�meros separados por INTRO:");

    for (i = 0; i < 10; i++) {
      n[i] = s.nextInt();
    }
    
    // Muestra el array original.
    System.out.println("\n\nArray original:");
    System.out.println("\n----------------------------------------------------------------------");
    System.out.print("| Indice ");
    for (i = 0; i < 10; i++) {
      System.out.printf("|%4d ", i);
    }
    System.out.println("\n----------------------------------------------------------------------");
    System.out.print("| Valor  ");
    for (i = 0; i < 10; i++) {
      System.out.printf("|%4d ", n[i]);
    }
    System.out.println("\n----------------------------------------------------------------------");

    // Pide las posiciones inicial y final.
    do {
      valido = true;
      
      System.out.print("Introduzca la posici�n inicial (0 - 9): ");
      nInicial =s.nextInt();
      if ((nInicial < 0) || (nInicial > 9)) {
        System.out.println("Valor incorrecto, debe ser un n�mero entre el 0 y el 9.");
        valido = false;
      }
  
      System.out.print("Introduzca la posici�n final (0 - 9): ");
      nFinal = s.nextInt();
      if ((nFinal < 0) || (nFinal > 9)) {
        System.out.println("Valor incorrecto, debe ser un n�mero entre el 0 y el 9.");
        valido = false;
      }
      
      if (nInicial >= nFinal) {
        System.out.println("Valores incorrectos, la posici�n inicial debe ser menor que la posici�n final.");
        valido = false;
      }
    } while (!valido);
    s.close();

    // Muestra de nuevo el array original.
    System.out.println("\n\nArray original:");
    System.out.println("\n----------------------------------------------------------------------");
    System.out.print("| Indice ");
    for (i = 0; i < 10; i++) {
      System.out.printf("|%4d ", i);
    }
    System.out.println("\n----------------------------------------------------------------------");
    System.out.print("| Valor  ");
    for (i = 0; i < 10; i++) {
      System.out.printf("|%4d ", n[i]);
    }
    System.out.println("\n----------------------------------------------------------------------");
    
    // Copia el array n en resultado.
    for (i = 0; i < 10; i++) {
      resultado[i] = n[i];
    }
    
    resultado[nFinal] = n[nInicial];
    
    for (i = nFinal + 1; i < 10; i++)
      resultado[i] = n[i - 1];
    
    resultado[0] = n[9];
    
    for (i = 0; i < nInicial; i++)
      resultado[i + 1] = n[i];
    
    // Muestra el resultado.
    System.out.println("\nArray resultante:");
    System.out.println("\n----------------------------------------------------------------------");
    System.out.print("| Indice ");
    for (i = 0; i < 10; i++) {
      System.out.printf("|%4d ", i);
    }
    System.out.println("\n----------------------------------------------------------------------");
    System.out.print("| Valor  ");
    for (i = 0; i < 10; i++) {
      System.out.printf("|%4d ", resultado[i]);
    }
    System.out.println("\n----------------------------------------------------------------------");
    
  }
}