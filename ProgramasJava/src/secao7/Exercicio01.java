package secao7;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int valor, maior = 0;

		System.out.print("Digite um número: ");
		valor = scanner.nextInt();

		while (valor != 0) {
			if (valor > maior) {
				maior = valor;
			}
			System.out.print("Digite um número: ");
			valor = scanner.nextInt();
		}
		System.out.printf("O maior número é %d", maior);

		scanner.close();
	}
}