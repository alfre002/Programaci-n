Algoritmo ejercicio5
	
	Definir sueldo,años Como Real
	
	Escribir "introduzca primero el sueldo y luego los años de antiguedad del trabajador"
	Escribir "sueldo: "
	leer sueldo
	Escribir "años de antiguedad: "
	leer años
	
	Si sueldo<500 y años>=10 Entonces
		Escribir "tiene derecho a un aumento del 20% del sueldo, exactamente " , sueldo*0.2, " euros"
		Escribir "nuevo sueldo del trabajador: ", sueldo + sueldo*0.2, " euros"

	Fin Si
	
	Si sueldo<500 y años<10 Entonces
		Escribir "tiene derecho a un aumento del 5% del sueldo, exactamente " , sueldo*0.05, " euros"
		Escribir "nuevo sueldo del trabajador: ", sueldo + sueldo*0.05, " euros"
		
	Fin Si
	
	Si sueldo>=500 Entonces
		Escribir "su sueldo no se vería modificado, sigue siendo de ", sueldo , " euros"
		
	Fin Si
	
FinAlgoritmo
