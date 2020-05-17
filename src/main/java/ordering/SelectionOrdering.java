package ordering;

import helper.Helper;

/*
 * Tri par sélection (ou tri par extraction) (O(n²))
 * On compare chaque élément de la liste de k éléments à tous ces successeurs
 * On les intervertie à chaque fois si c'est nécessaire.
 * 
 */
public class SelectionOrdering {

	public static void get(int k) {

		String desc = "Tri par sélection";
		int[] params = { k };
		int[] integers = Helper.createRandomList(k);

//		Helper.displayValeurs(integers, false);

		double t1 = System.currentTimeMillis();

		int i, j, min, tmp;

		for (i = 0 ; i < integers.length - 1 ; i++) {
			min = i;
			for (j = i + 1; j < integers.length; j++) {
				if (integers[j] < integers[min]) {
					min = j ;
				}
			}

			if (min != integers[i]) {
				tmp = integers[min];
				integers[min] = integers[i];
				integers[i] = tmp;

			}
		}

		double t2 = System.currentTimeMillis();

//		Helper.displayValeurs(integers, true);

		Helper.getResults(params, desc, t1, t2);

	}
}
