package exerciciosBasicosII;

import java.util.Scanner;

public class ExerciciosZeroQuatro {

	public static void main(String[] args) {
//	 Escreva um programa que leia a idade de uma pessoa
//	e diga se ela pode votar ou não nas eleições. 
//
//	 No Brasil, o voto é obrigatório para pessoas entre
//	18 e 70 anos, e facultativo para pessoas entre 16 e 18
//	anos ou maiores de 70 anos.
	
	Scanner scan = new Scanner(System.in);
		
	System.out.println("Digite a idade: ");
	int idade = scan.nextInt();
	
	if(idade >= 16) {
		System.out.println("Pode votar nesta eleição!");
	}else {
		System.out.println("Não pode votar nessa eleição!");
		
		scan.close();
	}
	}

}
