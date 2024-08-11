package br.uemg.formas;

public class Circulo implements AreaCalculavel{
	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double calcularArea() {
		return Math.PI * raio * raio;
	}

	@Override
	public String toString() {
		return "Circulo [raio=" + raio + "area=" + calcularArea() + "]";
	}
}
