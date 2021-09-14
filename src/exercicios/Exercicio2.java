package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Funcionario;

public class Exercicio2 {
	
	public static void main(Scanner scanner) {
		
		Funcionario funcionario1 = new Funcionario();
		Funcionario funcionario2 = new Funcionario();
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
		System.out.println("Digite o nome do primeiro funcionário: ");
		funcionario1.setNome(scanner.next());
		
		System.out.println("Digite o salario do primeiro funcionário: ");
		funcionario1.setSalario_bruto(scanner.nextDouble());
		
		System.out.println("Digite o nome do segundo funcionário: ");
		funcionario2.setNome(scanner.next());
		
		System.out.println("Digite o salario do segundo funcionário: ");
		funcionario2.setSalario_bruto(scanner.nextDouble());
		
		funcionarios.add(funcionario1);
		funcionarios.add(funcionario2);
		
		System.out.println("O salario médio é: "+Funcionario.salarioMedio(funcionarios));
		
	}
}
