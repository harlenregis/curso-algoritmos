package secao7;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		String usuario, senha;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Usuário: ");
		usuario = scanner.next();

		System.out.print("Senha: ");
		senha = scanner.next();

		System.out.println("-------------------------------------------");

		while (senha.equals(usuario)) {

			System.out.println("ERRO! Usuário e Senha devem ser diferentes!");
			System.out.println("-------------------------------------------");

			System.out.print("Usuário: ");
			usuario = scanner.next();

			System.out.print("Senha: ");
			senha = scanner.next();

			System.out.println("-------------------------------------------");

		}

		System.out.println("Login efetuado com sucesso!");

		scanner.close();
	}
}
