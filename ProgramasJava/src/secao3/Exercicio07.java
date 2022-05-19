package secao3;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		float altura, peso_ideal;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Informe sua altura: ");
		altura = teclado.nextFloat();

		peso_ideal = (float) (72.7 * altura) - 58;

		System.out.printf("Seu peso ideal é %.2f: ", peso_ideal);

		teclado.close();
	}
}
