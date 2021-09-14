package prog_java.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import prog_java.entidades.Funcionario;

public class Exercicio2 {
	
	public static void main(Scanner scanner) {
		
		Funcionario funcionario1 = new Funcionario();
		Funcionario funcionario2 = new Funcionario();
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
		System.out.println("Digite o nome do primeiro funcion�rio: ");
		funcionario1.setNome(scanner.next());
		
		System.out.println("Digite o salario do primeiro funcion�rio: ");
		funcionario1.setSalario_bruto(scanner.nextDouble());
		
		System.out.println("Digite o nome do segundo funcion�rio: ");
		funcionario2.setNome(scanner.next());
		
		System.out.println("Digite o salario do segundo funcion�rio: ");
		funcionario2.setSalario_bruto(scanner.nextDouble());
		
		funcionarios.add(funcionario1);
		funcionarios.add(funcionario2);
		
		System.out.println("O salario m�dio �: "+Funcionario.salarioMedio(funcionarios));
		
	}
}
