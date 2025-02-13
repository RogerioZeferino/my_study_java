package estruturaCondicional;

import java.util.Scanner;

public class ExerciciosZeroTres {

	public static void main(String[] args) {
//	Leia 2 valores inteiros (A e B).
//	Após, o programa deve mostrar uma mensagem
//	"Sao Multiplos" ou "Nao sao Multiplos",
//	indicando se os valores lidos são múltiplos entre si.
//	Atenção: os números devem poder ser digitados em 
//	ordem crescente ou decrescente. 
		
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		if(A % B == 0 || B % A == 0) {
			System.out.println("SÃO MULTIPLOS");
		}
		else {
			System.out.println("NÃO SÃO MULTIPLOS");
		}
		scan.close();
	}

}
