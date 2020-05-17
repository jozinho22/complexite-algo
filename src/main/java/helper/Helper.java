package helper;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Helper {

	public static void getResults(int[] params, String complexite, double t1, double t2) {
		for(int k : params) {
			System.out.println("Paramètre : " + k);
		}
		System.out.println("Complexité de " + complexite);
		System.out.println("t1 = " + t1);
		System.out.println("t2 = " + t2);
		System.out.println("Temps d'éxécution : " + (double) (t2 - t1) + "ms");
		System.out.println("---------------------------------------");
	}

	public static int[] createRandomList(int n) {

		int[] integers = new int [n];
		
		Random random = new Random();

		for (int i = 0; i < n; i++) {
			integers[i] = random.nextInt(100);
		}

		return integers;

	}

	public static int[] createOrderedList(int n) {
		
		int[] integers = new int [n];

		for (int i = 1; i < n; i++) {
			integers[i] = i;
		}

		return integers;

	}
	
	public static void displayValeurs(int[] integers, boolean triees) {
		String message ;
		if(triees) {
			message = "Valeur triées";
		} else {
			message = "Valeur non triées";
		}
		System.out.println(message);
		for(int i : integers) {
			System.out.println(i);
		}
	}
	
	public static void displayValeursTriees(int[] integers) {
		System.out.println("Valeur non triées");
		for(int i : integers) {
			System.out.println(i);
		}
	}

}
