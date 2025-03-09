package model;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
	private String nome;
	private List<Produto> produtos;
	
	public Categoria(Strig nome) {
		this.nome = nome;
		this.produtos = new ArrayList<>();
	}
	
	public void adicionarProduto(Produto produto) {
		produtos.add(produto);
	}
	
	public String getNome() {
		return nome;
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
	public int getQuantidadeProdutos() {
		return produtos.size();
	}

}
