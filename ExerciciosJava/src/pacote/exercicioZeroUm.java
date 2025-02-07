package pacote;

import java.util.Scanner;

public class exercicioZeroUm {

	public static void main(String[] args) {
//	Crie um programa que leia o nome do usuário e escreva uma saudação personalizada: 
//			"Olá, [nome do usuário]! Bem-vindo ao nosso programa!".
		

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nomeUsuario = scan.nextLine();
		
		System.out.println("Olá, "+ nomeUsuario +"! Bom vindo ao nosso programa!");
		
		scan.close();

	}

}
