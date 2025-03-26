package model;

public class Cliente {
	
	private String nome;
	private String cpf;
	private String endereco;
	
	public Cliente(String nome, String cpf, String endereco) {
		while(!cpf.matches("\\d{11}")) {
			System.out.println("CPF INVÁLIDO, TENTE NOVAMENTE!");
		}
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	@Override
	public String toString() {
		return nome +" - CPF: "+ cpf +" - Endereço: "+ endereco;
	}
}
