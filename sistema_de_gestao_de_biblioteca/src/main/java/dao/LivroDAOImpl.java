package dao;

import java.util.List;

import jakarta.persistence.EntityManager;
import model.Livro;
import utils.JPAUtil;

public class LivroDAOImpl implements LivroDAO {
	
	/*Classe que irá concretizar os métodos contidos
    na interface LivroDAO*/ 
	
	private EntityManager em;
	
//	Construtor
	public LivroDAOImpl() {
		this.em = JPAUtil.getEntityManager();				
	}
	
//	Salvar um livro
	@Override
	public void save(Livro livro) {
		em.getTransaction().begin();//Inicia a transação
		em.persist(livro);//Persiste o objeto livro
		em.getTransaction().commit();//Confirma a transação
	}
	
//	Busca um livro por id
	@Override
	public Livro findById(int id) {
		Livro livro = em.find(Livro.class, id);
		if(livro == null) {
		}
		return livro;
	}
	
//	Busca todos livros cadastrados
	@Override
	public List<Livro> findAll(){//Retorna lista de livros 
		return em
				.createQuery("FROM Livro", Livro.class)
				.getResultList();
	} 
	
	
//	Buscar livro por categoria
	@Override
	public List<Livro> findByCategoriaId(int categoriaId){
		return em
				.createQuery("FROM Livro l WHERE l.categoria.id = :categoriaId", Livro.class)
				.setParameter("categoriaId", categoriaId)
				.getResultList();
	}
	
	
//	Busca todos livros de um autor específico (procura usando letras maiúsculas ou minúsculas e usando  partes do nome do autor)
	@Override
	public List<Livro> findAllAutorLivro(String autor){
		return em
				.createQuery("FROM Livro l JOIN FETCH l.categoria WHERE LOWER(l.autor) LIKE LOWER(:autor)", Livro.class)
				.setParameter("autor", "%" + autor.toLowerCase() + "%")
				.getResultList();
	}
	
//	Busca por ISBN
	@Override
	public List<Livro> findByIsbn(String isbn){
		return em
				.createQuery("FROM Livro l WHERE l.isbn = :isbn", Livro.class)
				.setParameter("isbn", isbn)
				.getResultList();
	}
	
	
//	Atualizar o livro
	@Override
	public void update(Livro livro) {
		em.getTransaction().begin();//Inicia a transação
		em.merge(livro);//Mescla as alterações ao banco de dados
		em.getTransaction().commit();//Finaliza a transação		
	}
	
	
//	Remove um livro
	@Override
	public void delete(int id) {
		em.getTransaction().begin();//Inicia a transação
		Livro livro = findById(id);//Busca um livro para remover
		em.remove(livro);//Remove um livro do banco de dados
		em.getTransaction().commit();//Finaliza a transação
	}
	
//	Remove todos livros de uma categoria
	@Override
	public void deleteAllByCategoriaId(int categoriaId) {
		List<Livro> lista = em
							.createQuery("FROM Livro l WHERE l.categoria.id = :categoriaId", Livro.class)
							.setParameter("categoriaId", categoriaId)
							.getResultList();
		for(Livro livro : lista) {
			em.getTransaction().begin();
			em.remove(livro);
		}
		em.getTransaction().commit();		
	}	

}
