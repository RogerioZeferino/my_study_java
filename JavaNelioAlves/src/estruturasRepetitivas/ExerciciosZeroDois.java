package estruturasRepetitivas;

import java.util.Scanner;

public class ExerciciosZeroDois {

	public static void main(String[] args) {
//	Escreva um programa para ler as coordenadas (X,Y)
//	de uma quantidade indeterminada de pontos no sistema
//	cartesiano. Para cada ponto escrever o quadrante
//	a que ele pertence. O algoritmo será encerrado quando
//	pelo menos uma de duas coordenadas for NULA
//	(nesta situação sem escrever mensagem alguma). 
		
		Scanner scan = new Scanner(System.in);
		
		int X = scan.nextInt();
		int Y = scan.nextInt();
		
		while(X != 0 && Y != 0) {
			if(X > 0 && Y > 0) {
				System.out.println("PRIMEIRO");
			}
			else if(X < 0 && Y > 0) {
				System.out.println("SEGUNDO");				
			}
			else if(X < 0 && Y < 0) {
				System.out.println("TERCEIRO");
			}
			else {
				System.out.println("QUARTO");
			}
			X = scan.nextInt();
			Y = scan.nextInt();
		}
		
		scan.close();
		
	}

}
