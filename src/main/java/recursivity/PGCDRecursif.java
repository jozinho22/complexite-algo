package recursivity;

public class PGCDRecursif {

	public static int pgcd(int m, int n) {

		if(m == n) {
			return m;
		} else {
			if (m > n) {
				return pgcd(m - n, n);
			} else {
				return pgcd(m, n - m);
			}
		}

	}
}
