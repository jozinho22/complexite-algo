package recursivity;

public class Factorielle {

	public static int factorielle(int nombre) {
		
		int x = 0;
		if (nombre == 1) {
			x = 1;
			return x;
		} else {
			// on appelle encore la fonction qui s'appellera encore elle meme si nombre est != de 1
			x = nombre * factorielle(nombre - 1); 
			System.out.println(x);
			return x;
		}
	}

}
