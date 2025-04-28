package model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "livro")
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "titulo", nullable = false)
    private String titulo;

    @Column(name = "autor", nullable = false)
    private String autor;

    @Column(name = "ano_lancamento", nullable = false)
    private int ano_lancamento; 

    @Column(name = "isbn", nullable = false)
    private String isbn; 

    
    @Column(name = "sinopse", nullable = false)
    private String sinopse;

    @ManyToOne
    @JoinColumn(name = "categoria_id", referencedColumnName = "id")
    private Categoria categoria;

    // Construtor 
    public Livro() {}
    
    
    public Livro(int id, String titulo, String autor, int ano_lancamento, String isbn, String sinopse) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.ano_lancamento = ano_lancamento;
        this.isbn = isbn; 
        this.sinopse = sinopse;
        
    }

    

//    Getters e setters
    public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getTitulo() {
		return titulo;
	}




	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}




	public String getAutor() {
		return autor;
	}




	public void setAutor(String autor) {
		this.autor = autor;
	}




	public int getAno_lancamento() {
		return ano_lancamento;
	}




	public void setAno_lancamento(int ano_lancamento) {
		this.ano_lancamento = ano_lancamento;
	}




	public String getIsbn() {
		return isbn;
	}




	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}




	public String getSinopse() {
		return sinopse;
	}




	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}




	public Categoria getCategoria() {
		return categoria;
	}




	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}



//  Subrescrição
	@Override
    public String toString() {
    	String 
    	dados = "~~~~~~~~~~~~~~~~~~~~\nID do livro: "+ this.id;
		dados += "\nTítulo do livro: "+ this.titulo;
		dados += "\nAutor do livro: "+ this.autor;
		dados += "\nAno de Lançamento: "+ this.ano_lancamento;
		dados += "\nISBN : "+ this.isbn;
		dados += "\nSinopse do Livro: "+ this.sinopse;
		dados += "\nCategoria do Livro: "+ (this.categoria != null ? this.categoria.getNome() : "Não tem categoria");
		return dados;
    }
}