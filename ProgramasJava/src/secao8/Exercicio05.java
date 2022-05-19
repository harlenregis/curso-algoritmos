package secao8;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		int[] vetor = new int[10];
		boolean tem_maior_50 = false;
		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.printf("Vetor %d/10: ", (i + 1));
			vetor[i] = teclado.nextInt();
		}

		for (int i = 0; i < 10; i++) {
			if (vetor[i] > 50) {
				System.out.printf("%d esta na posição %d\n", vetor[i], i);
				tem_maior_50 = true;
			}
		}

		if (!tem_maior_50) {
			System.out.println("Não existe número maior que 50!");
		}

		teclado.close();
	}

}
