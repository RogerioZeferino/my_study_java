package sistemaPedidosLanchonete;

public class Produto {
	
//	Atributos
	public String nome;
	public double preco;
	
//	Construtor
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

//	Getters e Setters
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}
	
	@Override
	public String toString() {
		String dados = "Nome do Produto: "+ this.nome +
				"\nPreço do Produto: "+ this.preco;
		return dados;
	}
	
}
