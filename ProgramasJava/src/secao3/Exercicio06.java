package secao3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		float salario_hora, salario_mes;
		int horas_trabalhadas;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Salário por hora: ");
		salario_hora = teclado.nextFloat();

		System.out.print("Horas trabalhadas no mês: ");
		horas_trabalhadas = teclado.nextInt();

		salario_mes = (salario_hora * horas_trabalhadas);

		System.out.println("Salário mensal = " + salario_mes);

		teclado.close();
	}
}
