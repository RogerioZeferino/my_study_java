package estruturaCondicional;

import java.util.Scanner;

public class ExerciciosZeroUm {

	public static void main(String[] args) {
//	Fazer um programa para ler um número inteiro,
//	e depois dizer se este número é negativo ou não. 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int numero = scan.nextInt();
		
		if(numero < 0) {
			System.out.println(" NEGATIVO");
		}
		else {
			System.out.println("NÃO NEGATIVO");
		}
		
		scan.close();
		
		
	}

}
