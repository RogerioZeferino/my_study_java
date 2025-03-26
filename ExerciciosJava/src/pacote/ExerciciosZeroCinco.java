package pacote;

import java.util.Scanner;

public class ExerciciosZeroCinco {

	public static void main(String[] args) {
//	Crie um programa que leia o valor de um empréstimo,
//	a taxa de juros mensal e o número de meses
//	e escreva o valor da parcela mensal do empréstimo.
		

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor do empréstimo:");
		double valorEmprestimo = scan.nextDouble();
		
		System.out.println("Digite o valor da taxa de juros mensal:");
		double taxaJurosMensal = scan.nextDouble();
		
		System.out.println("Digite o números de meses do empréstimo:");
		int mesesEmprestimo = scan.nextInt();
		
		double valorTotal = valorEmprestimo * (taxaJurosMensal / 100) * mesesEmprestimo;
		
		double parcelaMensal = valorTotal / mesesEmprestimo;
		
		System.out.printf("O valor da sua parcela mensal é " + parcelaMensal);
		
		scan.close();
		

	}

}
