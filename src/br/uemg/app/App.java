package br.uemg.app;
import br.uemg.formas.Circulo;
import br.uemg.formas.Quadrado;
import br.uemg.formas.Triangulo;

public class App {

	public static void main(String[] args) {
		Circulo c1 		= new Circulo(2.5);
		Quadrado q1 	= new Quadrado(10);
		Triangulo t1	= new Triangulo(10,2);
		
		
		System.out.println(c1);
		System.out.println(q1);
		System.out.println(t1);
	}

}
