package complexity;

import java.util.List;

import domain.Number;
import helper.Helper;

public class PolynomialeComplexity {

	public static void algorythm(int n) {

		List<Number> list = Number.createRandomList(n);
		double t1 = System.currentTimeMillis();
	
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
//					System.out.println(" Paire i : " +  list.get(i) + " - Paire j : " +  list.get(j));
			}
		}
		
		double t2 = System.currentTimeMillis();
		Helper.getResults(n, "Complexité polynomiale O(n^2)", t1, t2);
	}

}
