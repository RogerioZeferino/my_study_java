package service;

import java.util.List;
import java.util.Scanner;

import dao.LivroDAOImpl;
import model.Categoria;
import model.Livro;

public class LivroService {
	
	private static Scanner scan = new Scanner(System.in);
	private static LivroDAOImpl impl = new LivroDAOImpl();
	
//	Salvar livro
	public static void salvarLivro() {
		Livro livro = new Livro();
		System.out.println("Informe o titulo do livro: ");
		String titulo =  scan.nextLine();
		
		System.out.println("Informe o nome do autor do livro:");
		String autor = scan.nextLine();
		
		System.out.println("Informe o ano de lançamento do livro:");
		int ano_lancamento = scan.nextInt(); scan.nextLine();
		if(ano_lancamento < 1967) {
			throw new IllegalArgumentException("Ano de lançamento abaixo de 1967");
		}
		
		System.out.println("Informe o ISBN do livro: ");		
		String isbn = scan.nextLine();
		List<Livro> livroMesmoIsbn = impl.findByIsbn(isbn);
		if(!livroMesmoIsbn.isEmpty()) {
			System.out.println("ISBN já cadastrado! Tente novamente!");
		}
		
		System.out.println("Informe a sinopse do livro: ");
		String sinopse = scan.nextLine();
		
		Categoria categoria = CategoriaService.localizarCategoria();
		
		if (categoria != null) {
			livro.setTitulo(titulo);
			livro.setAutor(autor);
			livro.setAno_lancamento(ano_lancamento);
			livro.setIsbn(isbn);
			livro.setSinopse(sinopse);
			livro.setCategoria(categoria);
			impl.save(livro);
			System.out.println("Livro cadastrado com sucesso!\n");
		} else {
			System.out.println("Categoria inexistente");
		}

	} 
	
//	Busca um livro por id
	public static Livro buscarLivroPorId() {
		System.out.println("Informe o ID do livro: ");
		int id = scan.nextInt(); scan.nextLine();
		return impl.findById(id);
	}
	
//	Busca todos livros cadastrados
	public static List<Livro> buscarLivros(){
		return impl.findAll();
	}
	
//	Busca livro por categoria
	public static List<Livro> buscarLivroPorCategoriaId(){
		Categoria categoria = CategoriaService.localizarCategoria();
		
		if(categoria != null) {
			return impl.findByCategoriaId(categoria.getId());
//			System.out.println(livro);
		}else {
			return null;
		}
	}
	
//	Busca todos livros de um autor específico
	public static List<Livro> buscarLivroPorAutor(){
		System.out.println("Informe o nome do autor: ");
		String autor = scan.nextLine();
		return impl.findAllAutorLivro(autor);
	}
	
//	Busca por ISBN
	public static List<Livro> buscarLivroPorIsbn(){
		System.out.println("Informe o ISBN: ");
		String isbn = scan.nextLine();
		return impl.findByIsbn(isbn);
	}
	
//	Atualizar livro
	public static void atualizarLivro() {
		Livro livro  = buscarLivroPorId();
		
		if (livro == null) {
			System.out.println("Livro não encontrado!");
			return;
		}
		System.out.println("Digite o novo título: ");
		String novoTitulo = scan.nextLine();
		
		System.out.println("informe o nome do autor:");
		String autor = scan.nextLine();
		
		System.out.println("Informe o ano de lançamento do livro:");
		int ano_lancamento = scan.nextInt(); scan.nextLine();
		if(ano_lancamento < 1967) {
			throw new IllegalArgumentException("Ano de lançamento abaixo de 1967");
		}
		
		System.out.println("informe o ISBN do livro: ");		
		String isbn = scan.nextLine();
		
		List<Livro> livroMesmoIsbn = impl.findByIsbn(isbn);
		if(!livroMesmoIsbn.isEmpty()) {
			System.out.println("ISBN já cadastrado!");
			return;
		}	
		
		System.out.println("Informe a sinopse do livro: ");
		String sinopse = scan.nextLine();
		
		Categoria categoria = CategoriaService.localizarCategoria();		
		if (categoria == null) {
			System.out.println("Categoria inexistente");
			return;
		}
			livro.setTitulo(novoTitulo);
			livro.setAutor(autor);
			livro.setAno_lancamento(ano_lancamento);
			livro.setIsbn(isbn);
			livro.setSinopse(sinopse);
			livro.setCategoria(categoria);
			
			impl.update(livro);
			System.out.println("Livro atualizado com sucesso!");
	}
	
//	Remove um livro
	public static void removerLivro() {
		Livro livro = buscarLivroPorId();
		
		if(livro != null) {
			impl.delete(livro.getId());
			System.out.println("Livro removido do sistema!");
		}else {
			System.out.println("Livro inexistente!");
		}
	}
	
//	Remove todos livros de uma categoria
	public static void removerTodosLivrosDaCategoria() {
		Categoria categoria = CategoriaService.localizarCategoria();
		
		if(categoria != null) {
			try {
				impl.deleteAllByCategoriaId(categoria.getId());
				System.out.printf("Todos livros da  categoria %s foram removidos do sistema!", categoria.getNome());
			}catch(Exception e) {
				System.out.println("Erro ao remover livros" + e.getMessage());
			}
		} else {
			System.out.printf("Categoria inexistente!\n");
		}
	}
	
   
}