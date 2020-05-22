package recursivity;

public class Random {

	// Obtenir un nombre aleatoire sans répétition
	public static int getRandomNumber(int bound, List<Integer> integers) {
			
			Random random = new Random();

			// +1 pour éviter le 0
			int r = random.nextInt(bound) + 1;
			if(integers.size() == 0) {
				return r;
			} else {
				for(Integer i : integers) {
					if(i == r) {
						return getRandomNumber(bound, integers);
					}
				}
			}
			return r;
			
	}

}
