package veiculosDeFrota;

public class Carro extends Veiculo{
	
//	Construtor
	public Carro(String marca, int ano) {
        super(marca, ano);
    }
	
//	Método
	public void acelerar() {
        System.out.println("O carro " + getMarca() + " está acelerando na estrada!");
    }

}
