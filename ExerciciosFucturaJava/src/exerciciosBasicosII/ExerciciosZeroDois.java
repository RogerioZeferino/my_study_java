package exerciciosBasicosII;

import java.util.Scanner;

public class ExerciciosZeroDois {

	public static void main(String[] args) {
//	Escreva um programa que leia dois números
//	inteiros do usuário e diga qual é o maior,
//	o menor ou se são iguais.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número:");
		int N1 = scan.nextInt();
		
		System.out.println("Digite o segundo número:");
		int N2 = scan.nextInt();
		
		if(N1 > N2) {
			System.out.printf(" %d é maior que %d%n ", N1, N2);
		}
		else if( N1 == N2) {
			System.out.printf("%d e %d são iguais", N1, N2);
		}
		else {
			System.out.printf("%d é menor do que %d%n", N1, N2);
		}
	
			scan.close();
	}

}
