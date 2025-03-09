package model;

public class Produto {
	private String nome;
	private double preco;
	private Categoria categoria;
	
	public Produto(String nome, double preco, Categoria categoria) {
		this.nome = nome;
		this.preco = preco >  0 ? preco : 0.0;
		this.categoria = categoria;
		categoria.adicionarProduto(this);
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

}
