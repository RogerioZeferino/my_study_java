package pacote;

import java.util.Scanner;

public class ExerciciosZeroQuatro {

	public static void main(String[] args) {
//	Crie um programa que leia o número de horas trabalhadas
//	por um funcionário e o valor da hora de trabalho e escreva
//	o salário bruto desse funcionário.
		

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite aqui  o número de horas que você trabalhou: ");
		int horasTrabalhadas = scan.nextInt();
		
		System.out.println("Digite o valor da sua hora/trabalho: ");
		double horaTrabalho = scan.nextDouble();
		
		double salarioBruto =  horasTrabalhadas * horaTrabalho;
		
		System.out.printf("O seu salário é de %.2f reais.", salarioBruto);
		
		scan.close();
	}

}
