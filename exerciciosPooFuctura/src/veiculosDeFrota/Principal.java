package veiculosDeFrota;

public class Principal {

	public static void main(String[] args) {
//	Crie uma classe Veiculo com atributos marca e ano.
//	Em seguida, crie duas classes Carro e Moto que herdam
//	de Veiculo, cada uma com um método específico
//	(ex., acelerar e empinar).
//
//	Crie objetos de Carro e Moto e use os métodos
//	específicos de cada um.
		
		Carro carro = new Carro("Gurgel", 1985);
		System.out.println(carro);
		carro.acelerar();
		
		Moto moto = new Moto("BMW", 2025);
		System.out.println(moto);
		moto.acelerar();
	}

}
