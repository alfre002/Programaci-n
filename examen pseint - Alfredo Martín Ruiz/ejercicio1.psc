
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

Algoritmo ejercicio1
	
	
	
	Definir n Como Entero
	
Repetir
		
	
	
	Escribir "MEN� DE OPCIONES"
	
	Escribir "1. Sumar 2 n�meros"
	Escribir "2. Restar 2 n�meros"
	Escribir "3. Multiplicar 2 n�meros"
	Escribir "4. Dividir 2 n�meros"
	Escribir "5. SALIR"
	
	Escribir " "
	
	Escribir "introduzca el primer n�mero de la operaci�n: "
	Leer a
	Escribir "introduzca el segundo n�mero de la operaci�n: "
	Leer b
	
	Escribir " "
	
	Escribir "introduzca la opci�n que desee"
	Leer n
	
	Segun n Hacer
		1:
			suma(a,b)
		2:
			resta(a,b)
		3:
			producto(a,b)
		4:
			cociente(a,b)
		5:
			Escribir "fin del proceso"
			
		De Otro Modo:
			Escribir "el n�mero introducido no est� entre los valores indicados"
	Fin Segun
	
	Escribir " "
	
Hasta Que n=5
	
	
	
FinAlgoritmo
