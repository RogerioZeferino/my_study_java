package model;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
	
	private String nome;
	private List<Produto> produtos;
	
	public Categoria(String nome) {
		this.nome = nome;
		this.produtos = new ArrayList<>();		
	}
	
	
	public String getNome() {
		return nome;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public void adicionarProduto(Produto produto) {
		produtos.add(produto);
	}
	
	@Override
	public String toString() {
		return nome +" ("+ produtos.size() +" livros)";
	}
	

}
