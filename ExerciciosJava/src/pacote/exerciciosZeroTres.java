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
		int tempoGasto = scan.nextInt();
		
		double velocidadeMedia = (double) distanciaKm / tempoGasto;
		
		System.out.printf("A velocidade média do percurso foi %.2f km/h", velocidadeMedia);
		
		scan.close();
	}

}
