package soluciones.Matematicas;
public class Varias {
	/**
	   * Ejercicio 1.esCapicua.Devuelve verdadero si el n�mero que se pasa como par�metro es capic�a y
	   * falso en caso contrario.
	   * Un n�mero capic�a es el que se lee igual de izquierda a derecha que de
	   * derecha a izquierda.
	   * 
	   */
	  public static boolean esCapicua(long x) {
	    return x == voltea(x);
	  }

	  //Lo mismo pero para enteros
	  
	  public static boolean esCapicua(int x) {
	    return esCapicua((long)x);
	  }
	  
	  /**
	   * Ejercicio 6. voltea.Le da la vuelta a un n�mero.
	   *
	   */
	  public static long voltea(long x) {
		    if (x < 0) {
		      return -voltea(-x);
		    }

		    long volteado = 0;

		    while(x > 0) {
		      volteado = (volteado * 10) + (x % 10);
		      x = x / 10;
		    }

		    return volteado;
		  }
	

	  //Lo mismo pero para enteros
	  
		  public static int voltea(int x) {
		    return (int)voltea((long)x);
		  }
		  /**
		   * Ejercicio 2. esPrimo.Devuelve verdadero si el n�mero que se pasa como par�metro es primo y falso
		   * en caso contrario.
		   * Un n�mero primo es un n�mero natural mayor que 1 y divisible �nicamente
		   * entre el mismo y entre 1.
		   *
		   */
		  public static Boolean esPrimo(long n) {
		    if (n < 2) {
		      return false;
		    } else {
		      for (long i = n-1; i >= 2; i--) {
		        if (n % i == 0) {
		          return false;
		        }
		      }
		    }
		    return true;
		  }

		  //Lo mismo pero para enteros
		  
		  public static Boolean esPrimo(int n) {
		    return esPrimo((long) n);
		  }
		  /**
		   * Ejercicio3.siguientePrimo.Devuelve el menor primo que es mayor al n�mero que se pasa como par�metro.
		   *
		   */
		  public static int siguientePrimo(int x) {
		    while (!esPrimo(++x)) {};

		    return x;
		  }
		  /**
		   * Ejercicio 4. pontencia.Dada una base y un exponente, devuelve la potencia.
		   *
		   */
		  public static double potencia(int base, int exponente) {
		    if (exponente == 0) {
		      return 1;
		    }

		    if (exponente < 0) {
		      return 1/potencia(base, -exponente);
		    }

		    int n = 1;

		    for (int i = 0; i < Math.abs(exponente); i++) {
		      n = n * base;
		    }

		    return n;
		  }
		  /**
		   * Ejercicio 5. digitos.Cuenta el n�mero de d�gitos de un n�mero entero.
		   *
		   */
		  public static int digitos(long x) {
		    if (x < 0) {
		      x = -x;
		    }

		    if (x == 0) {
		      return 1;
		    } else {
		      int n = 0;
		      while (x > 0) {
		        x = x / 10; // se le quita un d�gito a x
		        n++; // incrementa la cuenta de d�gitos
		      }
		      return n;
		    }
		  }
		  /**
		  /* Ejercicio 7. digitoN.Devuelve el d�gito que est� en la posici�n n de un n�mero
		   * entero. Se empieza contando por el 0 y de izquierda a derecha.
		   *
		   */
		  public static int digitoN(long x, int n) {
		    x = voltea(x);

		    while (n-- > 0) {
		      x = x / 10;
		    }

		    return (int)x % 10;
		  }


}
