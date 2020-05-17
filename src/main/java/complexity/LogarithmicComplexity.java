package complexity;

import java.util.List;

import helper.Helper;

/*
 * Complexit� logarithmique : O(log(n))
 * Recherche dichotomique
 * 
 * Rechercher un nombre � la n�me place dans une liste ordonn�e de k �l�ments
 * 
 */
public class LogarithmicComplexity {

	public static void get(int n, int k) {

		String desc = "Complexit� logarithmique : O(log(n))";

		if(n > k) {
			throw new RuntimeException("n doit �tre inf�rieur ou �gal � k");
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