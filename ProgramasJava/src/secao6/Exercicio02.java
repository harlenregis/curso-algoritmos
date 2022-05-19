package secao6;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		int numero, a, b;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número: ");
		numero = scanner.nextInt();

		if (numero >= 0) {
			a = numero;
			System.out.println("Valor positivo: " + numero);

		} else {
			b = numero;
			System.out.println("Valor negativo: " + numero);
		}

		scanner.close();
	}
}