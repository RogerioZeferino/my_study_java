package estruturaCondicional;

import java.util.Scanner;

public class ExerciciosZeroDois {

	public static void main(String[] args) {

//Fazer um programa para ler um número inteiro
// e dizer se este número é par ou ímpar. 
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		if(N % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}
		
		scan.close();
		
		
	}

}
