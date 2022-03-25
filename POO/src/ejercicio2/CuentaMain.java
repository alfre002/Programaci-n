package ejercicio2;

import java.util.Scanner;

import ejercicio2.Cuenta;

public class CuentaMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String nombreCliente, numeroCuenta;
		double tipoInteres, saldo;

		// CREA OBJETO CUENTA1 SIN PARÁMETROS
		Cuenta cuenta1 = new Cuenta();

		// INTRODUCE VALORES EN LA CUENTA1
		System.out.println("Nombre del titular: ");
		nombreCliente = s.nextLine();
		System.out.println("Número de cuenta: ");
		numeroCuenta = s.nextLine();
		System.out.println("Tipo de interés: ");
		tipoInteres = s.nextDouble();
		System.out.println("Saldo: ");
		saldo = s.nextDouble();

		cuenta1.setNombreCliente(nombreCliente);
		cuenta1.setNumeroCuenta(numeroCuenta);
		cuenta1.setSaldo(saldo);
		cuenta1.setTipoInteres(tipoInteres);

		// CREA OBJETO CUENTA2 CON VALORES
		Cuenta cuenta2 = new Cuenta("Juan Fernández Rubio", "1234567890", 1.75, 300);

		// CREA CUENTA3, COPIA DE CUENTA1
		Cuenta cuenta3 = new Cuenta(cuenta1);
		
		System.out.println();
		System.out.println();

		// MUESTRA LOS VALORES DE LA CUENTA1
		System.out.println("Datos de la cuenta 1");
		System.out.println("Nombre del titular: " + cuenta1.getNombreCliente());
		System.out.println("Número de la cuenta: " + cuenta1.getNumeroCuenta());
		System.out.println("Tipo de interés: " + cuenta1.getTipoInteres());
		System.out.println("Saldo: " + cuenta1.getSaldo());
		
		System.out.println();
		System.out.println();

		// INGRESO EN CUENTA1
		System.out.println("Se realiza un ingreso de 400€ en la cuenta de " + cuenta1.getNombreCliente());
		cuenta1.ingreso(400);
		
		System.out.println();
		System.out.println();

		// MUESTRA SALDO DE CUENTA1 DESPUÉS DEL INGRESO
		System.out.println("Saldo de la cuenta de " + cuenta1.getNombreCliente() + " después del ingreso: " + cuenta1.getSaldo());
		
		System.out.println();
		System.out.println();

		// MUESTRA LOS VALORES DE LA CUENTA2
		System.out.println("Datos de la cuenta 2");
		System.out.println("Nombre del titular: " + cuenta2.getNombreCliente());
		System.out.println("Número de la cuenta: " + cuenta2.getNumeroCuenta());
		System.out.println("Tipo de interés: " + cuenta2.getTipoInteres());
		System.out.println("Saldo: " + cuenta2.getSaldo());
		
		System.out.println();
		System.out.println();

		// MUESTRA LOS VALORES DE LA CUENTA3
		System.out.println("Datos de la cuenta 3");
		System.out.println("Nombre del titular: " + cuenta3.getNombreCliente());
		System.out.println("Número de la cuenta: " + cuenta3.getNumeroCuenta());
		System.out.println("Tipo de interés: " + cuenta3.getTipoInteres());
		System.out.println("Saldo: " + cuenta3.getSaldo());
		
		System.out.println();
		System.out.println();
		
		// TRANSFERENCIA DE 10€ DE CUENTA3 A CUENTA2
		System.out.println("Se realiza una transferencia de 10€ desde la cuenta de " + cuenta3.getNombreCliente() + " a la cuenta de " + cuenta2.getNombreCliente());
		cuenta3.transferencia(cuenta2, 10);
		
		System.out.println();
		System.out.println();
		
		// MUESTRA EL SALDO DE LA CUENTA 3
		System.out.println("Saldo de la cuenta de " + cuenta3.getNombreCliente() + " después del ingreso: " + cuenta3.getSaldo());

	}

}
