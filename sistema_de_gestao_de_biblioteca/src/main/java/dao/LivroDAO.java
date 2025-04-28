package dao;

import java.util.List;

import model.Livro;

public interface LivroDAO {
	
	void save(Livro livro);
	Livro findById(int id);
	List<Livro> findAll();
	List<Livro> findAllAutorLivro(String autor);
	List<Livro> findByCategoriaId(int categoriaId);
	List<Livro> findByIsbn(String isbn);
	void update(Livro livro);
	void delete(int id);
	void deleteAllByCategoriaId(int categoriaId);
	
}
