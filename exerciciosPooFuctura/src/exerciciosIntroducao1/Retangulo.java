package exerciciosIntroducao1;

public class Retangulo {
//	Atributos
	public int largura;
	public int altura;
	
	public Retangulo(int largura, int altura) {
		this.largura = largura;
		this.altura = altura;
	}
	
//	Métodos
	
	public void calcularArea(int area) {
		area = largura * altura;
	}
	
	public void perimetroRetangulo(double perimetro) {
		perimetro = (largura + altura) * 2;
	}
	
	
}
