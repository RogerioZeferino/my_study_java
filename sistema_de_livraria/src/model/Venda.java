package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venda {
	private Cliente cliente;
	private Vendedor vendedor;
	private List<Produto> produtos;
	private LocalDate data;
	private double total;
	
	public Venda(Cliente cliente, Vendedor vendedor) {
		this.cliente = cliente;
		this.vendedor = vendedor;
		this.produtos = new ArrayList<>();
		this.data = LocalDate.now();
		this.total = 0.0;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public LocalDate getData() {
		return data;
	}

	public double getTotal() {
		return total;
	}
	
	public void adicionarProduto(Produto produto) {
		produtos.add(produto);
		total += produto.getPreco();
	}
	
	public void removerProduto(Produto produto) {
		produtos.remove(produto);
		total -= produto.getPreco();		
	}
		
	@Override
	public String toString() {
		return "Venda em: "+ data +" -Cliente: "+ cliente.getNome() +" -Total: R$ "+ total;
	}

}
