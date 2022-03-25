package examen2Evaluacion;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		// VEHÍCULO
		Vehiculos v = new Vehiculos();

		// ESCÁNER
		Scanner st = new Scanner(System.in); // para string
		Scanner num = new Scanner(System.in); // para int
		Scanner dou = new Scanner(System.in); // para double

		// ATRIBUTOS
		int opcion;
		String marcaIntroducida;
		String matriculaIntroducida;
		int numeroKmIntroducidos = 0;
		Fecha fechaMatriculacionIntroducida = new Fecha();
		int dia, mes, anyo;
		String descripcionIntroducida;
		double precioIntroducido;
		String nombrePropietarioIntroducido;
		String dniPropietarioIntroducido;

		do {
			// MENÚ PRINCIPAL
			System.out.println("\n1. Nuevo vehículo" + "\n2. Ver matrícula" + "\n3. Ver número de kilómetros"
					+ "\n4. Actualizar kilómetros" + "\n5. Ver años de antiguedad" + "\n6. Mostrar propietario"
					+ "\n7. Mostrar descripción" + "\n8. Mostrar precio" + "\n9. Salir");

			// PEDIR OPCION
			System.out.println("\nIntroduzca un número para navegar por el menú");
			opcion = num.nextInt();

			// NAVEGAR POR EL MENÚ
			switch (opcion) {
			case 1:
				System.out.println("\nNuevo vehículo");
				System.out.println("===============");
				System.out.println("Introduzca los siguientes datos");

				System.out.println("Marca:");
				marcaIntroducida = st.nextLine();
				v.setMarca(marcaIntroducida);

				System.out.println("Matrícula:");
				matriculaIntroducida = st.nextLine();
				if (validarMatricula(matriculaIntroducida) == false) {
					System.out.println("La matrícula introducida no es correcta, vuelva al menú principal");
					break;
				} 
				v.setMatricula(matriculaIntroducida);

				System.out.println("Número de kilómetros:");
				numeroKmIntroducidos = num.nextInt();
				if (numeroKmIntroducidos < 0) {
					System.out.println("El número de km introducido es negativo, vuelva al menú principal");
					break;
				} 
				v.setNumeroKm(numeroKmIntroducidos);

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
				System.out.println(fechaMatriculacionIntroducida.getAño());

				if(fechaMatriculacionIntroducida.fechaCorrecta() == false || (fechaMatriculacionIntroducida.getAño() > 2022)
						|| (fechaMatriculacionIntroducida.getMes() > 3 && fechaMatriculacionIntroducida.getDia() > 16)) {
					System.out.println("La fecha introducida es incorrecta, vuelva al menú principal");
					break;
				}
				
				System.out.println("Descripción:");
				descripcionIntroducida = st.nextLine();
				v.setDescripcion(descripcionIntroducida);

				System.out.println("Precio:");
				precioIntroducido = dou.nextDouble();
				v.setPrecio(precioIntroducido);

				System.out.println("Nombre del propietario:");
				nombrePropietarioIntroducido = st.nextLine();
				v.setNombrePropietario(nombrePropietarioIntroducido);

				System.out.println("DNI del propietario:");
				dniPropietarioIntroducido = st.nextLine();
				if (validarDNI(dniPropietarioIntroducido) == true) {
					v.setDniPropietario(dniPropietarioIntroducido);
				} else {
					System.out.println("El DNI introducido no es correcto, vuelva al menú principal");
					break;
				}

				break;
				
			case 2:
				System.out.println("\nVer matrícula");
				System.out.println("===============");
				System.out.println("La matrícula del vehículo es:");
				System.out.println(v.getMatricula());
				break;
				
			case 3:
				System.out.println("Ver número de km");
				System.out.println("=================");
				System.out.println("El número de km del vehículo es:");
				System.out.println(v.getNumeroKm());
				
				break;
				
			case 4:
				int sumaKm;
				
				System.out.println("Actualizar km");
				System.out.println("==============");
				System.out.println("Número de km actuales del vehículo:");
				System.out.println(v.getNumeroKm());
				System.out.println("Introduzca el número de km que quiere sumar a la cuenta:");
				sumaKm = num.nextInt();
				numeroKmIntroducidos += sumaKm;
				v.setNumeroKm(numeroKmIntroducidos); 
				System.out.println("El número de km actualizado es:");
				System.out.println(v.getNumeroKm());
				
				break;
				
			case 5:
				int antiguedad;
				
				System.out.println("Ver años de antiguedad");
				System.out.println("=======================");
				antiguedad = (2022 - v.getFechaMatriculacion().getAño());
				System.out.println("Años de antiguedad del vehículo:");
				System.out.println(antiguedad);
			
				break;
				
			case 6:
				System.out.println("Mostrar propietario:");
				System.out.println("====================");
				System.out.println("Propietario del vehículo:");
				System.out.println(v.getNombrePropietario());
				System.out.println("DNI del propietario:");
				System.out.println(v.getDniPropietario());
				
				break;
				
			case 7:
				System.out.println("Mostrar descripción:");
				System.out.println("====================");
				System.out.println("Descripción del vehículo:");
				System.out.println(v.getDescripcion());
				System.out.println("Matrícula del vehículo:");
				System.out.println(v.getMatricula());
				System.out.println("Número de km del vehículo:");
				System.out.println(v.getNumeroKm());
				
				break;
				
			case 8:
				System.out.println("Mostrar precio:");
				System.out.println("===============");
				System.out.println("Precio del vehículo:");
				System.out.println(v.getPrecio());
				
				break;
				
			}

		} while (opcion != 9);

	}

	public static boolean validarDNI(String dniPropietarioIntroducido) {
//		char letras[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R',
//				'S','T','U','V','W','X','Y','Z'};
		if (dniPropietarioIntroducido.length() == 9) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean validarMatricula(String matriculaIntroducida) {
		if (matriculaIntroducida.length() == 8) {
			return true;
		} else {
			return false;
		}
	}

}
