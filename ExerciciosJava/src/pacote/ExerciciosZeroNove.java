package pacote;

import java.util.Locale;
import java.util.Scanner;

public class ExerciciosZeroNove {

	public static void main(String[] args) {
//		Crie um programa que leia a altura
//		e largura de uma parede (em metros)
//		e escreva a área da parede e a quantidade
//		de tinta necessária para pintá-la
//		(considerando que cada litro de tinta pinta 2m²).
//
//		Fórmula para cálculo de área: 
//		area = altura * largura;
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a altura da parede em metros:");
		int altura = scan.nextInt();
		
		System.out.println("Digite o comprimento da parede em metros:");
		int comprimento = scan.nextInt();
		
		double area =(double) altura * comprimento;
		double tinta = (double) area / 2;
		
		
		System.out.printf("A área da parede é %.2f m². %n", area);
		System.out.printf("A quantidade de tinta necessária é de %.2f litros. %n", tinta);
		
		scan.close();
		
		
		
	}

}
