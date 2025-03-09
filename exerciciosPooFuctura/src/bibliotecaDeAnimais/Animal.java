package bibliotecaDeAnimais;

public class Animal {
//	Atributos
	public String nome;
	public String especie;
	public int idade;
	
//	Construtor
	public Animal(String nome, String especie, int idade) {
		this.nome = nome;
		this.especie = especie;
		this.idade = idade;
	}
	
//	Métodos
	public void mostrarDados() {
		System.out.println("Nome: "+ nome);
		System.out.println("Espécie: "+ especie);
		System.out.println("Idade: "+ idade);
	}
//	Getters
//	public String getNome() {
//		return nome;
//	}
//	
//	public String getEspecie() {
//		return especie;
//	}
//	
//	public int getIdade() {
//		return idade;
//	}
}
