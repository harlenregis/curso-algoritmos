package secao6;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		int c;
		float n, e = 0, salario, valor_hora = (float) 10.00;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Informe o código: ");
		c = teclado.nextInt();

		System.out.print("Informe as horas trabalhadas: ");
		n = teclado.nextFloat();

		if (n > 50) {
			e = (float) (n - 50) * (float) 20.00;
			salario = (50 * valor_hora) + e;
			System.out.printf("Salário total: R$ %.2f\n", salario);
			System.out.printf("Salário total: R$ %.2f\n", e);

		} else {
			salario = n * valor_hora;
			System.out.printf("Salário total R$ %.2f\n", salario);
			System.out.printf("Salário total R$ %.2f\n", e);
		}

		teclado.close();
	}
}