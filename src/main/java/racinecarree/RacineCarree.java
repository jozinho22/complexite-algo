package racinecarree;

public class RacineCarree {

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
