package main;


public class TestApp2 {
	
	public static void main(String[] args) {

		if(args.length==1 && args[0].equals("c")) {
			System.out.println("Benvingut al curs de programaci� orientada a objectes amb Java");							
		}else if(args.length==1 && args[0].equals("i")) {
			System.out.println("Welcome to Program Oriented Programing Java course");
		}else if(args.length==1 && args[0].equals("e")) {
			System.out.println("Bienvenido al curso de programaci�n orientada a objetos en Java");
		}else{
				if(args.length!=1){
					System.out.println("Error, demasiadas opciones, �nicamente un par�metro!");
				}else{
					System.out.println("Opci�n de par�metro incorrecta, �nicamente 'c' 'i' 'e'");
				}
		}

	}

}