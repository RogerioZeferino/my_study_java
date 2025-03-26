package exerciciosCondicional;

import java.util.Scanner;

public class ExerciciosZeroUm {

	public static void main(String[] args) {
//	Implemente um sistema de semáforo usando switch case.
//	Receba um estado (vermelho, amarelo ou verde) e determine
//	a ação apropriada.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o estado do semáforo:( vermelho, amarelo ou verde)");
		String estado = scan.nextLine().toLowerCase();
		
		switch(estado) {
		case "vermelho":
			System.out.println("Pare! O sinal está vermelho!");
			break;
		case "amarelo":
			System.out.println("Atenção! O sinal está amarelo, reduza a velocidade.");
			break;
		case "verde":
			System.out.println("Siga! Sinal verde!");
			break;
		default:
			System.out.println("Inválido");
		}
		scan.close();
	}

}
