package ejercicio3;

import java.util.Scanner;

import ejercicio3.Contador;

public class ContadorMain {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		// UTILIZAR EL CONSTRUCTOR POR DEFECTO
		Contador contador1 = new Contador();
		System.out.println("Introduzca un valor para el contador:");
		int n = s.nextInt();

		// ASIGNAR UN VALOR AL CONTADOR
		contador1.setCont(n);

		// INCREMENTAR EL CONTADOR
		contador1.incrementar();

		System.out.println();

		// MOSTRAR EL VALOR ACTUAL
		System.out.println("Valor del contador después del incremento: " + contador1.getCont());

		System.out.println();

		// INCREMENTAR EL CONTADOR 2 VECES
		contador1.incrementar();
		contador1.incrementar();

		// MOSTRAR VALOR ACTUAL
		System.out.println("Valor del contador después del doble incremento: " + contador1.getCont());

		System.out.println();

		// RESTAR EL CONTADOR
		contador1.decrementar();

		// MOSTRAR VALOR ACTUAL
		System.out.println("Valor del contador después del decremento: " + contador1.getCont());

		System.out.println();

		// CREAR NUEVO OBJETO CONTADOR CON VALOR INICIAL 10
		Contador contador2 = new Contador(10);

		// CREAR OBJETO CONTADOR 3 COPIA DE CONTADOR 2
		Contador contador3 = new Contador(contador2);

		// INCREMENTAR Y DECREMENTAR EL CONTADOR 2
		contador2.incrementar();
		System.out.println("Valor del contador 2 después del incremento: " + contador2.getCont());
		contador2.decrementar();
		System.out.println("Valor del contador 2 después del decremento: " + contador2.getCont());

		// MOSTRAR VALOR DE CONTADOR 3
		System.out.println("El valor de contador 3 es: " + contador3.cont);

	}

}
