package main;

public class Ej1_ARREGLO_ProgramaPares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(args.length<=0){
			
			System.out.print("No has introducido ningún parámetro!");
			
		}else{
			
			int numeros[] = new int[args.length];
			int control=0;
			
			for(int i=0;i<args.length;i++){
				
				int valor = Integer.valueOf(args[i]);
				if(valor%2==0){
					numeros[control]=valor;
					control++;
				}
				
			}
			
			for(int i=0;i<control;i++){
				
				System.out.print(numeros[i] + " ");
				
			}
			
		
		}
	
	}

}
