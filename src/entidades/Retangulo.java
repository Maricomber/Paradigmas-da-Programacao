package entidades;

public class Retangulo {

	private Double largura;
	private Double altura;
	private Double perimetro;
	private Double area;
	private Double diagonal;
	
	public Retangulo() {
		
	}
	
	public Retangulo(Double largura,Double altura ) {
		this.largura = largura;
		this.altura = altura;
		this.area = largura*altura;
		this.diagonal = Math.sqrt(Math.pow(altura,2)+Math.pow(largura,2));
		this.perimetro = (2*altura) + (2*largura);
	}

	public Double getLargura() {
		return largura;
	}

	public void setLargura(Double largura) {
		this.largura = largura;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getPerimetro() {
		return perimetro;
	}

	public Double getArea() {
		return area;
	}

	public Double getDiagonal() {
		return diagonal;
	}
	
	public String toString() {
		return "Área: "+this.area+"\n"
		+"Perímetro: "+this.perimetro+"\n"
		+"Diagonal: "+this.diagonal;
	}
	
}
