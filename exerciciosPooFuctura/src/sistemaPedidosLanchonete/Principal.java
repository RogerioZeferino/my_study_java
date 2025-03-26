package sistemaPedidosLanchonete;

public class Principal {

	public static void main(String[] args) {
//	Crie uma classe Produto com atributos nome e preco.

//	Em seguida, crie uma classe Pedido que possui uma lista
//	de Produto e métodos para adicionar e listar os produtos
//	do pedido. Instancie um pedido e adicione alguns produtos,
//	exibindo o total final.
		
//	Criando o objeto
		Pedido pedido = new Pedido();
		
//	Criando produtos
		Produto produto1 = new Produto("Camiseta", 49.90);
		Produto produto2 = new Produto("Bermuda", 69.90);
		Produto produto3 = new Produto("Camisa", 89.90);
		
//		Adicionando produtos ao pedido
		pedido.adicionarProduto(produto1);
		pedido.adicionarProduto(produto2);
		pedido.adicionarProduto(produto3);
		
//		Listando os produtos
		pedido.listarProduto();

//		Calculando o total do pedido
		double total = pedido.calcularTotal();
		System.out.printf("\nTotal do pedido: R$ %.2f ", total);		
	}

}
