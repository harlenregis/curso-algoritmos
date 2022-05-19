package secao6;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		int numero;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite um número: ");
		numero = teclado.nextInt();

		if ((numero % 2) == 0) {
			if (numero > 0) {
				System.out.printf("Número %d é par e positivo.\n", numero);
			} else {
				System.out.printf("Número %d é par e negativo.\n", numero);
			}

		} else {
			if (numero > 0) {
				System.out.printf("Número %d é impar e positivo.\n", numero);
			} else {
				System.out.printf("Número %d é impar e negativo.\n", numero);
			}
		}
		teclado.close();
	}
}