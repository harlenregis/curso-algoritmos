package secao7;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		int valor, maior = -999, menor = 999, soma = 0;
		float media;

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i <= 2; i++) {

			System.out.print("Digite um número: ");
			valor = scanner.nextInt();

			if (valor > 0) {
				if (valor > maior) {
					maior = valor;
				}
				if (valor < menor) {
					menor = valor;
				}

				soma = soma + valor;
			} else {
				i--;
			}
		}
		media = soma / 3;

		System.out.println("Maior número: " + maior);
		System.out.println("Menor número: " + menor);
		System.out.println("Média: " + media);

		scanner.close();
	}
}
