package model;

public class Vendedor {
	private String nome;
	private String cpf;
	
	public Vendedor(String nome, String cpf) {
		while(!cpf.matches("\\d{11}")) {
			System.out.println("CPF INVÁLIDO, TENTE NOVAMENTE!");
		}
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	@Override
	public String toString() {
		return nome +" -CPF: "+ cpf ;
	}
	
}
