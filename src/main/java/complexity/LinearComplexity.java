package complexity;

import java.util.List;

import domain.Number;
import helper.Helper;

public class LinearComplexity {

	public static void algorythm(int n) {

		List<Number> list = Number.createRandomList(n);
		double t1 = System.currentTimeMillis();

		for (int i = 0; i < list.size(); i++) {
		}

		double t2 = System.currentTimeMillis();
		Helper.getResults(n, "Complexité linéaire O(n)", t1, t2);
	}

}
