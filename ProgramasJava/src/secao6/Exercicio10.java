package secao6;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		int idade;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Idade: ");
		idade = scanner.nextInt();

		if (idade >= 5 && idade <= 7) {
			System.out.println("Infantil A");
		}

		else if (idade >= 8 && idade <= 11) {
			System.out.println("Infantil B");
		}

		else if (idade >= 12 && idade <= 13) {
			System.out.println("Juvenil A");
		}

		else if (idade >= 14 && idade <= 17) {
			System.out.println("Juvenil B");
		}

		else if (idade >= 18) {
			System.out.println("Adulto");
		}

		scanner.close();
	}
}
