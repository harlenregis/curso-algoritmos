
package secao6;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		int numero, p = 0, i = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número: ");
		numero = scanner.nextInt();

		if ((numero % 2) == 0) {
			p = numero;
			System.out.println("O número " + p + " é PAR!");

		} else {
			i = numero;
			System.out.println("O número " + i + " é ÍMPAR!");

		}
		scanner.close();
	}
}