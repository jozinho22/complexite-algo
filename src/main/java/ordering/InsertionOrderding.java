package ordering;

import helper.Helper;

/*
 * Tri par insertion (O(?))
 * 
 * 
 * 
 */
public class InsertionOrderding {

	public static void get(int k) {

		String desc = "Tri par insertion";
		int[] params = { k };
		int[] integers = Helper.createRandomList(k);

		Helper.displayValeurs(integers, false);

		double t1 = System.currentTimeMillis();

		int key ;

		// Pour chaque nombre en commençant par 1
		for (int i = 1; i < integers.length ; i++) {
			// On prend comme clé la valeur de i
			key = integers[i];
			// On la compare à chaque élément en arrière pour la ranger au bon endroit
			for (int j = i ; j > 0 ; j--) {
				if(key < integers[j -1]) {
					integers[j] = integers[j - 1];
					integers[j - 1] = key;
				}
			}
		}

		double t2 = System.currentTimeMillis();

		Helper.displayValeurs(integers, true);

		Helper.getResults(params, desc, t1, t2);

	}
}
