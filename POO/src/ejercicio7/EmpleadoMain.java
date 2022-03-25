package ejercicio7;

import ejercicio7.Empleado;

import java.io.IOException;
import java.util.Scanner;

public class EmpleadoMain {

	// ARRAY ESTÁTICO
	static Empleado[] empleados = new Empleado[20];
	static Scanner s = new Scanner(System.in);
	static int indice = 0;

	public static void main(String[] args) throws IOException {

		double importe;
		Empleado e;
		leerEmpleados();
		mostrar();

		// INTRODUCIR IMPORTE HORAS EXTRA
		importe = leerImporteHorasExtra();
		Empleado.setImporteHoraExtra(importe);

		// EMPLEADO QUE MAS COBRA
		e = empleadoQueMasCobra();
		System.out.println("El empleado que más cobra es: ");
		System.out.println(e);
		System.out.println("Su sueldo es de: " + e.calcularSueldo());

		// EMPLEADO QUE MENOS COBRA
		e = empleadoQueMenosCobra();
		System.out.println("El empleado que menos cobra es: ");
		System.out.println(e);
		System.out.println("Su sueldo es de: " + e.calcularSueldo());

		// EMPLEADO QUE MAS COBRA
		e = empleadoQueMasCobraPorHorasExtra();
		System.out.println("El empleado que más cobra por horas extra es: ");
		System.out.println(e);
		System.out.println("Su importe es de: " + e.importeHorasExtra());

		// EMPLEADO QUE MENOS COBRA
		e = empleadoQueMenosCobraPorHorasExtra();
		System.out.println("El empleado que menos cobra por horas extra es: ");
		System.out.println(e);
		System.out.println("Su importe es de: " + e.importeHorasExtra());
	}

	// MÉTODO LEER EMPLEADOS
	public static void leerEmpleados() throws IOException {
		Empleado e;
		int n, horasExtra, numeroHijos;
		String nif, nombre;
		char casado;
		float sueldoBase, IRPF;

		do {
			System.out.println("¿Cuál es el número de empleados?");
			n = s.nextInt();
		} while (n < 0 || n > 20);

		for (int i = 0; i < n; i++) {
			s.nextLine();
			System.out.println("Empleado " + i);
			System.out.println("Nif: ");
			nif = s.nextLine();
			System.out.println("Nombre: ");
			nombre = s.next();
			System.out.println("Sueldo base");
			sueldoBase = s.nextFloat();
			System.out.println("Horas extras realizadas este mes: ");
			horasExtra = s.nextInt();
			System.out.println("Tipo de IRPF: ");
			IRPF = s.nextFloat();
			System.out.println("Casado: (s/n)");
			casado = (char) System.in.read();
			System.out.println("Número de hijos: ");
			numeroHijos = s.nextInt();

			e = new Empleado(nif);

			e.setNombre(nombre);
			e.setSueldoBase(sueldoBase);
			e.setHorasExtra(horasExtra);
			e.setIRPF(IRPF);
			e.setCasado(Character.toUpperCase(casado));
			e.setNumeroHijos(numeroHijos);

			empleados[indice] = e;
			indice++;
		}
	}

	// MÉTODO MOSTRAR
	public static void mostrar() {
		for (int i = 0; i < indice; i++) {
			System.out.println(empleados[i]);
		}
	}

	// MÉTODO LEER IMPORTE HORAS EXTRA
	public static double leerImporteHorasExtra() {
		double importe;
		System.out.print("Introduce el importe a pagar por cada hora extra: ");
		importe = s.nextDouble();
		return importe;
	}

	// MÉTODO EMPLEADO QUE MÁS COBRA
	public static Empleado empleadoQueMasCobra() {
		Empleado mayor = empleados[0];
		for (int i = 0; i < indice; i++) {
			if (empleados[i].calcularSueldo() > mayor.calcularSueldo())
				mayor = empleados[i];
		}
		return mayor;
	}

	// MÉTODO EMPLEADO QUE MÁS COBRA
	public static Empleado empleadoQueMenosCobra() {
		Empleado menor = empleados[0];
		for (int i = 0; i < indice; i++) {
			if (empleados[i].calcularSueldo() < menor.calcularSueldo())
				menor = empleados[i];
		}
		return menor;
	}

	// MÉTODO EMPLEADO QUE MÁS COBRA POR HORAS EXTRA
	public static Empleado empleadoQueMasCobraPorHorasExtra() {
		Empleado mayor = empleados[0];
		for (int i = 0; i < indice; i++) {
			if (empleados[i].importeHorasExtra() > mayor.importeHorasExtra())
				mayor = empleados[i];
		}
		return mayor;
	}

	// MÉTODO EMPLEADO QUE MÁS COBRA POR HORAS EXTRA
	public static Empleado empleadoQueMenosCobraPorHorasExtra() {
		Empleado menor = empleados[0];
		for (int i = 0; i < indice; i++) {
			if (empleados[i].importeHorasExtra() < menor.importeHorasExtra())
				menor = empleados[i];
		}
		return menor;
	}

}
