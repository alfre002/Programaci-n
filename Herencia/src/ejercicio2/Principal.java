package ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		llenarPoligono();
		
		mostrarResultados();
		
	}

	public static void llenarPoligono() {
		int opcion;
		do {
			System.out.println("1. Introducir triángulo \n2. Introducir rectángulo \n3. Salir y Mostrar Resultados");
			opcion = s.nextInt();
			switch (opcion) {
			case 1:
				llenarTriangulo();
				break;

			case 2:
				llenarRectangulo();
				break;
			}
		} while (opcion != 3);
	}

	public static void llenarTriangulo() {
		System.out.println("Introduzca las dimensiones de los 3 lados del triángulo");
		System.out.println("Lado 1:");
		s.nextLine();
		double lado1 = s.nextDouble();
		System.out.println("Lado 2:");
		double lado2 = s.nextDouble();
		System.out.println("Lado 3:");
		double lado3 = s.nextDouble();

		Triangulo triangulo = new Triangulo(lado1, lado2, lado3);

		// meter triangulo en array
		poligono.add(triangulo);
	}

	public static void llenarRectangulo() {
		System.out.println("Introduzca las dimensiones de los 2 lados del rectángulo");
		System.out.println("Lado 1:");
		int lado1 = s.nextInt();
		System.out.println("Lado 2:");
		int lado2 = s.nextInt();

		Rectangulo rectangulo = new Rectangulo(lado1, lado2);

		// meter rectangulo en el array
		poligono.add(rectangulo);

	}
	
	public static void mostrarResultados() {
		for (Poligono poli : poligono) {
			System.out.println(poli.toString());
			System.out.println("Area: " + poli.area());
		}
	}

}
