package ordering;

import helper.Helper;

/*
 * Tri par sélection (O(?))
 * 
 * 
 */
public class SelectionOrdering {

	public static void get(int k) {

		String desc = "Tri par sélection";
		int[] params = {k};
		int[] integers = Helper.createRandomList(k);
		
//		Helper.displayValeurs(integers, false);

		double t1 = System.currentTimeMillis();
		
		boolean trie = false;
		int i, j , min , tmp ;
		
		while(!trie) {
			trie = true;
			for(i = 0 ; i < integers.length - 1 ; i ++) {
				min = i;
				for(j = i + 1 ; j < integers.length ; j++) {
					if(integers[j] < integers[min]) {
						min = j ; 
						trie = false;
					}
				}
				
				if(min != i) {
					tmp = integers[min] ;
					integers[min] = integers[i];
					integers[i] = min;
		
				}
			}
		}


		double t2 = System.currentTimeMillis();
		
//		Helper.displayValeurs(integers, true);

		Helper.getResults(params, desc, t1, t2);

	}
}
