package pacote;

import java.util.Scanner;

public class exerciciosZeroDois {

	public static void main(String[] args) {
//	Crie um programa que leia o preço de dois produtos
//	e escreva o valor total da compra. Lembre-se que
//	valores são números fracionados, ou seja,
//	declare-os com o tipo double.	
		

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escreva o preço do primeiro produto: ");
		double produto1 = scan.nextDouble();
		
		System.out.println("Escreva do preço do segundo produto: ");
		double produto2 = scan.nextDouble();
		
		double totalProdutos = produto1 + produto2;
		
		System.out.printf("O total dos produtos foi %.2f reais", totalProdutos);
		
		scan.close();
	}

}
