package iterativity;

public class PowerIterative {
	public static int power(int value, int pow) {
		int accumulator = 1;

		for (int i = 0; i < pow; i++) {
			accumulator *= value;
		}

		return accumulator;
	}
}
