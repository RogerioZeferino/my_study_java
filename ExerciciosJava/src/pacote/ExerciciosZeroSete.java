package pacote;

import java.util.Scanner;

public class ExerciciosZeroSete {

	public static void main(String[] args) {
//	Crie um programa que leia o peso de uma encomenda (em kg)
//	e escreva  o valor do frete (considerando que cada kg custa R$5,00).
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o peso da encomenda:");
		int encomendaPeso = scan.nextInt();
		
		double encomendaFrete = (double) encomendaPeso * 5.00;
		
		System.out.printf("O valor do frete é %.2f reais.", encomendaFrete);
		
		scan.close();
 		
		/*
		double fretePorKg = 5;

		System.out.println("Informe o peso da encomenda (em kg):");
		double pesoEncomenda = scan.nextDouble();
					
		double frete = pesoEncomenda * fretePorKg;

		System.out.println("O valor do frete é R$ " + frete);
		*/
	}

}
