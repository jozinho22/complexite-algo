package complexity;

import java.util.List;

import helper.Helper;

/*
 * Complexité logarithmique : O(log2(n))
 * Recherche dichotomique
 * 
 * Rechercher un nombre à la nème place dans une liste ordonnée de k éléments
 * 
 */
public class LogarithmicComplexity {

	public static void getIterative(int n, int k) {

		String desc = "Complexité logarithmique : O(log(n))";

		if (n > k) {
			throw new RuntimeException("n doit être inférieur ou égal à k");
		}

		int[] params = { n, k };

		int[] integers = Helper.createOrderedList(k);
		Helper.displayValeurs(integers, true);

		double t1 = System.currentTimeMillis();

		int a = integers[0], z = integers[k - 1];
		int mid = (a + z) / 2;

		while (a <= z) {
			if (integers[mid] < n) {
				a = mid + 1;
			} else if (integers[mid] == n) {
				System.out.println("L'élément se trouve à l'index: " + mid);
				break;
			} else {
				z = mid - 1;
			}
			mid = (a + z) / 2;
		}

		if (a > z) {
			System.out.println("L'élément n'existe pas!");
		}

		double t2 = System.currentTimeMillis();
		Helper.getResults(params, desc, t1, t2);
	}

	public static void getRecursive(int n, int k) {

		String desc = "Complexité logarithmique : O(log(n))";

		if (n > k) {
			throw new RuntimeException("n doit être inférieur ou égal à k");
		}

		int[] params = { n, k };

		int[] integers = Helper.createOrderedList(k);
		Helper.displayValeurs(integers, true);

		double t1 = System.currentTimeMillis();

		int a = integers[0], z = integers[k - 1];

		process(integers, a, z, n);

		if (a > z) {
			System.out.println("L'élément n'existe pas!");
		}

		double t2 = System.currentTimeMillis();
		Helper.getResults(params, desc, t1, t2);
	}

	private static int process(int[] integers, int a, int z, int n) {
		if (z >= a) {
			int mid = a + (z - a) / 2;
			if (integers[mid] == n) {
				System.out.println("L'élément se trouve à l'index: " + mid);
				return mid;
			}
			if (integers[mid] > n) {
				// recherche dans le sous-tableau à gauche
				return process(integers, a, mid - 1, n);
			} else {
				// recherche dans le sous-tableau à droit
				return process(integers, mid + 1, z, n);
			}
		}
		return -1;
	}

}