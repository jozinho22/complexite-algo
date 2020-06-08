package main;

import complexity.ConstantComplexity;
import complexity.LinearComplexity;
import complexity.LogarithmicComplexity;
import iterativity.PGCD;
import ordering.BubbleOrdering;
import ordering.InsertionOrderding;
import ordering.SelectionOrdering;
import recursivity.PGCDRecursif;
import recursivity.PremierRecursif;

public class Main {
	
	public static void main(String[] args) {
		
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
		int k = 7;
		int p = k / 2;
		System.out.println(PremierRecursif.isPremier(k, p));
	}

}
