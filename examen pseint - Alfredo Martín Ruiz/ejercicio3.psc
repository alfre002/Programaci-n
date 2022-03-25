Algoritmo ejercicio3
	
	
	Escribir "introduzca una frase sin usar tildes"
	Leer frase
	
	Para i=Longitud(frase) hasta 1 Hacer
		Escribir sin saltar Subcadena(frase,i,i)
		
		si frase=Subcadena(frase,i,i) Entonces
			Escribir "esta frase es palíndroma"
			finsi
	FinPara

	
	Escribir " "
	
	
	
	
FinAlgoritmo
