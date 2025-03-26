package exerciciosIntroducao1;

public class Pessoa {
	
//	Atributos
	private String nome;
	private int idade;
	private char genero;
	
//	Construtor
	public Pessoa(String nome, int idade, char genero) {
		this.nome = nome;
		this.idade = idade;
		this.genero = genero;
	}

//	Getters
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public char getGenero() {
		return genero;
	}

	
	
}
