package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class SecaoQuatro {

	public static void main(String[] args) {
		int y = 32;
		double x = 10.35784;
			
		System.out.println(y);
		System.out.println(x);
		
		String nome = "Maria";
		int idade =  31;
		double renda = 4000.0;
//		Separação de casas 2 e 4 decimais
//		O %n comanda a quebra de linha
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
//		Configura o programa para o separador US
		Locale.setDefault(Locale.US);
		
		System.out.printf("%.2f%n", x);
		
//		Concatenar váriios elementos
		
		System.out.println("RESULTADO = " + x + " METROS");
		
//		Como concatenar vários elementos
//		no mesmo comando de escrita
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais %n", nome, idade, renda);
		
//		Entrada de dados
		
		Scanner sc = new Scanner(System.in);
		
//		Algumas funções matemáticas em java
		
//		Variável A recebe a raiz quadrada de x		
		A = Math.sqrt(x);
		
//		Variável A recebe o resultado de x elevado a y
		A = Math.pow(x,y);
		
//		Variável A recebe o valor absoluto de x
		A = Math.abs(x);
		
		
		
		
		
		
		 
	}

}
