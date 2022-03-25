package relación3;
//Escribe un programa que muestre la tirada de tres dados. Se debe mostrar también la suma
//total (los puntos que suman entre los tres dados).
public class Ejercicio1 {

	public static void main(String[] args) {

		int suma = 0;
		int tirada = 0;
		
		for(int i=1; i<=3;i++) {
			tirada = (int )(Math.random()*6+1) ;
		System.out.println(tirada + " ");
		suma += tirada  ;
	}
		
		System.out.println("la suma de los 3 dados es: " + suma );

}}
