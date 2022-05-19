package secao6;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		float peso, multa;
		String e = "excesso";

		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite o peso dos peixes: ");
		peso = teclado.nextFloat();

		if (peso > 50) {
			multa = (float) (peso - 50) * (float) 4.00;
			System.out.printf("Você deverá pagar R$ %.2f em multas", multa);
		} else {
			multa = 0;
			e = "0";
			System.out.println("Excesso: " + e);
			System.out.println("Multa: " + multa);			
		}

		teclado.close();
	}
}