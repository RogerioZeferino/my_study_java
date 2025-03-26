package pacote;

import java.util.Scanner;

public class ExerciciosZeroSeis {

	public static void main(String[] args) {
//	Crie um programa que leia a quantidade
//	de litros de água consumidos por uma residência
//	em um mês e escreva o valor da conta de água
//	(considerando que cada litro de água custa R$0,02).
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de litros consumidos:");
		int aguaLitros = scan.nextInt();
		
		double precoLitro = (double) aguaLitros * 0.02;
		
		System.out.printf("O valor da sua conta é de %.2f reais", precoLitro);
		
		scan.close();
		/*
		
		int qtdLitros;

		double contaAgua, valorLitro = 0.02;

		System.out.println("Informe a quantidade de litros consumidos:");
		qtdLitros = scan.nextInt();

		contaAgua = (valorLitro * qtdLitros);

		System.out.println("O valor da conta de água é: R$ " + contaAgua);
		 */
		
		

		

	}

}
