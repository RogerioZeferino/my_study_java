package veiculosDeFrota;

public class Veiculo {
	
//	Atributos
	public String marca;
	public int ano;
	
//	Construtor
	public Veiculo(String marca, int ano) {
		this.marca = marca;
		this.ano = ano;
	}

//	Getters
	public String getMarca() {
		return marca;
	}
	public int getAno() {
		return ano;
	}
	
//	Método toString 
	@Override
	public String toString() {
		return "Marca: "+ marca +"; Ano: "+ ano;
	}
}
