package exerciciosIntroducao1;

public class Funcionario {
//	Atributos
	public String nome;
	public String cargo;
	public double salario;
	
	public Funcionario(String nome, String cargo, double salario) {
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}
//Métodos para definir e obter os valores dos atributos
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

//	Método para aumentar o salário em uma certa porcentagem
	public void aumetarSalario(double porcentagem) {
		salario += salario * (porcentagem / 100);
	}
	
	
}
