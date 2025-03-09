package view;

import controller.LivrariaController;
import model.*;
import java.util.Scanner;

public class Principal {

	
		private LivrariaController controller;
		private Scanner scan;
		
		public Principal() {
			controller = new LivrariaController;
			
			Scanner scan = new Scanner(System.in);
		}
		
	public void exivirMenuPrincipal() {
		While(true){
			System.out.println("\n=== Manutenção de Cadastro ===");
            System.out.println("1. Cadastro de Produto");
            System.out.println("2. Cadastro de Cliente");
            System.out.println("3. Cadastro de Vendedor");
            System.out.println("4. Voltar");
            System.out.print("Escolha uma opção: ");
            int opcao = scan.nextInt();
            scan.nextLine();
            
            switch(opcao) {
            	case 1:
            		System.out.print("NOme do produto: ");
            		String nomeProd =  scan.nextLine();
            		System.out.print("Preço: R$  ");
            		double preco = scan.nextDouble();
            		scan.nextLine();
            		System.out.print("Categoria:  ");
            		String categoria = scan.nextLine();
            		try {
            			controller.cadastrarProduto(nomeProd, preco, categoria);
            			System.out.println("Produto cadastrado com sucesso!");
            		} catch(Exception e) {
            			System.out.println("Erro: "+e.getMessage());
            		}
            		break;
            	case 2:
            		System.out.println("Nome do cliente: ");
            		String nomeCli = scan.nextLine();
            		System.out.println("CPF (11 dígitos): ");
            		String cpfCli = scan.nextLine();
            		System.out.println("Endereço: ");
            		String enderexo = scan.nextLine();
            		try {
            			controller.cadastrarCliente(nomeCli,  cpfCli,  endereco);
            			System.out.println("Cliente cadastrado com sucesso! ");
            		}catch(Exception e) {
            			System.out.println("Erro: "+ e.gerMessage());
            		}
            		break;
            	case 3:
            		System.out.println("Nome do vendedor: ");
                    String nomeVend = scan.nextLine();
                    System.out.println("CPF (11 dígitos): ");
                    String cpfVend = scan.nextLine();
                    try {
                        controller.cadastrarVendedor(nomeVend, cpfVend);
                        System.out.println("Vendedor cadastrado com sucesso!");
                    } catch (Exception e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;
                case 4: return;
                default: System.out.println("Opção inválida!");
            		}
		}
	}
	
	private void exibirMenuConsultas() {
		while(true) {
			System.out.println("\n=== Consultas ===");
            System.out.println("1. Consultar Produtos por Categoria");
            System.out.println("2. Consultar Cliente por CPF");
            System.out.println("3. Consultar Vendedor por CPF");
            System.out.println("4. Listar Vendas");
            System.out.println("5. Voltar");
            System.out.print("Escolha uma opção: ");
            int opcao = scan.nextInt();
            scan.nextLine();
            
            switch(opcao) {
            case 1:
                System.out.print("Nome da categoria: ");
                String cat = scan.nextLine();
                controller.consultarProdutosPorCategoria(cat).forEach(p ->
                        System.out.printf("%s - R$ %.2f%n", p.getNome(), p.getPreco()));
                break;
            case 2:
                System.out.print("CPF do cliente: ");
                String cpfCli = scan.nextLine();
                controller.consultarClientePorCpf(cpfCli).ifPresent(c ->
                        System.out.printf("Nome: %s, CPF: %s, Endereço: %s%n", c.getNome(), c.getCpf(), c.getEndereco()));
                break;
            case 3:
                System.out.print("CPF do vendedor: ");
                String cpfVend = scan.nextLine();
                controller.consultarVendedorPorCpf(cpfVend).ifPresent(v ->
                        System.out.printf("Nome: %s, CPF: %s%n", v.getNome(), v.getCpf()));
                break;
            case 4:
                controller.listarVendas().forEach(v ->
                        System.out.printf("Data: %s, Cliente: %s, Vendedor: %s, Total: R$ %.2f%n",
                                v.getData(), v.getCliente().getNome(), v.getVendedor().getNome(), v.getTotal()));
                break;
            case 5: return;
            default: System.out.println("Opção inválida!");
            }
		}
	}
	
	private void exivirMenuVenda() {
		controller.iniciarVenda();
        while (true) {
            System.out.println("\n=== Iniciar Venda ===");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Remover Produto");
            System.out.println("3. Calcular Total");
            System.out.println("4. Associar Cliente");
            System.out.println("5. Associar Vendedor");
            System.out.println("6. Concluir Venda");
            System.out.println("7. Cancelar Venda");
            System.out.print("Escolha uma opção: ");
            int opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do produto: ");
                    String nomeProd = scan.nextLine();
                    try {
                        controller.adicionarProdutoVenda(nomeProd);
                        System.out.println("Produto adicionado!");
                    } catch (Exception e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("Nome do produto: ");
                    String nomeRem = scan.nextLine();
                    try {
                        controller.removerProdutoVenda(nomeRem);
                        System.out.println("Produto removido!");
                    } catch (Exception e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;
                case 3:
                    System.out.printf("Total da venda: R$ %.2f%n", controller.calcularTotalVenda());
                    break;
                case 4:
                    System.out.print("CPF do cliente: ");
                    String cpfCli = scan.nextLine();
                    try {
                        controller.associarClienteVenda(cpfCli);
                        System.out.println("Cliente associado!");
                    } catch (Exception e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;
                case 5:
                    System.out.print("CPF do vendedor: ");
                    String cpfVend = scan.nextLine();
                    try {
                        controller.associarVendedorVenda(cpfVend);
                        System.out.println("Vendedor associado!");
                    } catch (Exception e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;
                case 6:
                    try {
                        controller.concluirVenda();
                        System.out.println("Venda concluída com sucesso!");
                        return;
                    } catch (Exception e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;
                case 7:
                    controller.cancelarVenda();
                    System.out.println("Venda cancelada!");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
	
	public static void main(String[] args) {
		new Principal().exibirMenuPrincipal();

	}

}
