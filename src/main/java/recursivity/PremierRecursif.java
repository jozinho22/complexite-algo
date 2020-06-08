package recursivity;

public class PremierRecursif {

	public static boolean isPremier(int k, int p) {

		if (p == 1) {
			return true;
		} else {
			if (k % p == 0) {
				return false;
			} else {
				return isPremier(k, p - 1);
			}
		}
	}

}
