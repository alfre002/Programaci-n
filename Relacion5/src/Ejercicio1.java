
public class Ejercicio1 {

//	1. esCapicua: Devuelve verdadero si el número que se pasa como parámetro es capicúa
//	y falso en caso contrario.

	public static void main(String[] args) {
		esCapicua(4);
	}

	public static boolean esCapicua(int x) {

		return x == voltea(x);
	}
	
	public static int voltea(long x) {
	    return (int)voltea((long)x);
	  }

}
