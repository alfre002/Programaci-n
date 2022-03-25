Algoritmo ejercicio6
	
	Definir p,a Como real
	
	Escribir "introduzca la cantidad total de preguntas realizadas al candidato"
	Leer p
	Escribir "introduzca la cantidad total de aciertos"
	Leer a
	
	Si a/p<0.5 Entonces
		Escribir "Fuera de nivel"
	Fin Si
	
	Si a/p>=0.5 y a/p<0.75 Entonces
		Escribir "Nivel regular"
	Fin Si
	
	Si a/p>=0.75 y a/p<0.9 Entonces
		Escribir "Nivel medio"
	Fin Si
	
	Si a/p>=0.9 Entonces
		Escribir "Nivel máximo"
	Fin Si
	
FinAlgoritmo
