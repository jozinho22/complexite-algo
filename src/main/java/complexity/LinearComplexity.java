package complexity;

import java.util.List;

import helper.Helper;

/*
 * Complexit� lin�aire : O(n)
 * Parcours de liste de n �l�ments
 * 
 */
public class LinearComplexity {

	public static void get(int n) {

		String desc = "Complexit� lin�aire O(n)";

		int[] params = {n};

		int[] integers = Helper.createRandomList(n);
		double t1 = System.currentTimeMillis();

		for (int i = 0; i < integers.length; i++) {
			integers[i] = i;
		}

		double t2 = System.currentTimeMillis();
		Helper.getResults(params, desc, t1, t2);
	}

}
