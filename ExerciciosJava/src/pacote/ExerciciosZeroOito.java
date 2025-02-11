package pacote;

import java.util.Scanner;

public class ExerciciosZeroOito {

	public static void main(String[] args) {
//	Crie um programa que leia a cotação do dólar
//	e um valor em reais e escreva o valor convertido em dólares.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a cotação do dolar:");
		double cotacaoDolar = scan.nextDouble();
		
		System.out.println("Digite o valor em reais:");
		double valorReais  = scan.nextDouble();
		
		double valorConvertido = valorReais / cotacaoDolar;
		
		System.out.printf("O valor do dolar convertido em reais é %.2f ", valorConvertido);
		
		scan.close();
		/*
		System.out.println("Informe a cotação do dólar:");
		double cotacaoDolar = scan.nextDouble();

		System.out.println("Informe o valor a ser convertido: ");
		double valorEmReais = scan.nextDouble();

		double valorConvertido = valorEmReais / cotacaoDolar;

		System.out.printf("O valor de R$ %.2f equivale a US$ %.2f ", valorEmReais, valorConvertido);
		
		scan.close();
		
		*/
		
		
	}

}
