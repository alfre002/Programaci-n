Algoritmo ejercicio5
	
	Definir sueldo,a�os Como Real
	
	Escribir "introduzca primero el sueldo y luego los a�os de antiguedad del trabajador"
	Escribir "sueldo: "
	leer sueldo
	Escribir "a�os de antiguedad: "
	leer a�os
	
	Si sueldo<500 y a�os>=10 Entonces
		Escribir "tiene derecho a un aumento del 20% del sueldo, exactamente " , sueldo*0.2, " euros"
		Escribir "nuevo sueldo del trabajador: ", sueldo + sueldo*0.2, " euros"

	Fin Si
	
	Si sueldo<500 y a�os<10 Entonces
		Escribir "tiene derecho a un aumento del 5% del sueldo, exactamente " , sueldo*0.05, " euros"
		Escribir "nuevo sueldo del trabajador: ", sueldo + sueldo*0.05, " euros"
		
	Fin Si
	
	Si sueldo>=500 Entonces
		Escribir "su sueldo no se ver�a modificado, sigue siendo de ", sueldo , " euros"
		
	Fin Si
	
FinAlgoritmo
