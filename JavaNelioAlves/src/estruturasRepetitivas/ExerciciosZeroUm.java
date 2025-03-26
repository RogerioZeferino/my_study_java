package estruturasRepetitivas;

import java.util.Scanner;

public class ExerciciosZeroUm {

	public static void main(String[] args) {
//	Escreva um programa que repita a leitura de uma
//	senha até que ela seja válida.
//	Para cada leitura de senha incorreta informada,
//	escrever a mensagem "Senha Invalida".
//	Quando a senha for informada corretamente deve ser 
//	impressa a mensagem "Acesso Permitido" 
//	e o algoritmo encerrado. Considere que a senha
//	correta é o valor 2002. 
	
	Scanner scan = new Scanner(System.in);
	
	int senha = scan.nextInt();
	
	while(senha != 2002) {
		System.out.println("Senha Inválida");
		senha = scan.nextInt();
	}
	
	System.out.println("Acesso Permitido");
	
	
	
	scan.close();}

}
