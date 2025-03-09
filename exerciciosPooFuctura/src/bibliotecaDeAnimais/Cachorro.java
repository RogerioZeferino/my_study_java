package bibliotecaDeAnimais;

public class Cachorro extends Animal{//Herda da Classe Animal
	
//	Construtor
	public Cachorro(String nome, String especie, int idade) {
		super(nome, "cachorro", idade);// Chama o construtor da classe Animal
	}
	public void latir() {
		System.out.println("Au-Au!");
	}
}
