package cadastroDeFuncionarios;

public class Funcionario extends Pessoa{
	
//	Atributo
	private double salario;

//	Construtor
	public Funcionario(String nome, int idade, double salario) {
		super(nome, idade);
		this.salario = salario;
	}

//	Método
	@Override
	public void exibirDados() {
		super.exibirDados();
		System.out.println("Salário: R$ "+ salario);
	}
	
}

	