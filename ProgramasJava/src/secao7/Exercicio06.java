package secao7;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		int numero;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe um número entre 1 e 10: ");
		numero = scanner.nextInt();
		System.out.println("------------------------------");

		while (numero < 1 || numero > 10) {

			System.out.print("Informe um número entre 1 e 10: ");
			numero = scanner.nextInt();
			System.out.println("------------------------------");
		}

		System.out.println("Tabuada de " + numero);
		System.out.println("--------------------");

		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d X %d = %d\n", numero, i, (numero * i));
		}

		scanner.close();
	}
}
