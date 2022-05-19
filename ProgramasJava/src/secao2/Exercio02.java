package secao2;

import java.util.Scanner;

public class Exercio02 {

	public static void main(String[] args) {

		int num1, num2, soma, multiplicacao;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Primeiro número: ");
		num1 = teclado.nextInt();

		System.out.print("Segundo número: ");
		num2 = teclado.nextInt();

		soma = num1 + num2;

		multiplicacao = soma * num1;

		System.out.println("Multiplicação: " + soma + " x " + num1 + " = " + multiplicacao);

		teclado.close();
	}
}
