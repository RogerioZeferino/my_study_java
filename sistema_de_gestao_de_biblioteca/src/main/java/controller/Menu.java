package controller;

public class Menu {
	
	
	private static final String MENU_PRINCIPAL = """
			~~~~~~~~~~~~~~~~~~~~~~
			Bem-vindo à Biblioteca
			1. Categorias
			2. Livros
			3. Encerrar			
			""";
	
	private static final String MENU_CATEGORIAS = """
			~~~~~~~~~~~~~~~~~~~~~~
			1. Cadastrar Categoria
			2. Listar Categoria
			3. Localizar categoria por ID
			4. Atualizar categoria
			5. Remover categoria
			6. Voltar			
			""";
	
	private static final String MENU_LIVROS = """
			~~~~~~~~~~~~~~~~~~~~~~
			1. Cadastrar livro
			2. Localizar livro por ID
			3. Localizar todos livros cadastrados
			4. Localizar livro por categoria
			5. Localizar todos livros de um autor específico
			6. Localizar livro por ISBN
			7. Atualiza livro
			8. Remover livro
			9. Remover todos livros de uma categoria
			10. Voltar			
			""";
	
	public static void exibirMenuPrincipal() {
		System.out.println(MENU_PRINCIPAL);
	}
	
	
	public static void exibirMenuCategorias() {
		System.out.println(MENU_CATEGORIAS);
	}
	
	
	public static void exibirMenuLivros() {
		System.out.println(MENU_LIVROS);
	}
	

}