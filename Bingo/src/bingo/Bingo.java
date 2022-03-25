package bingo;

import java.util.Scanner;

public class Bingo {

	public static void main(String[] args) {
		
	//ganadores
		
	boolean bingo = false;
	boolean linea = false;
		
	//intro

	System.out.println("BINGO IES MARTÍNEZ MONTAÑÉS");
	System.out.println("        PREMIOS");
	System.out.println("     Línea: 100 $");
	System.out.println("     Bingo: 500 $");


	System.out.println(" ");
	System.out.println(" ");

	//Jugador 1

	int dinero1 = 0;
	System.out.println("      Jugador 1");
	for (int i = 1; i <= 23; i++) {
	System.out.print("-");		
	}
		
	System.out.println(" ");

	//definición del cartón 1

	int[][] carton1 = new int[3][5];
	
	//columnas
	
	int numero = 1;
	
	for (int filas1 = 0; filas1 < 3 ; filas1++) {
		for (int columnas1 = 0; columnas1 < 5; columnas1++) {
		
	
		//definición de las tiradas
		
		carton1[filas1][columnas1] = (int)(Math.random()*9+numero);
		
		//columna 1
		
		System.out.print(" " + carton1[filas1][columnas1] + " |");
		
		numero += 10;
		}
	
		numero = 1 ;
		
		System.out.println();
		
	}
		
	System.out.println(" ");
	
		//Jugador 2

		int dinero2 = 0 ;
		System.out.println("      Jugador 2");
		for (int i = 1; i <= 23; i++) {
		System.out.print("-");		
		}
			
		System.out.println(" ");

		//definición del cartón 2

		int[][] carton2 = new int[3][5];
		
		//columnas
		
		numero = 1;
		
		for (int filas2 = 0; filas2 < 3 ; filas2++) {
			for (int columnas2 = 0; columnas2 < 5; columnas2++) {
			
		
			//definición de las tiradas
			
			carton2[filas2][columnas2] = (int)(Math.random()*9+numero);
			
			//columna 2
			
			System.out.print(" " + carton2[filas2][columnas2] + " |");
			
			numero += 10;
			}
		
			numero = 1 ;
			
			System.out.println();
		
		}

		System.out.println(" ");
		
		//escáner
		
		Scanner s = new Scanner(System.in);
		
		//bola
		
		do {
		
		System.out.println("Pulse una tecla para sacar una bola");
		String p = s.next();
		
		
		int bola = (int)(Math.random()*49+1);
		
		System.out.println("Ha salido la bola número " + bola);
		
		System.out.println(" ");
		
		//Jugador 1

		boolean cantar = false;
		
		System.out.println("      Jugador 1");
		for (int i = 1; i <= 23; i++) {
		System.out.print("-");		
		}
			
		System.out.println(" ");
		
		int i = 0;
		int bi = 0;
		
		for (int filas = 0; filas < 3; filas++) {
			for (int columnas = 0; columnas < 5 ; columnas++) {
				
				if (bola == carton1[filas][columnas]) {
					carton1[filas][columnas] = 00;
					
				}
				
				i += carton1[filas][columnas];
				bi += carton1[filas][columnas];
				
		System.out.print(" " + carton1[filas][columnas] + " |");
		
			
		}
			
		if (i == 0 && !linea ) {
			linea = true;
			
			dinero1 += 100;
			cantar = true;
		}
		
		i = 0;
		System.out.println();		
		}
		if (cantar) {
			System.out.println("El jugador 1 ha cantado LINEA");
			cantar = false;
		}
		
		if (bi == 0) {
			bingo = true;
			System.out.println("El jugador 1 ha cantado BINGO");
			dinero1 += 500;
		}
		
		bi = 0;
		System.out.println(" ");
		
		//Jugador 2

		System.out.println("      Jugador 2");
		for (int i2 = 1; i2 <= 23; i2++) {
		System.out.print("-");		
		}
					
		System.out.println(" ");
		
		i = 0;
		
		for (int filas = 0; filas < 3; filas++) {
			for (int columnas = 0; columnas < 5 ; columnas++) {
			
				if (bola == carton2[filas][columnas]) {
					carton2[filas][columnas] = 00;
					
		}		
			
		System.out.print(" " + carton2[filas][columnas] + " |");
		i += carton2[filas][columnas];	
		bi += carton2[filas][columnas];	
		}
			
		System.out.println();
		if (i == 0 && !linea ) {
			linea = true;
			
			dinero2 += 100;
			cantar = true;
		}
		
		i = 0;
		
		
		}
		if (cantar) {
			
		System.out.println("El jugador 2 ha cantado LINEA");
		cantar = false;
		
		}
		
		if (bi == 0) {
			bingo = true;
			System.out.println("El jugador 2 ha cantado BINGO");
			dinero2 += 500;
		}
		
		bi = 0;
		
		}while(!bingo);
		
		System.out.println("Se ha acababo la partida, dinero acumulado:");
		System.out.println("Jugador 1: " + dinero1 + "$");
		System.out.println("Jugador 2: " + dinero2 + "$");
		

		}}

		

