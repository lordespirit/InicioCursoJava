package main;


public class TestApp2 {
	
	public static void main(String[] args) {

		if(args.length==1 && args[0].equals("c")) {
			System.out.println("Benvingut al curs de programació orientada a objectes amb Java");							
		}else if(args.length==1 && args[0].equals("i")) {
			System.out.println("Welcome to Program Oriented Programing Java course");
		}else if(args.length==1 && args[0].equals("e")) {
			System.out.println("Bienvenido al curso de programación orientada a objetos en Java");
		}else{
				if(args.length!=1){
					System.out.println("Error, demasiadas opciones, únicamente un parámetro!");
				}else{
					System.out.println("Opción de parámetro incorrecta, únicamente 'c' 'i' 'e'");
				}
		}

	}

}