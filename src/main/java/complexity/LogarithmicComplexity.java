package complexity;

import java.util.List;

import helper.Helper;

/*
 * Complexité logarithmique : O(log(n))
 * Recherche dichotomique
 * 
 * Rechercher un nombre à la nème place dans une liste ordonnée de k éléments
 * 
 */
public class LogarithmicComplexity {

	public static void get(int n, int k) {

		String desc = "Complexité logarithmique : O(log(n))";

		if(n > k) {
			throw new RuntimeException("n doit être inférieur ou égal à k");
		}
		
		int[] params = {n, k};
		
		int[] integers = Helper.createOrderedList(n);
		
		double t1 = System.currentTimeMillis();

		double size = integers.length;

		for (int i = 0; i < size / 2; i++) {
			if (i == k) {
				System.out.println("Element (n = " + n + ") du tableau (de taille k = " + k + ") : " + integers[n] );
				break;
			}
		}

		double t2 = System.currentTimeMillis();
		Helper.getResults(params, desc, t1, t2);
	}

}