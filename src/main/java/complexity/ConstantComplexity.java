package complexity;

import java.util.List;

import helper.Helper;

/*
 * Complexité constante : O(1)
 * Accès à élément n d'un tableau de taille k
 * 
 */
public class ConstantComplexity {

	public static void get(int n, int k) {

		String desc = "Complexité constante : O(1)";

		if(n > k) {
			throw new RuntimeException("n doit être inférieur ou égal à k");
		}
		
		int[] params = {n, k};
		
		
		int[] integers = Helper.createRandomList(k);
		double t1 = System.currentTimeMillis();
		
		System.out.println("Element (n = " + n + ") du tableau (de taille k = " + k + ") : " + integers[n] );

		double t2 = System.currentTimeMillis();
		Helper.getResults(params, desc, t1, t2);

	}

}
