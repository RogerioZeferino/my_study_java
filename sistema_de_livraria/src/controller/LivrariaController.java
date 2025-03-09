package controller;

import model.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LivrariaController {
	private List<Produto> produtos;
	private List<Cliente> clientes;
	private List<Vendedor> vendedores;
	private Lista<Venda> vendas;
	private List<Categoria> categorias;
	private Venda vendaAtual;
	
	public LivrariaController() {
		produtos = new ArrayList<>();
		clientes = new ArrayList<>();
		vendedores = new ArrayList<>();
		vendas = new ArrayList<>();
		categorias = new ArrayList<>();
		vendaAtual = null;
	}
	
	public void cadastrarProduto(String nome, double preco, String nomeCategoria) {
		Categoria categoria = categorias.stream()
				.filter(c -> c.getNome().equalsIgnoreCase(nomeCategoria))
				.findFirst()
				.orElseGet(()->{
					Categoria nova = new Categoria(nomeCategoria);
					categorias.add(nova);
					return nova;
				});
		Produto produto = new produto(nome, preco, categoria);
		produtos.add(produto);
	}
	
	public void cadastrarCliente(String nome, String spf, String endereco) {
		if(clientes.stream().anyMatch(c->c.getCpf().equals(cpf))) {
			throw new IllegalArgumentException("CPF já cadastrado!");
		}
		clientes.add(new Cliente(nome, cpf, endereco));
	}
	
	public void cadastrarVendedor(String nome, String cpf) {
		if(vendedores.steam()
				.anyMatch(v-> v.getCpf()
				.equals(cpf))) {
			throw new IllegalArgumentException("CPF já cadastrado!");
		}
		vendedores.add(new Vendedor(nome, cpf));
	}
	
	public List<Produto> consultarProdutosPorCategoria(String nomeCategoria){
		return categorias.stream()
				.filter(c->c.getNome().equalsIgnoreCase(nomeCategoria))
				.findFirst()
				.map(Categoria::getProdutos)
				.orElse(new ArrayList<>());
	}
	
	public Optional<Cliente> consultarClientePorCpf(String cpf){
		return clientes.stream().filter(c->c.getCpf().equals(cpf)).findFirst();
	}
	
	public Optional<Vendedor> consultarVendedor(String cpf){
		return vendedores.stream().filter(c->c.getCpf().equals(cpf)).findFirst();
	}
	
	public List<Venda> listarVendas(){
		return vendas;
	}
	
	public List<Categoria> listarCategoria(){
		return categorias;
	}
	
	public void inciarVenda() {
		vendaAtual  = new Venda();
	}
	
	public void adicionarProdutoVenda(String nomeProduto) {
		Produto produto = produtos.stream()
				.filter(p->p.getNome().equalsIgnoreCase(nomeProduto))
				.findFirst()
				.orElseThrow(()-> new IllegalAccessException("Produto não encontrado!"));
		vendaAtual.adicionarProduto(produto);						
	}
	
	public void removerProdutoVenda(String nomeProduto) {
		Produto produto = vendaAtual.getProdutos().stream()
				.filter(p->p.getNome().euqualsIgnoreCase(nomeProduto))
				.findFirst()
				.orelseThrow(()-> new IllegalArgumentException("Produto não encontrado na Venda"));
		vendaAtual.removerProduto(produto);
	}
	
	public double calcularTotalVenda() {
		return vendaAtual.getTotal();
	}
	
	public void associarClienteVenda(String cpf) {
		Cliente cliente = consultarClientePorCpf(cpf)
				.orElseThrow(()-> new IllegalArgumentException("Cliente não encontrado!"));
		vendaAtual.setCliente(cliente);
	}
	
	public void associarVendedorVenda(String cpf) {
		Vendedor vendedor = consultarVendedorPorCpf(cpf)
				.orElseThrow(()-> new IllegalArgumentException("Vendedor não encontrado!"));
		vendaAtual.setVendedor(vendedor);
	}
	
	public void concluirVenda() {
		if(VendaAtual.getProdutos().isEmpty()
				|| vendaAtual.getCliente() == null
				|| vendaAtual.getVendedor() == null) {
			throw new IllegalArgumentException("Venda não pode ser concluída sem produtos, cliente e vendedor!");
			}
		venda.add(vendaAtual);
		vendaAtual = null;
	}
	
	public void cancelarVenda() {
		vendaAtual = null;
	}
	
	public Venda getVendaAtual() {
		return vendaAtual;
	}
	
	
}

