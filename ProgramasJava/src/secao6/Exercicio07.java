package secao6;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		int n1, n2, n3, n4, q1, q2, q3, q4;

		Scanner scanner = new Scanner(System.in);

		System.out.print("N1: ");
		n1 = scanner.nextInt();

		System.out.print("N2: ");
		n2 = scanner.nextInt();

		System.out.print("N3: ");
		n3 = scanner.nextInt();

		System.out.print("N4: ");
		n4 = scanner.nextInt();

		q1 = (n1 * n1);
		q2 = (n2 * n2);
		q3 = (n3 * n3);
		q4 = (n4 * n4);

//		System.out.print("\n"); Quebra de linha
		System.out.println("----------------------");

		if (q3 >= 100) {
			System.out.println("Quadrado do N3: " + q3);
		} else {
			System.out.println("N1: " + n1 + " , " + "Quadrado: " + q1);
			System.out.println("N2: " + n2 + " , " + "Quadrado: " + q2);
			System.out.println("N3: " + n3 + " , " + "Quadrado: " + q3);
			System.out.println("N4: " + n4 + " , " + "Quadrado: " + q4);
		}
	}
}
