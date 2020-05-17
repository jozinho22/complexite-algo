package ordering;

import helper.Helper;

/*
 * Tri par bulle (O(n²))
 * Comparer les éléments un à un d'un tableau de k entiers, et les inverser si besoin
 * Façon la plus simple de trier
 * 
 */
public class BubbleOrdering {

	public static void get(int k) {

		String desc = "Tri par bulles";
		
		int[] params = {k};
		
		int[] integers = Helper.createRandomList(k);
		
//		Helper.displayValeurs(integers, false);
		
		double t1 = System.currentTimeMillis();

		boolean trie = false;
		int tmp;
		
		while(!trie) {
			trie = true ;
			for(int i = 0; i < integers.length - 1  ; i++) {
				if(integers[i] > integers[i + 1]) {
					tmp = integers[i + 1];
					integers[i + 1] = integers[i];
					integers[i] = tmp;
					trie = false;
				}
			}
		}

		double t2 = System.currentTimeMillis();
		
//		Helper.displayValeurs(integers, true);
		
		Helper.getResults(params, desc, t1, t2);
	}
	
}
