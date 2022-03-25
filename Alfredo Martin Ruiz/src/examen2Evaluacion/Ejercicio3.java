package examen2Evaluacion;

import java.util.Scanner;

public class Ejercicio3 {

	static int n = 50;
	// ESCANER
	static Scanner st = new Scanner(System.in); // para string
	static Scanner num = new Scanner(System.in); // para int
	static Scanner dou = new Scanner(System.in); // para double

	public static void main(String[] args) {

		// ATRIBUTOS
		int opcion;
		String marcaIntroducida;
		String matriculaIntroducida = null;
		int numeroKmIntroducidos = 0;
		Fecha fechaMatriculacionIntroducida = new Fecha();
		int dia, mes, anyo;
		String descripcionIntroducida;
		double precioIntroducido;
		String nombrePropietarioIntroducido;
		String dniPropietarioIntroducido;
		int primeraLibre;

		// CREAR ARRAY
		Vehiculos[] vehiculos = new Vehiculos[n];

		// CREAR VEHÍCULOS EN CADA CELDA DEL ARRAY
		for (int i = 0; i < n; i++) {
			vehiculos[i] = new Vehiculos();
		}

		do {
			// MENÚ PRINCIPAL
			System.out.println("\n1. Nuevo vehículo" + "\n2. Listar vehículos" + "\n3. Buscar vehículos"
					+ "\n4. Modificar kms de vehículo" + "\n5. Salir");

			// PEDIR OPCION
			System.out.println("\nIntroduzca un número para navegar por el menú");
			opcion = num.nextInt();

			// NAVEGAR POR EL MENÚ
			switch (opcion) {
			case 1:
				System.out.println("\nNuevo vehículo");
				System.out.println("===============");

				// Busca la primera posición libre del array
				primeraLibre = -1;
				do {
					primeraLibre++;
				} while (!((vehiculos[primeraLibre].getMatricula()).equals("LIBRE")));

				System.out.println("Por favor, introduzca los datos del vehículo.");

				System.out.println("Marca:");
				marcaIntroducida = st.nextLine();
				vehiculos[primeraLibre].setMarca(marcaIntroducida);

				System.out.println("Matrícula:");
				matriculaIntroducida = st.nextLine();
				vehiculos[primeraLibre].setMatricula(matriculaIntroducida);

				System.out.println("Número de kilómetros:");
				numeroKmIntroducidos = num.nextInt();
				vehiculos[primeraLibre].setNumeroKm(numeroKmIntroducidos);

				System.out.println("Fecha de matriculación:");
				System.out.println("Día:");
				dia = num.nextInt();
				fechaMatriculacionIntroducida.setDia(dia);

				System.out.println("Mes:");
				mes = num.nextInt();
				fechaMatriculacionIntroducida.setMes(mes);

				System.out.println("Año:");
				anyo = num.nextInt();
				fechaMatriculacionIntroducida.setAño(anyo);

				vehiculos[primeraLibre].setFechaMatriculacion(fechaMatriculacionIntroducida);

				System.out.println("Descripción:");
				descripcionIntroducida = st.nextLine();
				vehiculos[primeraLibre].setDescripcion(descripcionIntroducida);

				System.out.println("Precio:");
				precioIntroducido = dou.nextDouble();
				vehiculos[primeraLibre].setPrecio(precioIntroducido);

				System.out.println("Nombre del propietario:");
				nombrePropietarioIntroducido = st.nextLine();
				vehiculos[primeraLibre].setNombrePropietario(nombrePropietarioIntroducido);

				System.out.println("DNI del propietario:");
				dniPropietarioIntroducido = st.nextLine();
				vehiculos[primeraLibre].setDniPropietario(dniPropietarioIntroducido);

				break;

			case 2:
				System.out.println("Listar vehículos");
				System.out.println("=================");
				listarVehiculo(vehiculos);

				break;

			case 3:
				System.out.println("Buscar vehículos");
				System.out.println("=================");
				buscarVehiculo(matriculaIntroducida, vehiculos);
				break;
				
			case 4:
				System.out.println("Actualizar kms");
				System.out.println("===========");
				actualizaKm(matriculaIntroducida, numeroKmIntroducidos, vehiculos);
			}
			
			
				

		} while (opcion != 5);

	}

	public static void listarVehiculo(Vehiculos[] vehiculos) {
		for (int i = 0; i < n; i++) {
			if (!vehiculos[i].getMatricula().equals("LIBRE")) {
				System.out.println(vehiculos[i]);
			}
		}
	}

	public static Vehiculos buscarVehiculo(String matriculaintroducida, Vehiculos[] vehiculos) {
		System.out.println("Introduzca la matrícula del vehículo que quiere encontrar:");
		String matriculaBuscada = st.nextLine();
		int i = -1;

		do {
			i++;
		} while (!((vehiculos[i].getMatricula()).equals(matriculaBuscada)));

		return vehiculos[i];

	}

	public static boolean actualizaKm(String matriculaIntroducida, int numeroKmIntroducidos, Vehiculos[] vehiculos) {

		// busca vehiculo
		System.out.println("Introduzca la matrícula del vehículo del que desea modifcar los kms");
		matriculaIntroducida = st.nextLine();

		int i = -1;
		do {
			i++;
		} while (!((vehiculos[i].getMatricula()).equals(matriculaIntroducida)));
		
		System.out.println("introduzca el nuevo numero de kms");
		numeroKmIntroducidos = num.nextInt();
		return true;
	}

}
