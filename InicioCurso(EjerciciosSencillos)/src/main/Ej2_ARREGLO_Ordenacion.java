package main;

public class Ej2_ARREGLO_Ordenacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(args.length<=0){
			
			System.out.print("No has introducido ningún parámetro!");
			
		}else{
			
			int numeros[] = new int[args.length];
			
				for(int i=0;i<args.length;i++){
					
					numeros[i] = Integer.valueOf(args[i]);
					
				}
				
				// ORDENACIÓN
				
				for(int i=1; i<numeros.length; i++){
					
					if(numeros[i]<numeros[i-1]){
						int control = numeros[i];
						numeros[i]=numeros[i-1];
						numeros[i-1]=control;
						i=1;
					}
					
				}
				
				// MOSTRAMOS EL ARRAY DIMENSIONAL ORDENADO
				
				for(int i=0;i<numeros.length;i++){
					System.out.print(numeros[i] + " ");
				}
				
		}
		
	}

}