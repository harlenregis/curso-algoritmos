package secao6;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

		float poluicao;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Índice de poluição: ");
		poluicao = scanner.nextFloat();

		if (poluicao >= 0.3 && poluicao < 0.4) {
			System.out.println("Grupo 1 suspender atividades");
		}

		else if (poluicao >= 0.4 && poluicao < 0.5) {
			System.out.println("Grupos 1 e 2 suspender atividades");
		}

		else if (poluicao >= 0.5) {
			System.out.println("Todos os grupos suspender atividades");

		} else {
			System.out.println("Níveis aceitáveis");
		}
		scanner.close();
	}

}
