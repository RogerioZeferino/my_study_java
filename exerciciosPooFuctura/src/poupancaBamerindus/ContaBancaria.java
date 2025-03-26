package poupancaBamerindus;

public class ContaBancaria {
	
//	Atributos
	public String titular;
	public double saldo;
	public double cobrarTaxa;
	
//	Construtor
	public ContaBancaria(String titular, double saldoInicial) {
		this.titular = titular;
		this.saldo = saldoInicial;		
	}
//	Métodos
	public void cobrarTaxa(double valor) {
		this.cobrarTaxa = 2.5;
	}
	
	public void sacarConta(double valor) {
		if(valor > this.getSaldo() - 2.5) {
			System.out.println("Saldo insuficiente!");
		}else {
			this.setSaldo(this.getSaldo() - valor);
			this.cobrarTaxa(2.5);
		}
	}
	public void depositarConta(double valor) {
		this.saldo += valor;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getTitular() {
		return titular;
	}
	
	
	public void mostrarSaldo() {
		System.out.println("Titulr: "+ titular);
		System.out.println("Saldo: "+ saldo);
	}
}
