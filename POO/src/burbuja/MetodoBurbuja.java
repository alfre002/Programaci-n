package burbuja;

public class MetodoBurbuja {

	public static int[] burbuja(int[] A) {
		int aux;
		int[] AOrdenado;
		for (int i = 0; i < A.length - 1; i++) {
			for (int j = 0; j < A.length - i - 1; j++) {
				if (A[j + 1] < A[j]) {
					aux = A[j + 1];
					A[j + 1] = A[j];
					A[j] = aux;
				}
			}
		}
		AOrdenado = A;
		return AOrdenado;
	}

	public static void main(String[] args) {

		//	INTRODUCIR VALORES EN ARRAY ORDENADO
		int A[] = { 7, 9, 69, 8, 777 };
		int AOrdenado[] = burbuja(A);
		
		// IMPRIMIR ARRAY ORDENADO
		for (int i = 0; i < AOrdenado.length; i++) {
			System.out.print("\t" + AOrdenado[i]);
		}
	}
}
