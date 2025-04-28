package service;

import java.util.List;
import java.util.Scanner;

import dao.CategoriaDAOImpl;
import model.Categoria;

public class CategoriaService {
	
	private static Scanner scan = new Scanner(System.in);
	private static CategoriaDAOImpl impl = new CategoriaDAOImpl();
	
//	Salvar uma categoria
	public static void salvarCategoria() {
		System.out.println("Informe o nome da categoria: ");
		String nome =  scan.nextLine();
		
		System.out.println("Informe a descrição da categoria: ");
		String descricao = scan.nextLine();
		
		Categoria categoria = new Categoria(nome, descricao);		
		categoria.setNome(nome);
		categoria.setDescricao(descricao);
		
		impl.save(categoria);	
		System.out.println("Categoria cadastrada com sucesso!\n");
	}
	
//	Buscar uma categoria por ID
	public static Categoria localizarCategoria() {
		System.out.println("Informe o ID da categoria:");
		int id = scan.nextInt(); 
		scan.nextLine();
		Categoria categoria = impl.findById(id);
		return categoria;
	}
	
//	Buscar todas as categorias
	public static List<Categoria> listarCategorias(){
		return impl.findAll();
	}
	
//	Exibir a categoria com maior quantidade de livros
	public static void exibirCategoriaMaisLivros() {
		Categoria categoria = impl.findCategoriaMaisLivros();
		System.out.println("Categoria com mais livros: "+ categoria.getNome());	
	}
	
//	Atualiza uma categoria
	public static void atualizarCategoria() {
		Categoria categoria = localizarCategoria();
		if(categoria != null) {
			System.out.println("Informe o novo nome da categoria: ");
			String nome = scan.nextLine();
			
			System.out.println("Informe a descrição da categoria: ");
			String descricao = scan.nextLine();
			
			categoria.setNome(nome);
			categoria.setDescricao(descricao);
						
			impl.update(categoria);
			System.out.println("Categoria salva com sucesso!\n");
		}
	}
	
//	Remove uma categoria
	 public static void removerCategoria() {
			Categoria categoria = localizarCategoria();
			
			if(categoria != null && categoria.getLivros().isEmpty()) {
				impl.delete(categoria.getId());
				System.out.println("Categoria removida com sucesso!\n");
			} else if(categoria != null) {
				System.out.println("Categoria inexistente\n");
			} else {
				System.out.println("Categoria já tem livros \n");
			}
		}	 
	
}	 
