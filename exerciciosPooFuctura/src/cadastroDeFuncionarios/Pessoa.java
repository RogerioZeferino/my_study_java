package cadastroDeFuncionarios;

public class Pessoa {
	
//	Atributos
	public String nome;
	public int idade;
	
//	Construtor
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

//	 Métodos
	public void exibirDados() {
		System.out.println("Nome: "+ nome);
		System.out.println("Idade: "+ idade);
	}
//	Getters

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}
		
}
