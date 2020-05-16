package complexity;

import java.util.List;

import domain.Number;
import helper.Helper;

public class LogarithmicComplexity {

	public static void algorythm(int n, int k) {

		List<Number> list = Number.createOrderedList(n);
		double t1 = System.currentTimeMillis();

		double size = list.size();

		for (int i = 0; i < size / 2; i++) {
			if (i == k) {
				break;
			}
		}

		double t2 = System.currentTimeMillis();
		Helper.getResults(n, "Complexité logarithmique O(log2(n))", t1, t2);
	}

}