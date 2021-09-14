package exercicios;

import java.util.Scanner;

import entidades.Retangulo;

public class Exercicio3 {

	public static void main(Scanner scanner) {
		
		System.out.println("Digite o valor da base do retangulo: ");
		Double base = scanner.nextDouble();
		
		System.out.println("Digite o valor da altura do retangulo: ");
		Double altura = scanner.nextDouble();
		
		Retangulo retangulo = new Retangulo(base, altura);
		
		System.out.println(retangulo.toString());
	}
}
