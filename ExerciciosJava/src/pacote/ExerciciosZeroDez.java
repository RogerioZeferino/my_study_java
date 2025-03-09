package pacote;

import java.util.Locale;

import java.util.Scanner;

public class ExerciciosZeroDez {

	public static void main(String[] args) {
//	Crie um programa que leia o preço à vista
//	de um produto e o número de parcelas e escreva
//	o valor de cada parcela (considerando
//	juros simples de 2% ao mês).
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor do produto:");
		double produto = scan.nextDouble();
		
		System.out.println("Digite o número de parcelas:");
		int parcelas = scan.nextInt();
		
		double taxaJuros = 2;
		
		double valorTotal = produto + (produto *(taxaJuros/100) * parcelas);
		double valorParcela = valorTotal / parcelas;
		
		System.out.printf("O valor da parcela é %.2f ", valorParcela);
		
		scan.close();
		
	}

}
