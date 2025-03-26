package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
//		Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em 
//		seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o 
//		salário do funcionário com base em uma porcentagem dada (somente o salário bruto é 
//		afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe 
//		projetada abaixo.
		
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Funcionario emp = new Funcionario();
		
		System.out.print("Name: ");
		emp.name = scan.nextLine();
		System.out.print("Gross Salary:");
		emp.grossSalary = scan.nextDouble();
		System.out.print("Tax: ");
		emp.tax = scan.nextDouble();
		System.out.println();
		
		System.out.printf("Employee: %s, $ %.2f%n", emp.name, emp.netSalary());
		System.out.println();
		
		System.out.print("Whitch percentage to increase salary?");
		double percentage = scan.nextDouble();
		emp.increaseSalary(percentage);
		System.out.println();
		
		System.out.println("Updated data: "+ emp);
		
		
		
		scan.close();
	}

}
