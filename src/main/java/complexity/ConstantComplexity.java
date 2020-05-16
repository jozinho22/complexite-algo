package complexity;

import java.util.List;
import domain.Number;
import helper.Helper;

public class ConstantComplexity {

	public static void algorythm(int n, int k) {

		List<Number> list = Number.createRandomList(n);
		double t1 = System.currentTimeMillis();

		for (int i = 1; i < k ; i++) {
//			System.out.println(list.get(i));
		}

		double t2 = System.currentTimeMillis();

		Helper.getResults(n, "Complexité constante : O(1)", t1, t2);

	}

}
