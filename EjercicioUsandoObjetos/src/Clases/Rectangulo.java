package Clases;

public class Rectangulo {
	
	//Atributos
	Double base;
	Double altura;
	
	public Rectangulo(Double base,Double altura) {
		this.altura = altura;
		this.base = base;
	}
	
	public Double calcularArea() {
	     return	this.base*this.altura;
	}
	
	public Double calcularPerimetro() {
		return (this.base*2)+(this.altura*2);
	}

	
}
