package ejercicio4;

import java.util.Scanner;

import ejercicio4.Libro;

public class LibroMain {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		// ATRIBUTOS
		String titulo;
		String autor;
		int ejemplaresLibro;
		int ejemplaresPrestados;

		// CREAR LIBRO 1 CON PARÁMETROS
		Libro libro1 = new Libro("El Quijote", "Cervantes", 1, 0);

		// CREAR LIBRO 2 SIN PARÁMETROS
		Libro libro2 = new Libro();

		// ASIGNA A LIBRO 2 VALORES POR TECLADO
		System.out.println("Nombre del libro: ");
		titulo = s.nextLine();
		System.out.println("Nombre del autor: ");
		autor = s.nextLine();
		System.out.println("Número de ejemplares del libro: ");
		ejemplaresLibro = s.nextInt();
		System.out.println("Número de ejemplares prestados: ");
		ejemplaresPrestados = s.nextInt();

		libro2.setTitulo(titulo);
		libro2.setAutor(autor);
		libro2.setEjemplaresLibro(ejemplaresLibro);
		libro2.setEjemplaresPrestados(ejemplaresPrestados);

		System.out.println();

		// PRÉSTAMO DEL LIBRO 1
		if (libro1.prestamo()) {
			System.out.println("El préstamo de " + libro1.getTitulo() + " se ha realizado correctamente");
			System.out.println("Hay " + libro1.getEjemplaresLibro() + " ejemplares del libro y "
					+ libro1.getEjemplaresPrestados() + " ejemplares prestados");
		} else {
			System.out.println("El préstamo de " + libro1.getTitulo() + " no se ha podido realizar");
			System.out.println("Hay " + libro1.getEjemplaresLibro() + " ejemplares del libro y "
					+ libro1.getEjemplaresPrestados() + " ejemplares prestados");
		}
		
		System.out.println();

		// DEVOLUCIÓN DEL LIBRO 1
		if (libro1.devolucion()) {
			System.out.println("La devolución de " + libro1.getTitulo() + " se ha realizado correctamente");
			System.out.println("Hay " + libro1.getEjemplaresLibro() + " ejemplares del libro y "
					+ libro1.getEjemplaresPrestados() + " ejemplares prestados");
		} else {
			System.out.println("La devolución de " + libro1.getTitulo() + " no se ha podido realizar");
			System.out.println("Hay " + libro1.getEjemplaresLibro() + " ejemplares del libro y "
					+ libro1.getEjemplaresPrestados() + " ejemplares prestados");
		}
		
		System.out.println();

		// PRÉSTAMO DEL LIBRO 1
		if (libro1.prestamo() == true) {
			System.out.println("El préstamo de " + libro1.getTitulo() + " se ha realizado correctamente");
			System.out.println("Hay " + libro1.getEjemplaresLibro() + " ejemplares del libro y "
					+ libro1.getEjemplaresPrestados() + " ejemplares prestados");
		} else {
			System.out.println("El préstamo de " + libro1.getTitulo() + " no se ha podido realizar");
			System.out.println("Hay " + libro1.getEjemplaresLibro() + " ejemplares del libro y "
					+ libro1.getEjemplaresPrestados() + " ejemplares prestados");
		}
		
		System.out.println();

		// PRÉSTAMO DEL LIBRO 1
		if (libro1.prestamo() == true) {
			System.out.println("El préstamo de " + libro1.getTitulo() + " se ha realizado correctamente");
			System.out.println("Hay " + libro1.getEjemplaresLibro() + " ejemplares del libro y "
					+ libro1.getEjemplaresPrestados() + " ejemplares prestados");
		} else {
			System.out.println("El préstamo de " + libro1.getTitulo() + " no se ha podido realizar");
			System.out.println("Hay " + libro1.getEjemplaresLibro() + " ejemplares del libro y "
					+ libro1.getEjemplaresPrestados() + " ejemplares prestados");
		}

		System.out.println();

		// MOSTRAR LOS DATOS DE LIBRO 1
		System.out.println("Datos de " + libro1.getTitulo());
		System.out.println("Nombre del libro: " + libro1.getTitulo());
		System.out.println("Número del autor: " + libro1.getAutor());
		System.out.println("Número de ejemplares del libro: " + libro1.getEjemplaresLibro());
		System.out.println("Número de ejemplares prestados: " + libro1.getEjemplaresPrestados());

		System.out.println();

		// MOSTRAR LOS DATOS DE LIBRO 2
		System.out.println("Datos de " + libro2.getTitulo());
		System.out.println("Nombre del libro: " + libro2.getTitulo());
		System.out.println("Número del autor: " + libro2.getAutor());
		System.out.println("Número de ejemplares del libro: " + libro2.getEjemplaresLibro());
		System.out.println("Número de ejemplares prestados: " + libro2.getEjemplaresPrestados());

	}

}
