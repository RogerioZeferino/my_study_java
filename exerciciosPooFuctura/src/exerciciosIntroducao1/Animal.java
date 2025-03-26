package exerciciosIntroducao1;

public class Animal {
	
//	Animal
	private String nome;
	private int idade;
	private String especie;
	
//	Construtor
	public Animal(String nome, int idade, String especie) {
		this.nome = nome;
		this.idade = idade;
		this.especie = especie;
	}

//	Getters
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public String getEspecie() {
		return especie;
	}
	
//	Método para emitir som
	public void emitirSom() {
		switch(especie.toLowerCase()) {
		case "cacchorro":
			System.out.println("Au-au!");
			break;
		case "gato":
			System.out.println("Miau-miau!");
			break;
		case "vaca":
			System.out.println("Muu-muu!");
			break;
		default:
			System.out.println("desconhecido");
			
		}
		
	}

}
