package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
//		Fazer um programa para ler os valores da largura e altura 
//		de um retângulo. Em seguida, mostrar na tela o valor de 
//		sua área, perímetro e diagonal. Usar uma classe como 
//		mostrado no projeto ao lado.
		
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Rectangle rect = new Rectangle();
		
		System.out.println("Enter rectangle width: ");
		rect.width = scan.nextDouble();
		System.out.println("Enter rectangle height: ");
		rect.height = scan.nextDouble();
		
		System.out.printf("AREA = %.2f%n", rect.area());
		System.out.printf("PERIMETER = %.2f%n", rect.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());
				
		scan.close();
	}

}
