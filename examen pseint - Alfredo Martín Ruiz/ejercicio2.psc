SubProceso suma(a,b)
	Escribir a+b
FinSubProceso

SubProceso resta(a,b)
	Escribir a-b
FinSubProceso

SubProceso producto(a,b)
	Escribir a*b
FinSubProceso

SubProceso cociente(a,b)
	Escribir a/b
FinSubProceso

Algoritmo ejercicio2
	
	
	


Definir n1,n2,n3,n4,n5,n6 Como Entero

Escribir "MEN� PRINCIPAL"

Escribir "1. Operaciones b�sicas"
Escribir "2. Operaciones variadas"
Escribir "3. SALIR"

Leer n1

Segun n1 Hacer
	1:
		Repetir
		
		Escribir " "
		Escribir "MEN� DE OPERACIONES B�SICAS"
		Escribir "1. Sumar 2 n�meros"
		Escribir "2. Restar 2 n�meros"
		Escribir "3. Multiplicar 2 n�meros"
		Escribir "4. Dividir 2 n�meros"
		Escribir "5. REGRESAR"
		
		Escribir " "
		
		Escribir "introduzca el primer n�mero de la operaci�n: "
		Leer a
		Escribir "introduzca el segundo n�mero de la operaci�n: "
		Leer b
		
		Escribir " "
		
		Escribir "introduzca la opci�n que desee"
		Leer n2
		
		Segun n2 Hacer
			1:
				suma(a,b)
			2:
				resta(a,b)
			3:
				producto(a,b)
			4:
				cociente(a,b)
			5:
				Escribir "1. Operaciones b�sicas"
				Escribir "2. Operaciones variadas"
				Escribir "3. SALIR"
				
				Leer n1
				Segun n1 Hacer
					1:
						Repetir
							
							Escribir " "
							Escribir "MEN� DE OPERACIONES B�SICAS"
							Escribir "1. Sumar 2 n�meros"
							Escribir "2. Restar 2 n�meros"
							Escribir "3. Multiplicar 2 n�meros"
							Escribir "4. Dividir 2 n�meros"
							Escribir "5. REGRESAR"
							
							Escribir " "
							
							Escribir "introduzca el primer n�mero de la operaci�n: "
							Leer a
							Escribir "introduzca el segundo n�mero de la operaci�n: "
							Leer b
							
							Escribir " "
							
							Escribir "introduzca la opci�n que desee"
							Leer n2
							
							Segun n2 Hacer
								1:
									suma(a,b)
								2:
									resta(a,b)
								3:
									producto(a,b)
								4:
									cociente(a,b)
								5:
									Escribir "1. Operaciones b�sicas"
									Escribir "2. Operaciones variadas"
									Escribir "3. SALIR"
									
									Leer n1
									
									
								De Otro Modo:
									Escribir "el n�mero introducido no est� entre los valores indicados"
							Fin Segun
							
							
						Hasta Que n2=5
						
					2:
						Escribir " "
						Escribir "MEN� DE OPERACIONES VARIADAS"
						Escribir "1. N�mero y d�a"
						Escribir "2. Suma de los n primeros n�meros naturales"
						Escribir "3. N�mero primo"
						Escribir "4. Invertir un n�mero de 4 cifras"
						Escribir "5. REGRESAR"
						
						Escribir " "
						
						Escribir "introduzca la opci�n que desee"
						Leer n3
						
						Segun n3 Hacer
							1:
								Escribir " Introduzca un n�mero del 1 al 7"
								Leer n4
								Segun n4 Hacer
									1:
										Escribir "Lunes"
									2:
										Escribir "Martes"
									3:
										Escribir "Mi�rcoles"
									4:
										Escribir "Jueves"
									5:
										Escribir "Viernes"
									6:
										Escribir "S�bado"
									7:
										Escribir "Domingo"
										
									De Otro Modo:
										Escribir "El n�mero introducido no es ning�n dia de la semana"
								Fin Segun
							2:
								Escribir "introduzca un n�mero"
								Leer n5
								Para f<-1 Hasta n5 Hacer
									suma(f,n5)
								Fin Para
								
							3:
								
								Escribir "introduzca un n�mero entero"
								Leer n6
								si n6/2==1 o  n6/2==2 o  n6/2==3 o  n6/2==4 o  n6/2==5 o  n6/2==6 o  n6/2==7 o  n6/3==1 o n6/3==2 o n6/3==3 o n6/3==4 o n6/3==5 o n6/3==6 o n6/3==7 o n6/5==1 o n6/5==5 o n6/5==10 o n6/5==15 o n6/5==20 o n6/5==25 o n6/7==1 o n6/7==2 o n6/7==3 o n6/7==4 o n6/7==5 o n6/7==6 o n6/7==7 o n6/7==8 o n6/7==9 Entonces
									Escribir "el n�mero introducido no es primo"
								SiNo
									Escribir "el n�mero introducido es primo"
								FinSi
								
							4:
								Escribir "introduzca un n�mero de 4 cifras"
								Leer n7
								Para i=Longitud(n7) hasta 1 Hacer
									Escribir Sin saltar Subcadena(n7,i,i)
								FinPara
								Escribir " "
								
							5:
								Escribir "1. Operaciones b�sicas"
								Escribir "2. Operaciones variadas"
								Escribir "3. SALIR"
								
								Leer n1
								
		Fin Segun
	
		
		
	
