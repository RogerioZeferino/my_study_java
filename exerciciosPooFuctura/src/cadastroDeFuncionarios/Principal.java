package cadastroDeFuncionarios;

public class Principal {

	public static void main(String[] args) {
//	Crie uma classe Pessoa com atributos nome e idade,
//	e uma classe Funcionario que herda de Pessoa 
//	com um atributo salario. 
//
//	Adicione um método para exibir todas as informações
//	do funcionário. Instancie um funcionário e mostre 
//	seus dados.
		
		
//		Criando Objeto
		Funcionario funcionario = new Funcionario("Kelion", 35, 3500.0);
		
//		Exibindo informações
		System.out.println("Dados do funcionário:");
		funcionario.exibirDados();
	}

}
