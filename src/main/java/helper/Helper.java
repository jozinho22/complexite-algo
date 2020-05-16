package helper;

public class Helper {

	public static void getResults(int param, String complexite, double t1, double t2) {
		System.out.println("Paramètre n = " + param +" - Complexité de " + complexite);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println("Vitesse d'éxécution : " + (double)(t2-t1) + "ms");
		System.out.println("---------------------------------------");
	}
}
