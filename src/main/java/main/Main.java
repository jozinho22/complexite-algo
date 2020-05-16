package main;

import complexity.ConstantComplexity;
import complexity.ExponentialComplexity;
import complexity.LinearComplexity;
import complexity.LogarithmicComplexity;
import complexity.PolynomialeComplexity;
import complexity.recursivity.Factorielle;
import complexity.recursivity.Fibonacci;
import domain.Number;

public class Main {

	public static void main(String[] args) {

//		// Parcourir les 3 premiers éléments de la liste aléatoire de 10 nombres
//		ConstantComplexity.algorythm(10000, 150);
//
//		// Parcourir tous les éléments de la liste
//		LinearComplexity.algorythm(10000);
//
//		// Cherche un nombre place 150 dans la liste ordonnée de 10 000 nombres
//		LogarithmicComplexity.algorythm(10000, 150);
//
		// Parcourir tous les éléments de deux boucles imbriquées
		PolynomialeComplexity.algorythm(100);
		PolynomialeComplexity.algorythm(1000);
		PolynomialeComplexity.algorythm(10000);
		PolynomialeComplexity.algorythm(100000);
		PolynomialeComplexity.algorythm(1000000);

//
//		ExponentialComplexity.algorythm(10000);
//
//		System.out.println(Fibonacci.fibonacci(9));
//		;
//		Factorielle.factorielle(5);
	}

}
