package exerciciosBasicosII;

import java.util.Scanner;

public class ExerciciosZeroUm {

	public static void main(String[] args) {
//	Escreva um programa que leia um número inteiro
//	do usuário e diga se ele é par ou ímpar.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int numero = scan.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}
		scan.close();
		
		
	}

}
