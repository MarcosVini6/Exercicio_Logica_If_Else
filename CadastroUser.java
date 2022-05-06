package lutas.gloriacondicionaisifelse;

import java.util.Scanner;

public class CadastroUser {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o novo usuario:");
		String user = leia.next();
		if (user.equalsIgnoreCase("admin") || user.equalsIgnoreCase("administrador")) {
			System.out.println("Usuario invalido");

		} else {
			System.out.println("Usuario " + user + " cadastrado com sucesso");
		}
	}
}
