package dao;

import java.util.List;

import jakarta.persistence.EntityManager;
import model.Categoria;
import utils.JPAUtil;

public class CategoriaDAOImpl implements CategoriaDAO {
		/*Classe que irá concretizar os métodos contidos
		       na interface CategoriaDAO*/ 
		
		private EntityManager em;
		
//		Construtor
		public CategoriaDAOImpl() {
			this.em =JPAUtil.getEntityManager();
		}

//		Salvar categoria
		@Override
		public void save(Categoria categoria) {
			em.getTransaction().begin();//Inicia a transação
			em.persist(categoria);//Persiste o objeto categoria
			em.getTransaction().commit();//Confirma a transação
		}

//		Buscar uma categoria
		@Override
		public Categoria findById(int id) {
			return em.find(Categoria.class, id);
		}

//		Buscar todas as categorias
		@Override
		public List<Categoria> findAll() {
			return em 
					.createQuery("FROM Categoria c ORDER BY c.nome ASC", Categoria.class)
					.getResultList();
		}
		
//		Exibir a categoria com maior quantidade de livros
		@Override
		public Categoria findCategoriaMaisLivros() {
			return em
					.createQuery("SELECT l.categoria FROM Livro l GROUP BY l.categoria ORDER BY COUNT(l)) DESC", Categoria.class)
					.setMaxResults(1)
					.getSingleResult();
		}

//		Atualiza uma categoria
		@Override
		public void update(Categoria categoria) {
			em.getTransaction().begin();//Inicia a transação
			em.merge(categoria);//Mescla as alterações ao banco de dados
			em.getTransaction().commit();//Confirma a transação		
		}

//		Remove uma categoria
		@Override
		public void delete(int id) {
			em.getTransaction().begin();//Inicia a transação
			Categoria categoria = findById(id);//Busca uma categoria para remover
			em.remove(categoria);//Remove a categoria do banco de dados
			em.getTransaction().commit();//Confirma a transação
		}		
		

}