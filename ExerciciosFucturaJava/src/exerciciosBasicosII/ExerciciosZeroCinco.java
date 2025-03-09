package exerciciosBasicosII;

import java.util.Scanner;

public class ExerciciosZeroCinco {

	public static void main(String[] args) {
//	Escreva um programa que leia o mês do ano em número
//	(1 a 12) e diga quantos dias ele tem. Considere que o
//	ano não é bissexto.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o mês(1 a 12): ");
		int mes = scan.nextInt();
		
		if(mes == 1|| mes == 3
				||mes == 5||mes == 7
				||mes == 8||mes == 10
				||mes == 12) {
			System.out.println("Este mês tem 31 dias");
		}else if( mes == 2) {
			System.out.println("Este mês tem 28 dias");
		}else {
			System.out.println("Este mês tem 30 dias");
		}
		scan.close();
	}

}
