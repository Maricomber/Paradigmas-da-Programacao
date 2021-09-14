package prog_java;

import java.util.Scanner;

import prog_java.exercicios.Exercicio1;
import prog_java.exercicios.Exercicio2;
import prog_java.exercicios.Exercicio3;
import prog_java.exercicios.Exercicio4;
import prog_java.exercicios.Exercicio5;


public class ExercicioMain {

	public static void main(String[] args) {		
		Integer opcao;
		Scanner scanner = new Scanner(System.in);
		
		do {
			
			System.out.println("\nVoc� deseja executar quais quest�es? \n"
					+ "1- Quest�o digite: 1 \n"
					+ "2- Quest�o digite: 2 \n"
					+ "3- Quest�o digite: 3 \n"
					+ "4- Quest�o digite: 4 \n"
					+ "5- Quest�o digite: 5 \n"
					+ "0- Sair");
			
			opcao = scanner.nextInt();
			
			switch (opcao) {
			case 1: {
				Exercicio1.main(scanner);;
				break;
			}
			case 2: {
				Exercicio2.main(scanner);		
				break;
					}
			case 3: {
				Exercicio3.main(scanner);
				break;
			}
			case 4: {
				Exercicio4.main(scanner);
				break;
			}
			case 5: {
				Exercicio5.main(scanner);
				break;
			}
			case 0: {
				break;
			}

			default:
				System.out.println("Valor inexperado: "+opcao);
			}
			
		}while(opcao !=0);
		
		scanner.close();
	}

}
