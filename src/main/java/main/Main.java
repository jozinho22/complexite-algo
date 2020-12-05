package main;

import strings.MergeNames;

public class Main {
	
	public static void main(String[] args) {
		
		String[] tab1 = {"joss", "jack", "jeff", "jill"};
		String[] tab2 = {"joss", "jane", "julian", "jack"};
		String[] rep = MergeNames.mergeNames(tab1, tab2);
		
		for(String s : rep) {
			System.out.println(s);
		}
		
//		ConstantComplexity.get(300, 10000);
//		LogarithmicComplexity.getIterative(3, 10);
//		LogarithmicComplexity.getRecursive(3, 10);

//		LinearComplexity.get(10000);
		
//		BubbleOrdering.get(100000);
//		SelectionOrdering.get(100000);
//		InsertionOrderding.get(100000);
//		PGCD.pgcd(10,78);
//		System.out.println(PGCDRecursif.pgcd(75, 15));
//		PGCDRecursif.pgcd(75, 15);
//		int k = 7;
//		int p = k / 2;
//		System.out.println(PremierRecursif.isPremier(k, p));
		
//		int[] arr = {45, 7, 4, 15, 12, 147, 8};
//		arr =Arrays.copyOfRange(arr, 6, arr.length); 
//		for(int k : arr) {
//			System.out.print(k);
//		}


	}

}
