package veiculosDeFrota;

public class Moto extends Veiculo {
	
//	Construtor
	public Moto(String marca, int ano) {
        super(marca, ano);
    }
	
// Método
	public void acelerar() {
		System.out.println("A moto "+ marca +" está acelerando na rua!");
	}
}
