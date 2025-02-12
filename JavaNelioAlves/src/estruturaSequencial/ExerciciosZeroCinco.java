package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExerciciosZeroCinco {

	public static void main(String[] args) {

//Fazer um programa para ler o código de uma peça 1,
//o número de peças 1, o valor unitário de cada peça 1,
//o código de uma peça 2, o número de peças 2 e
//o valor unitário de cada peça 2. 
//Calcule e mostre o valor a ser pago. 
		
		Locale.setDefault(Locale.US);		
		Scanner scan = new Scanner(System.in);
		
		int codPeca1, codPeca2, qtd1, qtd2;
		
		double preco1, preco2, total;
		
		System.out.println("Entre com o código da primeira peça:");
		codPeca1 = scan.nextInt();
		
		System.out.println("Entre com a quantidade de peças:");
		qtd1 = scan.nextInt();
		
		System.out.println("Digite o preço unitário da peça:");
		preco1 = scan.nextDouble();
		
		System.out.println("Entre com o código da segunda peça:");
		codPeca2 = scan.nextInt();
		
		System.out.println("Entre com a quantidade de peças:");
		qtd2 = scan.nextInt();
		
		System.out.println("Digite o preço unitário da peça:");
		preco2 = scan.nextDouble();
		
		total = (preco1 * qtd1) + (preco2 * qtd2);
		
		System.out.printf("VALOR A PAGAR = %.2f%n", total);
		
		scan.close();

		
		

	}

}
