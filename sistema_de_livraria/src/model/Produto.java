package model;

//import controller.Validacao;

public class Produto {
	private String nome;
	private double preco;
	private Categoria categoria;
	
	public Produto(String nome, double preco, Categoria categoria) {
		while(preco <= 0) {
			System.out.println("PREÇO INVÁLIDO, DIGITE NOVAMENTE!");
		}
		this.nome = nome;
		this.preco = preco;
		this.categoria = categoria;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public Categoria getCategoria() {
		return categoria;
	}
	
	@Override
	public String toString() {
		return nome +" - R$ "+ preco +" (" + categoria.getNome() + ")"; 
	}
	

}
