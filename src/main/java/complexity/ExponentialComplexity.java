package complexity;

import java.util.List;

import domain.Number;
import helper.Helper;

public class ExponentialComplexity {

	public static void algorythm(int n) {

		List<Number> list = Number.createRandomList(n);
		double t1 = System.currentTimeMillis();

		for (int i = 0; i < list.size(); i++) {

			for (int j = 0; j < list.size(); j++) {

				for(int k = 1; k<1000 ;k++){
//				System.out.println(" Paire i : " + list.get(i) + " - Paire j : " + list.get(j));
				}
			}
			i = 2 * i;
		}

		double t2 = System.currentTimeMillis();

		Helper.getResults(n, "Complexité exponentielle : O(2^n)", t1, t2);

	}

}
