package main;

import complexity.ConstantComplexity;
import complexity.LinearComplexity;
import complexity.LogarithmicComplexity;
import ordering.BubbleOrdering;
import ordering.InsertionOrderding;
import ordering.SelectionOrdering;

public class Main {

	public static void main(String[] args) {
		
//		ConstantComplexity.get(300, 10000);
//		LogarithmicComplexity.getIterative(3, 10);
		LogarithmicComplexity.getRecursive(3, 10);

//		LinearComplexity.get(10000);
		
//		BubbleOrdering.get(100000);
//		SelectionOrdering.get(100000);
//		InsertionOrderding.get(100000);
	}

}
