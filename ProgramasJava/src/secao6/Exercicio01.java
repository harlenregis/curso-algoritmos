package secao6;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		int n;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número: ");
		n = scanner.nextInt();

		if (n > 100) {
			System.out.println(n);

		} else {
			n = 0;
			System.out.println(n);
		}

		scanner.close();
	}
}