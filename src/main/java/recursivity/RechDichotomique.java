package recursivity;

import java.util.Arrays;

public class RechDichotomique {

	public static int rechDichoRecursive(int k, int[] listTriee) {

		int l = listTriee.length;
		int m = l / 2;
		if (listTriee[m] == k) {
			return m;
		} else if (listTriee[m] > k) {
			listTriee = Arrays.copyOfRange(listTriee, 0, m);
			return rechDichoRecursive(k, listTriee);
		} else {
			listTriee = Arrays.copyOfRange(listTriee, m, l);
			return rechDichoRecursive(k, listTriee);
		}
	}
}
