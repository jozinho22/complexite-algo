package complexity;

import helper.Helper;

/*
 * Complexit� quadratique : O(n�)
 * Parcours de tableaux 2D
 * 
 * Tableau de dimensions (n x m)
 * Trouver l'�lement plac� � (k, l)
 * 
 */
public class QuadraticComplexity {
	
	public static void get(int n, int m, int k, int l) {

		String desc = "Complexit� quadratique O(n�)";

		int[] params = { n };

		int[] integers1 = Helper.createRandomList(n);
		int[] integers2 = Helper.createRandomList(m);

		double t1 = System.currentTimeMillis();

		for (int i = 0; i < integers1.length; i++) {
			for (int j = 0; j < integers2.length; j++) {
				if(i == k && j == l) {
					System.out.println(" Element trouv� pour k = " + k + " et l = " + l);
				}
			}
		}

		double t2 = System.currentTimeMillis();
		Helper.getResults(params, desc, t1, t2);
	}
}
