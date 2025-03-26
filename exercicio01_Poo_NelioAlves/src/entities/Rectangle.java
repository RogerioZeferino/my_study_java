package entities;

public class Rectangle {
	
//	Fazer um programa para ler os valores da largura e altura 
//	de um retângulo. Em seguida, mostrar na tela o valor de 
//	sua área, perímetro e diagonal. Usar uma classe como 
//	mostrado no projeto ao lado.

//	Atributos
	public double width;
	public double height;
	
//	Construtor
	public Rectangle() {}
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
//	Métodos
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return 2 * (width + height);
	}
	
	public double diagonal() {
		return Math.sqrt(width * width + height * height); 
	}

	
}
