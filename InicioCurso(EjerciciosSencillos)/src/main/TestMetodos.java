package main;
import utils.Input;
import utils.Taylor;

public class TestMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	float result = Taylor.mul(5, 0);
				
				if(result==0){
					System.out.println("Multiplicación por cero igual a cero");
					return;
				}
				
		System.out.println("Resultado de la multiplicación : " + result);
	*/
		int numeros[]={1,2,5,8,10,21,24,25};
		
		Taylor.EvenToCero(numeros);
		
		for(int i=0 ; i<numeros.length;i++){
			System.out.print(numeros[i] + " ");
		}
		
	}

}
