package pacote;

import java.util.Scanner;

public class exerciciosZeroTres {

	public static void main(String[] args) {
//	Crie um programa que leia a distância percorrida
//	por um carro (em km) e o tempo gasto (em horas)
//	e escreva a velocidade média do carro. 

//	A fórmula de velocidade média é: 
//	vm = distancia(em metros) / tempo(em segundos)


		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a distância percorrida pelo seu carro: ");
		int distanciaKm = scan.nextInt();
		
		System.out.println("Digite o tempo gasto: ");
		int tempoGastoHoras = scan.nextInt();

		
		int distanciaMetros = distanciaKm * 1000;		
		int tempoGastoSegundos = tempoGastoHoras * 3600;		
				
		double velocidadeMedia1 = (double) distanciaMetros / tempoGastoSegundos;

//		Para transformar de m/s para km/h basta multiplicar por 3.6;
//		Para transformar de km/h para m/s divide-se por 3.6.		
		
		double velocidadeMedia2 = velocidadeMedia1 * 3.6;
		
		System.out.println("Ou seja, a velocidade média do percurso em km/h é " + velocidadeMedia2);
		System.out.printf("A velocidade média é de %2f m/s.", velocidadeMedia1);
		
		scan.close();
	}

}
