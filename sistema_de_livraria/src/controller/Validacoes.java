package controller;

import java.util.Scanner;

public class Validacoes {
	private static Scanner scan = new Scanner(System.in);
	
	public static String validarCpf() {
		String cpf = scan.nextLine();
		While(!cpf.matches("\\d{11}")){
			System.out.println("CPF inválido, tente novamente; ");
			cpf = scan.nextLine();
		}
		return cpf;
	}

}
