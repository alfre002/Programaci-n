package ejercicio8;

import java.util.Scanner;

public class DiscoMain {

	// tamaño del array Disco
	static int n = 100;
	static Scanner s = new Scanner(System.in);
	static Scanner num = new Scanner(System.in);

	public static void main(String[] args) {

		// ATRIBUTOS
		String codigoIntroducido, autorIntroducido, tituloIntroducido, generoIntroducido;
		int duracionIntroducida;

		// CREAR EL ARRAY
		Disco[] album = new Disco[n];

		// CREAR TODOS LOS DISCOS
		for (int i = 0; i < n; i++) {
			album[i] = new Disco();
		}
		
		// opcion - sirve para navegar por el menú
		int opcion;

		do {
			// MENÚ DE OPCIONES
			System.out.println("\n COLECCIÓN DE DISCOS");
			System.out.println("===================");
			System.out.println("1. Listado");
			System.out.println("2. Nuevo Disco");
			System.out.println("3. Modificar");
			System.out.println("4. Borrar");
			System.out.println("5. Salir");

			// PREGUNTAR NÚMERO PARA NAVEGAR POR EL MENÚ
			System.out.println("Seleccione una opción");
			opcion = num.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("\n LISTADO");
				System.out.println("=========");
				// RECORRE Y MUESTRA LOS DISCOS DEL ARRAY
				for (int i = 0; i < n; i++) {
					if (!album[i].getCodigo().equals("LIBRE")) {
						System.out.println(album[i]);
					}
				}
				break;

			case 2:
				System.out.println("\n NUEVO DISCO");
				System.out.println("=========");
				// BUSCA LA PRIMERA POSICIÓN LIBRE
				int primeraLibre = -1;
				do {
					primeraLibre++;
				} while (!album[primeraLibre].getCodigo().equals("LIBRE"));
				// SE PIDEN LOS DATOS POR TECLADO
				System.out.println("Introduzca el código del disco");
				codigoIntroducido = s.nextLine();
				album[primeraLibre].setCodigo(codigoIntroducido);
				System.out.println("Introduzca el autor");
				autorIntroducido = s.nextLine();
				album[primeraLibre].setAutor(autorIntroducido);
				System.out.println("Introduzca el título");
				tituloIntroducido = s.nextLine();
				album[primeraLibre].setTitulo(tituloIntroducido);
				System.out.println("Introduzca el género");
				generoIntroducido = s.nextLine();
				album[primeraLibre].setGenero(generoIntroducido);
				System.out.println("Introduzca la duración");
				duracionIntroducida = num.nextInt();
				album[primeraLibre].setDuracion(duracionIntroducida);

				break;

			case 3:
				System.out.println("\n MODIFICAR DISCO");
				System.out.println("=========");
				// BUSCAR DISCO POR CÓDIGO
				System.out.println("¿Cuál es el código del disco que quiere modificar?");
				codigoIntroducido = s.nextLine();
				int i = -1;
				do {
					i++;
				} while(!album[i].getCodigo().equals(codigoIntroducido));
				// SE PIDEN LOS DATOS POR TECLADO
				System.out.println("Nuevos datos del disco");
				System.out.println("Introduzca el código");
				codigoIntroducido = s.nextLine();
				album[i].setCodigo(codigoIntroducido);
				System.out.println("Introduzca el autor");
				autorIntroducido = s.nextLine();
				album[i].setAutor(autorIntroducido);
				System.out.println("Introduzca el título");
				tituloIntroducido = s.nextLine();
				album[i].setTitulo(tituloIntroducido);
				System.out.println("Introduzca el género");
				generoIntroducido = s.nextLine();
				album[i].setGenero(generoIntroducido);
				System.out.println("Introduzca la duración");
				duracionIntroducida = num.nextInt();
				album[i].setDuracion(duracionIntroducida);
				
				break;
				
			case 4:
				System.out.println("\n BORRAR DISCO");
				System.out.println("=========");
				System.out.println("Introduzca el código del disco que quiere borrar");
				codigoIntroducido = s.next();
				// SE BUSCA EL DISCO CON EL CÓDIGO INTRODUCIDO
				i = -1;
				do {
					i++;
				} while(!album[i].getCodigo().equals(codigoIntroducido));
				
				album[i].setCodigo("LIBRE");
				
				System.out.println("Álbum borrado");
				
				break;
			}

		} while (opcion != 5);

	}
}
