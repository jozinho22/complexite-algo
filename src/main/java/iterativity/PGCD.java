package iterativity;

public class PGCD {
	
	public static int pgcd(int m, int n) {
		
		while(m != n) {
			if(m > n) {
				m = m - n;
			} else {
				n = n - m;
			}
		}
				
		return m;
	}
}
