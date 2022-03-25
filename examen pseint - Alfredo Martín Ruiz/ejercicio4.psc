Algoritmo ejercicio4
	
	Definir l como entero
	cont<-0
	
	
	Escribir "introduce el valor de la longitud de la serpiente"
	Leer l
	Escribir "            @"
	Repetir
		x<-azar(3)+1
		cont=cont+1
	
	Segun x Hacer
		1:
			Escribir "           *"
		2:
			Escribir "            *"
		3:
			Escribir "             *"

	Fin Segun
	
	Hasta Que cont=l
	
FinAlgoritmo
