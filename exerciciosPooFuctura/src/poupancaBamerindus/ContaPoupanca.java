package poupancaBamerindus;

public class ContaPoupanca extends ContaBancaria{
	
	public double taxaJuros;
	
//	Construtor
	public ContaPoupanca(String titular, double saldoInicial, double taxaJuros) {
		super(titular, saldoInicial);
		this.taxaJuros = taxaJuros;
	}

	public void calcularJuros() {
		double juros = getSaldo()* taxaJuros / 100;
		setSaldo(getSaldo() + juros);
		System.out.println("Juros de R$ "+ juros +" aplicados. Novo saldo: R$ "+ getSaldo());
	}
	
}	