Fin Segun
				
			De Otro Modo:
				Escribir "el n�mero introducido no est� entre los valores indicados"
		Fin Segun
		
		
	Hasta Que n2=5
	
	2:
		Escribir " "
		Escribir "MEN� DE OPERACIONES VARIADAS"
		Escribir "1. N�mero y d�a"
		Escribir "2. Suma de los n primeros n�meros naturales"
		Escribir "3. N�mero primo"
		Escribir "4. Invertir un n�mero de 4 cifras"
		Escribir "5. REGRESAR"
		
		Escribir " "
		
		Escribir "introduzca la opci�n que desee"
		Leer n3
		
		Segun n3 Hacer
			1:
				Escribir " Introduzca un n�mero del 1 al 7"
				Leer n4
				Segun n4 Hacer
					1:
						Escribir "Lunes"
					2:
						Escribir "Martes"
					3:
						Escribir "Mi�rcoles"
					4:
						Escribir "Jueves"
					5:
						Escribir "Viernes"
					6:
						Escribir "S�bado"
					7:
						Escribir "Domingo"
						
					De Otro Modo:
						Escribir "El n�mero introducido no es ning�n dia de la semana"
				Fin Segun
			2:
				Escribir "introduzca un n�mero"
				Leer n5
				Para f<-1 Hasta n5 Hacer
					suma(f,n5)
				Fin Para
				
			3:
				
				Escribir "introduzca un n�mero entero"
				Leer n6
				si n6/2==1 o  n6/2==2 o  n6/2==3 o  n6/2==4 o  n6/2==5 o  n6/2==6 o  n6/2==7 o  n6/3==1 o n6/3==2 o n6/3==3 o n6/3==4 o n6/3==5 o n6/3==6 o n6/3==7 o n6/5==1 o n6/5==5 o n6/5==10 o n6/5==15 o n6/5==20 o n6/5==25 o n6/7==1 o n6/7==2 o n6/7==3 o n6/7==4 o n6/7==5 o n6/7==6 o n6/7==7 o n6/7==8 o n6/7==9 Entonces
					Escribir "el n�mero introducido no es primo"
				SiNo
					Escribir "el n�mero introducido es primo"
				FinSi
			
			4:
				Escribir "introduzca un n�mero de 4 cifras"
				Leer n7
				
					Para i=Longitud(n7) hasta 1 Hacer
						Escribir Sin saltar Subcadena(n7,i,i)
					FinPara
				Escribir " "
				
			5:
				Escribir "1. Operaciones b�sicas"
				Escribir "2. Operaciones variadas"
				Escribir "3. SALIR"
				
				Leer n1
				
		Fin Segun
	
		
		
	
Fin Segun

FinAlgoritmo
