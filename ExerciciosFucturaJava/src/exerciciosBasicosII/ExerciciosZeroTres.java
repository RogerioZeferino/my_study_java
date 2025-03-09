package exerciciosBasicosII;

import java.util.Locale;
import java.util.Scanner;

public class ExerciciosZeroTres {

	public static void main(String[] args) {
//	Faça um programa que leia três notas de um aluno
//	e calcule a média. 
//
//	Se a média for maior ou igual a 7,
//	o aluno está aprovado. 
//	Se a média for menor que 4, o aluno está reprovado.
//	Se a média estiver entre 4 e 7, o aluno precisa
//	fazer uma prova final.
//
//	O programa deve escrever a situação do aluno,
//	juntamente com sua média.
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		
		int nota1, nota2, nota3;
		
		System.out.println("Digite as 3 notas do aluno:");
		nota1 = scan.nextInt();
		nota2 = scan.nextInt();
		nota3 = scan.nextInt();
		
		double media = (nota1 + nota2 + nota3) / 3;

		
		if(media >= 7) {
			System.out.printf("APROVADO, MEDIA %.2f%n", media);
		}
		else if(media <= 3) {
			System.out.printf("REPROVADO, MEDIA %.2f%n", media);
		}
		else {
			System.out.printf("RECUPERAÇÃO, MEDIA %.2f%n", media);
		}
		
		scan.close();
		
	}

}
