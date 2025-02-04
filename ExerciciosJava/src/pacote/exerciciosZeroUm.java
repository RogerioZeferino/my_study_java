package pacote;

import java.util.Scanner;

public class exerciciosZeroUm {

	public static void main(String[] args) {
		/*
		Crie um programa que leia o nome do usuário
		e escreva uma saudação personalizada: 
        "Olá, [nome do usuário]! Bem-vindo ao nosso programa!".
      */
		
		Scanner scan = new Scanner(System.in);
					
		System.out.println("Digite seu nome: ");
		String nome = scan.nextLine();
		
		System.out.println("Olá, " + nome  + "! Bem vindo ao nosso programa!");
		
			
			
	}

}
