package paquete;

public class Ejercicio2 {
	
//	Define un array de 10 caracteres con nombre símbolo y asigna valores a los elementos
//	según la tabla que se muestra a continuación. Muestra el contenido de todos los elementos
//	del array. ¿Qué sucede con los valores de los elementos que no han sido inicializados?
	
	public static void main(String[] args) {

		String simbolo[];
		simbolo = new String[10];
		simbolo[0] = "a";
		simbolo[1] = "x";
		simbolo[4] = "@";
		simbolo[6] = " ";
		simbolo[7] = "+";
		simbolo[8] = "Q";
		for  (int x = 0; x<simbolo.length; x++)
			  System.out.println(simbolo[x]);
	}

}
