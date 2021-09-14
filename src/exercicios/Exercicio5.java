package exercicios;

import java.util.Scanner;

import entidades.Aluno;

public class Exercicio5{

	public static void main(Scanner scanner) {
		
		Aluno aluno = new Aluno();
		
		System.out.println("Digite o nome do aluno: ");
		aluno.setNome(scanner.next());
		
		System.out.println("Digite a idade do aluno: ");
		aluno.setIdade(scanner.nextInt());
		
		System.out.println("Digite a nota 1 do aluno: ");
		aluno.getNota().add(scanner.nextFloat());
		
		System.out.println("Digite a nota 2 do aluno: ");
		aluno.getNota().add(scanner.nextFloat());
		
		System.out.println("Digite a nota 3 do aluno: ");
		aluno.getNota().add(scanner.nextFloat());
	
		aluno.atualizaNotaFinal();
		
		System.out.println(aluno.toString());
	}
	
	
}
