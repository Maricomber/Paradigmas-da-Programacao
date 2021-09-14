package exercicios;

import java.util.Scanner;

import entidades.Funcionario;

public class Exercicio4 {
	
	public static void main(Scanner scanner) {
		
		String nome;
		Double salario;
		Double imposto;
		int aumentarSalario;
		
		System.out.println("Digite o nome do funcionário: ");
		nome = scanner.next();
		
		System.out.println("Digite o salario bruto do funcionário: ");
		salario = scanner.nextDouble();
		
		System.out.println("Digite o valor do imposto do funcionário");
		imposto = scanner.nextDouble();
		
		Funcionario funcionario = new Funcionario(nome, salario, imposto);
		
		System.out.println(funcionario.toString());
		
		System.out.println("Deseja aumentar o salário do funcionário? \n1-Sim \n2- Não");
		aumentarSalario = scanner.nextInt();
		
		if(aumentarSalario == 1) {
			System.out.println("Digite o valor em porcentagem que deseja aumentar: ");
			funcionario.aumentarSalario(scanner.nextDouble());
			
			System.out.println(funcionario.toString());
		}	
	}	
}
