package exerciciosCondicional;

import java.util.Scanner;

public class ExerciciosZeroDois {

	public static void main(String[] args) {
//	Crie um programa que recebe uma nota musical
//	(A, B, C, D, E ou F) e fornece informações sobre ela,
//	como a frequência.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma letra para cada nota musical(A =DÓ, B=RÉ ,C=MI ,D=FÁ , E=SOL, F=LÁ, G=SÍ): ");
		String nota = scan.nextLine().toUpperCase();
		
		double frequencia = 0;
		
	switch (nota) {
	case "A":
		frequencia = 264.0;
		break;
	case "B":
		frequencia = 297.0;
		break;
	case "C":
		frequencia = 330.0;
		break;
	case "D":
		frequencia = 352.0;
		break;
	case "E":
		frequencia = 396.0;
		break;
	case "F":
		frequencia = 440.0;
		break;
	case "G":
		frequencia = 495.0;
		break;
	}
	
	if(frequencia != 0) {
		System.out.println("A nota musical "+ nota +" tem frequência de "+ frequencia +" Hz.");
	}else {
		System.out.println("Invalido");
	}
	scan.close();
		
	}

}
