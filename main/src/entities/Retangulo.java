package entities;

public class Retangulo {

	private double altura, largura;
	
	public Retangulo() {
		
	}
	
	public Retangulo(double altura, double largura) {
		this.altura = altura;
		this.largura = largura;
	}

	public double area(){
		return this.altura * this.largura;
	}
	
	public double perimetro() {
		return 2 * this.altura + 2 * this.largura;
	}
	
	public double diagonal() {
		double diagonal = Math.sqrt(this.altura * this.altura + this.largura * this.largura);
		return diagonal;		
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	public String toString() {
		return "AREA: " + area() +
				" PERIMETRO: " + perimetro() +
				" DIAGONAL: " + diagonal();
	}
	
}
