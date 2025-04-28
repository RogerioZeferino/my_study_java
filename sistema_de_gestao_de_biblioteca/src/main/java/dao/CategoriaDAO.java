package dao;

import java.util.List;

import model.Categoria;

public interface CategoriaDAO {
	/*Interface que contém os métodos para salvar,
	 buscar, listar, atualizar e remover categorias*/
	
	void save(Categoria categoria);
	Categoria findById(int id);
	List<Categoria> findAll();
	Categoria findCategoriaMaisLivros();
	void update(Categoria categoria);
	void delete(int id);

}
