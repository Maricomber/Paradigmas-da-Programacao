package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Pessoa;

public class Exercicio1 {

	public static void main(Scanner scanner) {
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		Pessoa pessoa = new Pessoa();
				
		System.out.println("Digite o nome da primeira pessoa: ");
		pessoa.setNome(scanner.next());
		
		System.out.println("Digite a idade do primeira pessoa: ");
		pessoa.setIdade(scanner.nextInt());
		
		pessoas.add(pessoa);
		pessoa = new Pessoa();
		
		System.out.println("Digite o nome do segunda pessoa: ");
		pessoa.setNome(scanner.next());
		
		System.out.println("Digite a idade do segunda pessoa: ");
		pessoa.setIdade(scanner.nextInt());
		
		pessoas.add(pessoa);
		
		for(int i = 0; i < pessoas.size();i++) {
			int lpessoa = i+1;
			System.out.println("Dados da "+lpessoa+" pessoa: ");
			System.out.println(pessoas.get(i).toString());
		}
		System.out.println("A pessoa mais velha é: "+Pessoa.calcularMaisVelho(pessoas).getNome());
		
	}
	
	
	
}
