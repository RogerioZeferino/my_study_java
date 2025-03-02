package exerciciosBasicosII;

import java.util.Scanner;

public class ExerciciosZeroSeis {

	public static void main(String[] args) {
//	Escreva um programa que leia uma letra do alfabeto
//	e diga se ela é uma vogal ou uma consoante.
//	Lembre-se que, na comparação de Strings, usa-se o 
//	método .equals() ou o .equalsIgnoreCase().
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite uma letra do alfabeto: ");
		String letra = scan.nextLine();
		
		if(letra.equalsIgnoreCase("a")
				||letra.equalsIgnoreCase("e")
				||letra.equalsIgnoreCase("i")
			 	||letra.equalsIgnoreCase("i")
			 	||letra.equalsIgnoreCase("o")
			 	||letra.equalsIgnoreCase("u")) {
			System.out.println("A letra "+ letra +" é uma vogal");
		}else {
			System.out.println("A letra "+ letra +" é uma consolante.");
		}
		scan.close();
		
		
	}

}
