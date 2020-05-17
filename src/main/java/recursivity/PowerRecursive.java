package recursivity;

public class PowerRecursive {

	public static int power(int value, int pow) {
		if (pow == 0)
			return 1;
		return value * power(value, pow - 1);
	}

}
