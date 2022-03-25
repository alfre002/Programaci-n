package relación2;



//Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.

public class Ejercicio22 {

	public static void main(String[] args) {

		boolean esPrimo ;
	
		int cont =0;
		
		
		for (int numero = 2 ; numero < 100 ; numero++) {
			
			esPrimo = true;
		
			for (int i = 2 ; i < numero ; i++) {
				if (numero%i==0) {
					esPrimo = false;
					}
				
				}	//comprueba si hay divisores

			if (esPrimo){
				
				cont++;
				System.out.println(numero);
				
			}

		}
		
		
			
		
	System.out.println("los números primos entre el 2 y el 100 son " + cont);
		}
}
	


