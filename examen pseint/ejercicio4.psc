Algoritmo ejercicio4
	
	Definir x,z Como Entero
	//sustituyo la "y" por una "z" ya que el programa no lo lee como variable
	
	Escribir "introduce las coordenadas (x,z) de un punto en el plano que sean distintas a 0"
	Leer x,z
	
	Si x>0 y z>0 Entonces
		Escribir "el punto se encuentra en el 1� cuadrante"
	Fin Si
	
	Si x<0 y z>0 Entonces
		Escribir "el punto se encuentra en el 2� cuadrante"
	Fin Si
	
	Si x<0 y z<0 Entonces
		Escribir "el punto se encuentra en el 3� cuadrante"
	Fin Si
	
	Si x>0 y z<0 Entonces
		Escribir "el punto se encuentra en el 4� cuadrante"
	Fin Si
	
FinAlgoritmo
