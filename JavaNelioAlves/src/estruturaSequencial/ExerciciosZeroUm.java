package estruturaSequencial;

import java.util.Scanner;

public class ExerciciosZeroUm {

	public static void main(String[] args) {
//		Faça um programa para ler dois valores inteiros,
//		e depois mostrar na tela a soma desses números com uma 
//		mensagem explicativa, conforme exemplos. 
		
		Scanner scan = new Scanner(System.in);
		
		int valor1, valor2, somaValores;
		
		System.out.println("Digite o primeiro valor:");
		valor1 = scan.nextInt();
		
		System.out.println("Digite o segundo valor:");
		valor2 = scan.nextInt();
		
		somaValores = valor1 + valor2;
		
		System.out.println("SOMA = " + somaValores);
		
		scan.close();
		
		
		
	}

}
