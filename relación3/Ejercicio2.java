package relación3;

//Realiza un programa que muestre al azar el nombre de una carta de la baraja francesa. Esta
//baraja está dividida en cuatro palos: picas, corazones, diamantes y tréboles. Cada palo está
//formado por 13 cartas, de las cuales 9 cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8,
//9, 10, J, Q, K y A (que sería el 1). 

public class Ejercicio2 {

	public static void main(String[] args) {

		int palo = 0 ;
		int numero = 0;
		
		for (int i = 1; i <= 4; i++) {
			palo = (int)(Math.random()*4+1);
			
		}
		
		for (int i = 1; i <= 13; i++) {
			numero = (int)(Math.random()*13+1);
		}
		
		
		switch (palo) {
		case 1:
			
			System.out.println("Palo: picas");
			break;
			
		case 2:
			
			System.out.println("Palo: corazones");
			break;
			
		case 3:
			System.out.println("Palo: diamantes");
			break;
			
		case 4:
			System.out.println("Palo: tréboles");
			break;
			
		default:
			break;
		}
		
		switch (numero) {
		case 1:
			System.out.println("Número: A");
			break;
			
		case 2:
			System.out.println("Número: 2");
			break;
			
		case 3:
			System.out.println("Número: 3");
			break;
			
		case 4:
			System.out.println("Número: 4");
			break;
			
		case 5:
			System.out.println("Número: 5");
			break;
			
			
		case 6:
			System.out.println("Número: 6");
			break;
			
		case 7:
			System.out.println("Número: 7");
			break;
			
		case 8:
			System.out.println("Número: 8");
			break;
			
		case 9:
			System.out.println("Número: 9");
			break;
			
		case 10:
			System.out.println("Número: 10");
			break;
			
		case 11:
			System.out.println("Número: J");
			break;
			
		case 12:
			System.out.println("Número: Q");
			break;
			
		case 13:
			System.out.println("Número: K");
			break;
			

		default:
			break;
		}
		
	}

}
