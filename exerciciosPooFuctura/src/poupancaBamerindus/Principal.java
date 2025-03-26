package poupancaBamerindus;

public class Principal {

	public static void main(String[] args) {
		
//		Crie uma classe ContaBancaria com atributos titular
//		e saldo e métodos para depositar e sacar. 
//
//		Depois, crie a classe ContaPoupanca que herda
//		de ContaBancaria, adicionando um método para calcular juros.
//
//		Crie uma conta e simule um depósito e um cálculo de juros.
		
		ContaBancaria contaRogerio = new ContaBancaria("Rogerio", 100000.00);
		
		
		System.out.println("Nome do titular: "+ contaRogerio.getTitular());
		System.out.printf("Saldo atual: R$ %.2f ", contaRogerio.getSaldo());
	}

}
