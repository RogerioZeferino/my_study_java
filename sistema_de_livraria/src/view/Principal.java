package view;

import model.*;
import controller.SistemaLivraria;
import java.util.Scanner;

public class Principal {

	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
        Principal.exibirMenuPrincipal();
    }
	

	    public static void exibirMenuPrincipal() {
	        int opcao;
	        do {
	            System.out.println("\n===== LIVRARIA =====");
	            System.out.println("1. MANUTENÇÃO DE CADASTRO");
	            System.out.println("2. CONSULTAS");
	            System.out.println("3. INICIAR VENDA");
	            System.out.println("4. SAIR");
	            System.out.print("ESCOLHA UMA OPÇÃO: ");
	            opcao = scan.nextInt();
	            scan.nextLine();

	            switch (opcao) {
	                case 1:
	                    menuCadastro();
	                    break;
	                case 2:
	                	menuConsultas();
	                	break;
	                case 3:
	                	menuVenda();
	                	break;
	                case 4:
	                    System.out.println("SAINDO DO SISTEMA...");
	                    break;
	                default:
	                    System.out.println("OPÇÃO INVALIDA.");
	            }
	        } while (opcao != 4);
	    }

	    private static void menuCadastro() {
	        System.out.println("\n===== CADASTRO =====");
	        System.out.println("1. CADASTRAR PRODUTO");
	        System.out.println("2. VOLTAR");
	        System.out.print("ESCOLHA UMA OPÇÃO: ");
	        int opcao = scan.nextInt();
	        scan.nextLine();

	        if (opcao == 1) {
	            System.out.print("NOME DO PRODUTO: ");
	            String nome = scan.nextLine();
	            System.out.print("PREÇO: ");
	            double preco = scan.nextDouble();
	            scan.nextLine();
	            System.out.print("CATEGORIA: ");
	            String categoriaNome = scan.nextLine();
	            Categoria categoria = new Categoria(categoriaNome);

	            Produto produto = new Produto(nome, preco, categoria);
	            SistemaLivraria sistemaLivraria = new SistemaLivraria(); 
	            sistemaLivraria.cadastrarProduto(nome, preco, categoria, produto); 
	            System.out.println("PRODUTO CADASTRADO COM SUCESSO!");

	        }
	        
	    }
	    
	    private static void menuConsultas() {
	    	System.out.println("1. CONSULTAR PRODUTOS POR CATEGORIA");
	    	System.out.println("2. CONSULTAR CLIENTE POR CPF");
	    	System.out.println("3. CONSULTAR VENDEDOR POR CPF");
	    	System.out.println("4. LISTAR VENDAS");
	    	System.out.println("5. VOLTAR");
	    	System.out.println("ESOLHA UMA OPÇÃO: ");
            SistemaLivraria sistemaLivraria = new SistemaLivraria(); 

	    	int opcao = scan.nextInt();scan.nextLine();
	    	switch(opcao) {
	    		case 1:
	    			sistemaLivraria.getCategorias().forEach(System.out::println);
	    			break;
	    		case 2:
	    			sistemaLivraria.getClientes().forEach(System.out::println);
	    			break;
	    		case 3:
	    			sistemaLivraria.getVendedores().forEach(System.out::println);
	    			break;
	    		case 4:
	    			sistemaLivraria.getVendas().forEach(System.out::println);
	    			break;
	    		case 5:
	    			Principal.exibirMenuPrincipal();
	    		default:
	    			System.out.println("OPÇÃO INVÁLIDA");
	    			break;
	    				
	    		
	    	}
	    }
	    private static void menuVenda() {
	    	System.out.println("\n----MENU VENDA----");
	    	System.out.println("1. ADICIONAR PRODUTO");
	    	System.out.println("2. REMOVER PRODUTO");
	    	System.out.println("3. CALCULAR TOTAL");
	    	System.out.println("4. CONCLUIR VENDA");
	    	System.out.println("5. CANCELAR VENDA");
	    	System.out.println("ESCOLHA UMA OPÇÃO: ");
	    	
	    	int opcao = scan.nextInt(); scan.nextLine();
	    	switch(opcao) {
	    		case 1:	    			
	    			break;
	    		case 2:
	    			break;
	    		case 3:
	    			
	    			break;
	    		case 4:
	    			break;
	    		case 5:
	    			System.out.println("VENDA CANCELADA!");
	    			Principal.exibirMenuPrincipal();
	    			break;
	    		default:
	    			System.out.println("OPÇÃO INVÁLIDA");
	    			break;	    			
	    	}
	    	
	    }

}
