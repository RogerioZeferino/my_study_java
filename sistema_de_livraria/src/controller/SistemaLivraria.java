package controller;

import model.*;
import java.util.ArrayList;
import java.util.List;

public class SistemaLivraria {
	private List<Produto> produtos;
	private List<Cliente> clientes;
	private List<Vendedor> vendedores;
    private List<Venda> vendas;
    private List<Categoria> categorias;
	
	public SistemaLivraria() {
		produtos = new ArrayList<>();
		clientes = new ArrayList<>();
		vendedores = new ArrayList<>();
		vendas = new ArrayList<>();
		categorias = new ArrayList<>();
	}
	
	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public List<Vendedor> getVendedores() {
		return vendedores;
	}

	public void setVendedores(List<Vendedor> vendedores) {
		this.vendedores = vendedores;
	}

	public List<Venda> getVendas() {
		return vendas;
	}

	public void setVendas(List<Venda> vendas) {
		this.vendas = vendas;
	}

	public List<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}

	public void cadastrarProduto(String nome, double preco, Categoria categoria, Produto produto) {
	    produtos.add(produto);
	}

	
	public void cadastarCliente(String nome, String cpf, String endereco) {
		clientes.add(new Cliente(nome, cpf, endereco));
	}
	
	 public void cadastrarVendedor(String nome, String cpf) {
	        vendedores.add(new Vendedor(nome, cpf));
	    }
	
	public List<Produto> consultarProdutosPorCategoria(Categoria categoria){
		return categoria.getProdutos();
	}
	
	public Cliente consultarClientePorCPF(String cpf) {
        return clientes.stream().filter(c -> c.getCpf().equals(cpf)).findFirst().orElse(null);
    }
	
	public Vendedor consultarVendedorPorCPF(String cpf) {
        return vendedores.stream().filter(v -> v.getCpf().equals(cpf)).findFirst().orElse(null);
    }
	
	public void adicionarCategoria(Categoria categoria) {
	    categorias.add(categoria);
	}
	
	public List<Venda> listarVendas() {
        return vendas;
    }

}
