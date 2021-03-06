package ordering;

import helper.Helper;

/*
 * Tri par insertion (O(?))
 * On part du second �lement de la liste de k �l�ments, et on le prend comme cl�.
 * Ensuite on compare cette valeur � tous ces pr�decesseurs, qui vont prendre la 
 * place d'apr�s si cette valeur est inf�rieure � la valeur de son pr�decesseur
 * 
 */
public class InsertionOrderding {

	public static void get(int k) {

		String desc = "Tri par insertion";
		int[] params = { k };
		int[] integers = Helper.createRandomList(k);

//		Helper.displayValeurs(integers, false);

		double t1 = System.currentTimeMillis();

		int key ;

		// Pour chaque nombre en commen�ant par 1
		for (int i = 1; i < integers.length ; i++) {
			// On prend comme cl� la valeur de i
			key = integers[i];
			// On la compare � chaque �l�ment en arri�re pour la ranger au bon endroit
			for (int j = i ; j > 0 ; j--) {
				if(key < integers[j -1]) {
					integers[j] = integers[j - 1];
					integers[j - 1] = key;
				}
			}
		}

		double t2 = System.currentTimeMillis();

//		Helper.displayValeurs(integers, true);

		Helper.getResults(params, desc, t1, t2);

	}
}
