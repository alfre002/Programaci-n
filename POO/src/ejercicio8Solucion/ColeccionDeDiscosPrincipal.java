package ejercicio8Solucion;

import java.util.Scanner;

/**
 * ColeccionDeDiscosPrincipal.java
 * Gesti�n de una colecci�n de discos.
 */
public class ColeccionDeDiscosPrincipal {

  // N determina el tama�o del array
  static int N = 3;
  
  public static void main(String[] args) {
	  
	  Scanner s=new Scanner(System.in);
		  

    //Crea el array de discos
    Disco[] album = new Disco[N];

    // Crea todos los discos que van en cada una de
    // las celdas del array
    for(int i = 0; i < N; i++) {
      album[i] = new Disco();
    }

    int opcion;
    String codigoIntroducido;
    String autorIntroducido;
    String tituloIntroducido;
    String generoIntroducido;
    String duracionIntroducidaString;
    int duracionIntroducida;
    int primeraLibre;
    int i;
    
    do {
      imprimeCRUD();
      opcion = s.nextInt();
      
      switch (opcion) {
      case 1:
        System.out.println("\nLISTADO");
        System.out.println("=======");
        for(i = 0; i < N; i++) {
          if (!album[i].getCodigo().equals("LIBRE")) {
            System.out.println(album[i]);
          }
        }
        break;
        
      case 2:
        System.out.println("\nNUEVO DISCO");
        System.out.println("===========");
        
        // Busca la primera posición libre del array
        primeraLibre = -1;
        do {
          primeraLibre++;
        } while (!((album[primeraLibre].getCodigo()).equals("LIBRE")));
        
        System.out.println("Por favor, introduzca los datos del disco.");  
        
        System.out.print("C�digo: ");
        s.nextLine();
        codigoIntroducido =s.nextLine();
        album[primeraLibre].setCodigo(codigoIntroducido);
        
        System.out.print("Autor: ");
        autorIntroducido = s.nextLine();
        album[primeraLibre].setAutor(autorIntroducido);
        
        System.out.print("T�tulo: ");
        tituloIntroducido = s.nextLine();
        album[primeraLibre].setTitulo(tituloIntroducido);
        
        System.out.print("G�nero: ");
        generoIntroducido =s.nextLine();
        album[primeraLibre].setGenero(generoIntroducido);
       
        System.out.print("Duraci�n: ");
        duracionIntroducida = s.nextInt();
        album[primeraLibre].setDuracion(duracionIntroducida);
        
        break;
        
      case 3:
        System.out.println("\nMODIFICAR");
        System.out.println("===========");
        
        s.nextLine();
        System.out.print("Por favor, introduzca el c�digo del disco cuyos datos desea cambiar: ");
        codigoIntroducido =s.nextLine();
  
        i = -1;
        do {
          i++;
        } while (!((album[i].getCodigo()).equals(codigoIntroducido)));
        
        System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");
  
        System.out.println("C�digo: " + album[i].getCodigo());
        System.out.print("Nuevo c�digo: ");
        codigoIntroducido = s.nextLine();
        if (!codigoIntroducido.equals("")) {
          album[i].setCodigo(codigoIntroducido);
        }
        
        System.out.println("Autor: " + album[i].getAutor());
        System.out.print("Nuevo autor: ");
        autorIntroducido = s.nextLine();
        if (!autorIntroducido.equals("")) {
          album[i].setAutor(autorIntroducido);
        }
        
        System.out.println("T�tulo: " + album[i].getTitulo());
        System.out.print("Nuevo t�tulo: ");
        tituloIntroducido = s.nextLine();
        if (!tituloIntroducido.equals("")) {
          album[i].setTitulo(tituloIntroducido);
        }
        
        System.out.println("G�nero: " + album[i].getGenero());
        System.out.print("Nuevo g�nero: ");
        generoIntroducido = s.nextLine();
        if (!generoIntroducido.equals("")) {
          album[i].setGenero(generoIntroducido);
        }
        
        System.out.println("Duraci�n: " + album[i].getDuracion());
        System.out.print("Duraci�n: ");
        duracionIntroducidaString = s.nextLine();
        if (!duracionIntroducidaString.equals("")) {
          album[i].setDuracion(Integer.parseInt(duracionIntroducidaString));
        }
        
        break;
        
      case 4:
        System.out.println("\nBORRAR");
        System.out.println("======");
        s.nextLine();
        System.out.print("Por favor, introduzca el c�digo del disco que desea borrar: ");
        codigoIntroducido =s.nextLine();
  
        i = -1;
        do {
          i++;
        } while (!((album[i].getCodigo()).equals(codigoIntroducido)));
        album[i].setCodigo("LIBRE");
        System.out.println("Album borrado.");
        
        break;
        
      default:
    	  System.out.println("\nHa salido de la aplicaci�n");
      
      } // switch
    } while (opcion != 5);
    s.close();
  }
  
  public static void imprimeCRUD() {
	  System.out.println("\n\nCOLECCI�N DE DISCOS");
      System.out.println("===================");
      System.out.println("1. Listado");
      System.out.println("2. Nuevo disco");
      System.out.println("3. Modificar");
      System.out.println("4. Borrar");
      System.out.println("5. Salir");
      System.out.print("Introduzca una opci�n: ");
  }
}