package Funciones_arrays;

public class Varias {
	
	
		//generaArrayInt: Genera un array de tama�o n con n�meros aleatorios cuyo intervalo 
		//(m�nimo y m�ximo) se indica como par�metro.
		
		public static int[] generaArrayInt(int n, int minimo, int maximo) {
		    int[] x = new int[n];

		    for(int i = 0; i < n; i++) {
		      x[i] = (int)(Math.random()*(maximo - minimo + 1) + minimo);
		    }
		      
		    return x;
		  }
		
		//minimoArrayInt: Devuelve el m�nimo del array que se pasa como par�metro.
		public static int minimoArrayInt(int[] x) {
		    int minimo = Integer.MAX_VALUE;
		    
		    for (int n : x) {
		      if (n < minimo) {
		        minimo = n;
		      }
		    }
		    return minimo;
		  }
		
		//maximoArrayInt: Devuelve el m�ximo del array que se pasa como par�metro.
		 public static int maximoArrayInt(int[] x) {
			    int maximo = Integer.MIN_VALUE;
			    
			    for (int n : x) {
			      if (n > maximo) {
			        maximo = n;
			      }
			    }
			      
			    return maximo;
			  }
		 
		 //mediaArrayInt: Devuelve la media del array que se pasa como par�metro
		 public static double mediaArrayInt(int[] x) {
			    int suma = 0;
			    
			    for (int n : x) {
			      suma += n;
			    }
			      
			    return (double)suma / x.length;
			  }
		
		 //muestraArrayInt: Muestra una array.
			
			public static void muestraArrayInt(int x[]) {
			    for (int n : x) {
			      System.out.print(n + " ");
			    }
			    System.out.println();
			  }

}
