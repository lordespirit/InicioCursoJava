package utils;

public class Taylor { // CLASE

	/**
	 *  Este método calcula la serie de taylor del cos(x)
	 *  @param x valor a calcular coseno
	 *  @param n número de iteraciones
	 *  @return Devuelve un float
	 */ 
	public static float mul(float x, int n){  // esto se llama FIRMA
		return x*n;
	}
	
	/**
	 * Este método calcula la serie de taylor de la función euler
	 * @param x valor a calcular
	 * @param n valor a calcu
	 * 
	 */
	public static float euler(float x, int n){
		
		return n;
	
	}
	
	/**
	 * Este método ordena un array de enteros de mayor a menos
	 * @param x es el array de enteros a ordenar
	 * @return Devuelve el array
	 */
	public static int[] maxsort(int arreglo[]){
		// TODO definir método
		return arreglo;
	}
	
	/**
	 * Este método ordena un array de enteros de menor a mayor
	 * @param x es el array de enteros a ordenar
	 * @return Devuelve el array
	 */
	public static int[] minsort(int arreglo[]){
		// TODO definir método
		return arreglo;
	}
	
	/**
	 * Este método recibe un arreglo de enteros y convierto los pares a 0 
	 * @param arreglo
	 * @return no devuelve nada
	 */
	public static void EvenToCero(int arreglo[]){
		
		for(int i=0 ; i<arreglo.length;i++){
			arreglo[i]=(arreglo[i]%2==0) ? 0: arreglo[i];
		}
		
	}
	
}
