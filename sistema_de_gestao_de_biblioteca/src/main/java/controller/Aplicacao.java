package controller;

import java.util.List;
import java.util.Scanner;

import model.Categoria;
import model.Livro;
import service.CategoriaService;
import service.LivroService;

public class Aplicacao {
	
	private static final Scanner scan = new Scanner(System.in);
	
	public static void exibirMenuPrincipal() {
		while(true) {
			Menu.exibirMenuPrincipal();
			int opcao = scan.nextInt(); scan.nextLine();
			
			switch(opcao) {
				case 1 -> exibirMenuCategorias();
				case 2 -> exibirMenuLivros();
				case 3 -> {
					System.out.println("Encerrando o programa...");
					System.exit(0);
				}
				default -> System.out.println("Opção inválida!");
			
			}
			
		}
	}
	
	public static void exibirMenuCategorias() {
		Menu.exibirMenuCategorias();
		int opcao = scan.nextInt(); scan.nextLine();
		
		switch (opcao) {
		case 1 -> CategoriaService.salvarCategoria();
		case 2 -> {
			List<Categoria> categorias = CategoriaService.listarCategorias();
			
			if (!categorias.isEmpty()) {
				categorias.forEach(System.out::println);				
			}else {
				System.out.println("Não há categorias registradas!");
			}
		}
		
		case 3 ->{
			Categoria categoria = CategoriaService.localizarCategoria();
			System.out.println(categoria != null ? categoria : "Categoria inexistente\n!");
		}
		
		case 4 -> CategoriaService.atualizarCategoria();
		case 5 -> CategoriaService.removerCategoria();
		case 6 -> exibirMenuPrincipal(); 
		default ->{
			System.out.println("Opção inválida!");
			exibirMenuPrincipal();
		}
		}
	}
	
	public static void exibirMenuLivros() {
		Menu.exibirMenuLivros();
		int opcao = scan.nextInt();
		scan.nextLine();
		
		switch(opcao) {
		case 1 -> LivroService.salvarLivro();
		case 2 -> {
			Livro livro = LivroService.buscarLivroPorId();
			System.out.println(livro != null ? livro: "Livro inexistente!\n");
			}		
		case 3 -> {
			List<Livro> livros = LivroService.buscarLivros();
			
			if (!livros.isEmpty()) {
				livros.forEach(System.out::println);				
			}else {
				System.out.println("Não há livros registrados!");
			}
		}		
		case 4 -> {
		    List<Livro> livros = LivroService.buscarLivroPorCategoriaId();
		    if (livros == null || livros.isEmpty()) {
		        System.out.println("Nenhum livro encontrado para essa categoria!");
		    } else {
		        livros.forEach(System.out::println);
		    }
		}
		case 5 -> {
			List<Livro> livros = LivroService.buscarLivroPorAutor();
			if(livros.isEmpty()) {
				System.out.println("Nenhum livro encontrado para este autor");
			}else {
				livros.forEach(System.out::println);
			}
		}
		case 6 -> {
			List<Livro> livros = LivroService.buscarLivroPorIsbn();
			if(!livros.isEmpty()) {
				livros.forEach(System.out::println);
			}else {
				System.out.println("ISBN não encontrado!");
			}
		}
		case 7 -> LivroService.atualizarLivro();
		case 8 -> LivroService.removerLivro();
		case 9 -> LivroService.removerTodosLivrosDaCategoria();
		case 10 -> exibirMenuPrincipal();

		}
	}
	

}
