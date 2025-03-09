package sistemaPedidosLanchonete;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
//	Lista de produtos
	private List<Produto> produtos = new ArrayList<>();
	

//	Métodos
	public void adicionarProduto(Produto produto) {
		produtos.add(produto);		
	}
	
	public void listarProduto() {
		System.out.println("Produtos no pedido: ");
		for(Produto produto : produtos) {			
			System.out.println(produto);
		}	
	}
	
	public double calcularTotal() {
		double total = 0.0;
		for(Produto produto : produtos) {
			total += produto.getPreco();
		}
		return total;
	}

}
