package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExerciciosZeroQuatro {

	public static void main(String[] args) {

//	Fazer um programa que leia o número de um
//	funcionário, seu número de horas trabalhadas,
//	o valor que recebe por 	hora e calcula o salário
//	desse funcionário. 
//	A seguir, mostre o número e o salário do
//	funcionário, com duas casas decimais.
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int nFuncionario, hTrabalhada;
		
		double valorHora, salario;
		
		System.out.println("Digite o número do funcionário:");
		nFuncionario = scan.nextInt();

		System.out.println("Digite as horas trabalhadas:");
		hTrabalhada = scan.nextInt();
		
		System.out.println("Digite o valor da hora trabalhada:");
		valorHora = scan.nextDouble();
		
		salario = hTrabalhada * valorHora;
		
		System.out.printf(" NUMBER = %d%n SALARY = U$ %.2f%n", nFuncionario, salario);
		
		scan.close();
		

		
		
		

	}

}
