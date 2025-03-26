package estruturaSequencial;

import java.util.Scanner;

public class ExerciciosZeroTres {

	public static void main(String[] args) {
//	Fazer um programa para ler quatro valores inteiros
//	A, B, C e D. A seguir, calcule e mostre a diferença
//	    			do produto 
//	de A e B pelo produto de C e D segundo a fórmula:
//		DIFERENCA = (A * B - C * D). 
		
		Scanner scan = new Scanner(System.in);
		
		int A, B, C, D, diferenca;
		
		System.out.println("Entre ccom o valor de A:");
		A = scan.nextInt();
		
		System.out.println("Entre com o valor de B:");
		B = scan.nextInt();
		
		System.out.println("Entre com o valor de C:");
		C = scan.nextInt();
		
		System.out.println("Entre com o valor de D:");
		D = scan.nextInt();
		
		diferenca = (A * B) - (C * D);
		
		System.out.println("O valor da diferença é de " + diferenca);
		
		scan.close();
		
	}

}
