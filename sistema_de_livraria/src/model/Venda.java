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
	
	public Venda() {
		this.produtos = new ArrayList<>();
		this.data = LocalDate.now();
		this.total = 0.0;
	}
	
	public void adicionarProduto(Produto produto) {
		produtos.add(produto);
		total += produto.getPreco();
	}
	
	public void removerProduto(Produto produto) {
		if(produtos.remove(produto)) {
			total -= produto.getPreco();
		}
		
		
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public LocalDate getData() {
		return data;
	}

	public double getTotal() {
		return total;
	}


}
