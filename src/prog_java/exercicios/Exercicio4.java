package prog_java.exercicios;

import java.util.Scanner;

import prog_java.entidades.Funcionario;

public class Exercicio4 {
	
	public static void main(Scanner scanner) {
		
		String nome;
		Double salario;
		Double imposto;
		int aumentarSalario;
		
		System.out.println("Digite o nome do funcion�rio: ");
		nome = scanner.next();
		
		System.out.println("Digite o salario bruto do funcion�rio: ");
		salario = scanner.nextDouble();
		
		System.out.println("Digite o valor do imposto do funcion�rio");
		imposto = scanner.nextDouble();
		
		Funcionario funcionario = new Funcionario(nome, salario, imposto);
		
		System.out.println(funcionario.toString());
		
		System.out.println("Deseja aumentar o sal�rio do funcion�rio? \n1-Sim \n2- N�o");
		aumentarSalario = scanner.nextInt();
		
		if(aumentarSalario == 1) {
			System.out.println("Digite o valor em porcentagem que deseja aumentar: ");
			funcionario.aumentarSalario(scanner.nextDouble());
			
			System.out.println(funcionario.toString());
		}	
	}	
}
