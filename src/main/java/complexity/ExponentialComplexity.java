package complexity;

import java.util.List;

import helper.Helper;

/*
 * Complexité exponentielle : O(2^n)
 * Accès à élément n d'un tableau de taille k
 * 
 */
public class ExponentialComplexity {

	public static void get(int n) {
		
		String desc = "Complexité exponentielle : O(2^n)";

		int[] params = {n};

		int[] integers = Helper.createRandomList(n);
		double t1 = System.currentTimeMillis();

		for (int i = 0; i < integers.length; i++) {

			for (int j = 0; j < integers.length; j++) {

				for(int k = 1; k < 1000 ; k++){
//				System.out.println(" Paire i : " + list.get(i) + " - Paire j : " + list.get(j));
				}
			}
			i = 2 * i;
		}

		double t2 = System.currentTimeMillis();

		Helper.getResults(params, desc, t1, t2);

	}

}
