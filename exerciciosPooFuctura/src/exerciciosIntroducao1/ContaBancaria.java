package exerciciosIntroducao1;

public class ContaBancaria {
	
//	Atributos 
	private int numero;
	private double saldo;
	private String titular;
	
//	Construtor
	public ContaBancaria(int numero, double saldo, String titular) {
		this.numero = numero;
		this.saldo = saldo;
		this.titular = titular;
	}

//	Setters 
	
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	

}
