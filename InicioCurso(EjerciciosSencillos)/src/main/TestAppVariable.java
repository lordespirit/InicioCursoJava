package main;
public class TestAppVariable {

	public static void main(String[] args) {

		// Comprobamos que el argumento sea una 't' que llamaria a la formula de triangulo
		if (args.length==3 && args[0].equals("t")){
			
			double dArea_tri = (Float.valueOf(args[1]) * Float.valueOf(args[2])) / 2;
			System.out.println("El area del triángulo de base " + args[1] + " y altura " + args[2] + " es de : " + dArea_tri);
				
		// Comprobamos que el argumento sea una 'c' que llamaria a la formula del cuadrado
		}else if(args.length==2 && args[0].equals("c")){
			
			double dArea_cua = Math.pow(Float.valueOf(args[1]),2);
			System.out.println("El area del cuadrado de " + args[1] + " es de " + dArea_cua);	
					
		// Comprobamos que el argumento sea una 'ci' que llamaria a la formula del círculo
		}else if(args.length==2 &&args[0].equals("ci")){
			
			double dPi = 3.1416;
			double dArea_cir = dPi * Math.pow(Float.valueOf(args[1]),2);
			System.out.println("El area del cículo de radio " + args[1] + " es de : " + dArea_cir);
			
		}else{
			
			if (args.length==0){
			
				System.out.println("No has introducido ningún paràmetro!");
				
			}else{
				
				System.out.println("Error en el número de parámetros!");
			
			}
		}
		
	}
	
}
