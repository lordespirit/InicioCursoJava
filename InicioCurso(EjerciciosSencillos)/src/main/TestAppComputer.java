package main;

public class TestAppComputer {

	public static void main(String[] args) {

		if (args.length==2 && args[0].equals("square")){
			float dNum = Float.valueOf(args[0]);
			System.out.println("Cálculo = " + Math.pow(dNum,2));
		}

	}

}
