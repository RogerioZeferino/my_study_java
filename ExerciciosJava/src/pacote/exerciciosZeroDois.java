package pacote;

import java.util.Scanner;

public class exerciciosZeroDois {

	public static void main(String[] args) {
		/*
		Crie um programa que leia o preço de dois produtos
		e escreva o valor total da compra.
		Lembre-se que valores são números fracionados,
		ou seja, declare-os com o tipo double.
		*/
		Scanner scan = new Scanner(System.in);
				
				
		System.out.println("Entre com o preco do primeiro produto: ");
		Double produto1 = scan.nextDouble();
		System.out.println("Entre com o preço do segundo produto: ");
		Double produto2 = scan.nextDouble();
		
		Double valorTotal = produto1 + produto2;
		
		System.out.println("O total dos produtos foi " + valorTotal);
		
		
	}

}
