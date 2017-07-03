package main;

public class TestApp3 {

	public static void main(String[] args) {
		// Uso de numeros enteros y floats con llamadas a otro método
		
			int iNum = 10;
			System.out.println("Primer número entero : " + iNum);
			
			iNum = add2int(iNum,5);
			
			System.out.println("Segundo número, ya modificado : " + iNum);

	}

	public static int add2int (int var1, int var2) {
			return var1 + var2;
	}
	

	
}
