package ejercicio6;

import java.util.Scanner;

import ejercicio6.Fecha;

public class FechaMain {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		// PEDIR UNA FECHA
		System.out.println("Introduce una fecha:");
		System.out.println("Día:");
		int dia = s.nextInt();
		System.out.println("Mes:");
		int mes = s.nextInt();
		System.out.println("Año:");
		int año = s.nextInt();

		// CREAR OBJETO FECHA
		Fecha fecha1 = new Fecha(dia, mes, año);

		if (fecha1.fechaCorrecta()) {
			System.out.println("La fecha es correcta: " + fecha1);

			// 10 DIAS SIGUIENTES
			for (int i = 0; i < 10; i++) {
				fecha1.diaSiguiente();
				System.out.println(fecha1);
			}
		} else {
			System.out.println("La fecha no es correcta");
		}
	}
}
