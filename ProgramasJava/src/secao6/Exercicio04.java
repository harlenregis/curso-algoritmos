package secao6;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		float altura, peso_ideal;
		char sexo;

		System.out.print("Informe sua altura: ");
		altura = teclado.nextFloat();

		System.out.print("Informe o sexo [m] ou [f]: ");
		sexo = teclado.next().charAt(0);

		if (sexo == 'm') {
			peso_ideal = (float) (72.7 * altura) - 58;
			System.out.printf("Seu peso ideal é %.2f ", peso_ideal, " kg");
		}
		if (sexo == 'f') {
			peso_ideal = (float) (62.1 * altura) - (float) 44.7;
			System.out.printf("Seu peso ideal é %.2f ", peso_ideal, " kg");
		}
		if (sexo != 'm' && sexo != 'f') {
			System.out.println("Sexo não reconhecido.");
			peso_ideal = 0;
		}

		teclado.close();
	}
}