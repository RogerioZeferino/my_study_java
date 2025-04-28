package model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "categoria")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "nome", nullable = false)
	private String nome;
	
	@Column(name = "descricao",nullable = false)
	private String descricao;
	
	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Livro> livros = new ArrayList<>();
	
	public Categoria() {}
	
	public Categoria(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
	}
	
	public Categoria(int id, String nome, String descricao) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
	}

//	Getters e setters
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * @return the livros
	 */
	public List<Livro> getLivros() {
		return livros;
	}

	/**
	 * @param livros the livros to set
	 */
	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

//	Sobrescrição
	@Override
    public String toString() {
        String dados = String.format("ID: %d%nNome: %s%nDescrição: %s%n", id, nome, descricao);

        return dados;
    }
	
	
	
	

}
