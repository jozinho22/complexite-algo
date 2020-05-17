package main;

import racinecarree.RacineCarree;
import recursivity.Power;

public class Main {

	public static void main(String[] args) {

		/*
		 * Parcourir les 3 premiers �l�ments de la liste al�atoire de 10 nombres
		 */
//		ConstantComplexity.algorythm(10000, 150);

		/*
		 * Parcourir tous les �l�ments de la liste
		 */
//		LinearComplexity.algorythm(10000);

		/*
		 * Cherche un nombre place 150 dans la liste ordonn�e de 10 000 nombres
		 */
//		LogarithmicComplexity.algorythm(10000, 150);

		/*
		 * Parcourir tous les �l�ments de deux boucles imbriqu�es
		 */
//		PolynomialeComplexity.algorythm(100);
//		PolynomialeComplexity.algorythm(1000);
//		PolynomialeComplexity.algorythm(10000);
//		PolynomialeComplexity.algorythm(100000);
//		PolynomialeComplexity.algorythm(1000000);
//
//		Fibonacci.fibonacci(9);
//		
//		Factorielle.factorielle(5);
		
		RacineCarree.getRacineCarre(25);
		
		System.out.println(Power.power(2, 0)); // Affiche 1
		System.out.println(Power.power(2, 1)); // Affiche 2
		System.out.println(Power.power(2, 2)); // Affiche 4
		System.out.println(Power.power(2, 3)); // Affiche 8
		System.out.println(Power.power(2, 16)); // Affiche 65536

	}

}
