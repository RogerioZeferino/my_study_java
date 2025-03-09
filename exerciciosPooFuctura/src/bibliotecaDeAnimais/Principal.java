package bibliotecaDeAnimais;

public class Principal  {

	public static void main(String[] args) {
				
//		Criação do Objeto
		Cachorro cachorro = new Cachorro("Paçoca","cachorro", 2);
		
//		Mostrando os dados do cachorro
		cachorro.mostrarDados();
		
//		Fazendo o cachorro latir
		cachorro.latir();		
	}

}
