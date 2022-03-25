package paquete;
public class Ejercicio4 {

//	Define tres arrays de 20 números enteros cada una, con nombres: numero, cuadrado y cubo.
//	Carga el array numero con valores aleatorios entre 0 y 100. En el array cuadrado se deben
//	almacenar los cuadrados de los valores que hay en el array numero. En el array cubo se
//	deben almacenar los cubos de los valores que hay en numero. A continuación, muestra el
//	contenido de los tres arrays dispuesto en tres columnas.

	public static void main(String[] args) {

		// ARRAY NUMERO
		int numero[];
		numero = new int[20];

		// ARRAY CUADRADO
		int cuadrado[];
		cuadrado = new int[20];

		// ARRAY CUBO
		int cubo[];
		cubo = new int[20];

		// números aleatorios
		for (int x = 0; x < 20; x++) {
			int aleatorio = (int) (Math.random() * 100);

			numero[x] = aleatorio;
			System.out.print(numero[x]);
			System.out.print(" - ");
			cuadrado[x] = aleatorio * aleatorio;
			System.out.print(cuadrado[x]);
			System.out.print(" - ");
			cubo[x] = aleatorio * aleatorio * aleatorio;
			System.out.println(cubo[x]);
			System.out.println(" ");
		}

	}
}
