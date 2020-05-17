package helper;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Helper {

	public static void getResults(int param, String complexite, double t1, double t2) {
		System.out.println("Paramètre n = " + param + " - Complexité de " + complexite);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println("Vitesse d'éxécution : " + (double) (t2 - t1) + "ms");
		System.out.println("---------------------------------------");
	}

	public static List<Integer> createRandomList(double n) {

		List<Integer> list = new ArrayList<Integer>();

		Random random = new Random();

		for (int i = 0; i < n; i++) {
			list.add(random.nextInt(1000));
		}

		return list;

	}

	public static List<Integer> createOrderedList(double n) {
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i < n; i++) {
			Integer number = i;
			list.add(number);
		}

		return list;

	}

	public static double logX_inBaseN(int x, int n) {
		return (Math.log(x) / Math.log(n));
	}
	
	// Méthode de Newton
	public static double getRacineCarre(int nombre) {

		double X0 = 1;
		double Xn = (X0 + nombre / X0) / 2;

		double Xn_Plus_1 = 0;
		for (int i = 0; i < 10; i++) {
			Xn_Plus_1 = (Xn + nombre / Xn) / 2;
			Xn = Xn_Plus_1;
		}
		System.out.println(Xn_Plus_1);
		return Xn_Plus_1;
	}

}
