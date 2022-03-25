package ejercicio10;

import ejercicio10.Gestisimal;
import java.util.Scanner;

public class GestisimalMain {

	static int n = 100;

	public static void main(String[] args) {

		// ATRIBUTOS
		int opcion, stockIntroducido;
		String codigoIntroducido, descripcionIntroducida;
		double precioCompraIntroducida, precioVentaIntroducida;

		Scanner s = new Scanner(System.in);
		Scanner num = new Scanner(System.in);

		// CREAR ARRAY
		Gestisimal[] gestisimal = new Gestisimal[n];

		// CREA LOS ARTÍCULOS
		for (int i = 0; i < n; i++) {
			gestisimal[i] = new Gestisimal();
		}

		do {
			// MENÚ
			System.out.println("\n 1. Listado \n 2. Alta \n 3. Baja \n 4. Modificación "
					+ "\n 5. Entrada de mercancía \n 6. Salida de mercancía \n 7. Salir");

			// PIDE UNA OPCIÓN
			System.out.println("\n Introduce una opción");
			opcion = num.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("\n Listado:");
				System.out.println("===============");
				for (int i = 0; i < n; i++) {
					if (!gestisimal[i].getCodigo().equals("LIBRE")) {
						System.out.println(gestisimal[i]);
					}
				}
				break;
			case 2:
				System.out.println("\n Alta:");
				System.out.println("============");
				// BUSCAR 1ª POSICIÓN
				int primeraLibre = -1;
				do {
					primeraLibre++;
				} while (!gestisimal[primeraLibre].getCodigo().equals("LIBRE"));
				// SE PIDEN LOS DATOS POR TECLADO
				System.out.println("Introduzca el código:");
				codigoIntroducido = s.nextLine();
				gestisimal[primeraLibre].setCodigo(codigoIntroducido);
				
				System.out.println("Introduzca la descripción:");
				descripcionIntroducida = s.nextLine();
				gestisimal[primeraLibre].setDescripcion(descripcionIntroducida);
				
				System.out.println("Introduzca el precio de compra:");
				num.nextLine();
				precioCompraIntroducida = num.nextDouble();
				gestisimal[primeraLibre].setPrecioCompra(precioCompraIntroducida);
				
				System.out.println("Introduzca el precio de venta");
				precioVentaIntroducida = num.nextDouble();
				gestisimal[primeraLibre].setPrecioVenta(precioVentaIntroducida);
				
				break;
			case 3:
				System.out.println("\n Baja:");
				System.out.println("============");
				System.out.println("Introduzca el código del artículo que quiere dar de baja");
				codigoIntroducido = s.nextLine();
				// SE BUSCA EL CÓDIGO INTRODUCIDO
				int i = -1;
				do {
					i++;
				} while(!gestisimal[i].getCodigo().equals(codigoIntroducido));
				gestisimal[i].setCodigo("LIBRE");
				System.out.println("Artículo Borrado");
				break;
			case 4:
				System.out.println("\n Modificación");
				System.out.println("==========");
				System.out.println("Introduzca el código del artículo que quiere modificar");
				codigoIntroducido = s.nextLine();
				// SE BUSCA EL CÓDIGO INTRODUCIDO
				i = -1;
				do {
					i++;
				} while(!gestisimal[i].getCodigo().equals(codigoIntroducido));
				// SE PIDEN LOS DATOS POR TECLADO
				System.out.println("Introduzca el código:");
				codigoIntroducido = s.nextLine();
				gestisimal[i].setCodigo(codigoIntroducido);
				
				System.out.println("Introduzca la descripción:");
				descripcionIntroducida = s.nextLine();
				gestisimal[i].setDescripcion(descripcionIntroducida);
				
				System.out.println("Introduzca el precio de compra:");
				num.nextLine();
				precioCompraIntroducida = num.nextDouble();
				gestisimal[i].setPrecioCompra(precioCompraIntroducida);
				
				System.out.println("Introduzca el precio de venta");
				precioVentaIntroducida = num.nextDouble();
				gestisimal[i].setPrecioVenta(precioVentaIntroducida);
				break;
			case 5:
				System.out.println("Entrada de mercancía");
				System.out.println("==================");
				System.out.println("Introduzca el código del artículo");
				codigoIntroducido = s.nextLine();
				// SE BUSCA EL CÓDIGO INTRODUCIDO
				i = -1;
				do {
					i++;
				} while(!gestisimal[i].getCodigo().equals(codigoIntroducido));
			}

		} while (opcion != 7);

	}

}
