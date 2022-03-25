package ejercicio6Solucion;

import java.util.Scanner;
public class PruebaFecha {

	public static void main(String[] args) {
		int dia,mes,anio;
		Scanner s= new Scanner(System.in);
		boolean correcta=true;
	
		
		//Pido los valores de fecha
		System.out.println("Introduce un d�a:");
		dia=s.nextInt();
		System.out.println("Introduce un mes:");
		mes=s.nextInt();
		System.out.println("Introduce un a�o:");
		anio=s.nextInt();
		
		//Creo el objeto fecha con los valores introducidos
		Fecha f1=new Fecha(dia, mes, anio);
		
		//Si la fecha introducida es correcta, la muestro
		if (f1.fechaCorrecta()) {
			System.out.println("La fecha introducida es :"+f1);
			
		}else {
			System.out.println("La fecha introducida no es correcta.");
			correcta=false;
		}
			;
		s.close();
		
		//Si la fecha es correcta muestro las 10 fechas siguientes a la fecha introducida
		
		System.out.println("Los 10 d�as siguientes son: ");
		if(correcta) {
			for (int i=0; i<10;i++) {
				f1.diaSiguiente();
				System.out.println(f1);
			}
		}
		

	}

}
