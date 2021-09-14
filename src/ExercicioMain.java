import java.util.Scanner;

import exercicios.Exercicio1;
import exercicios.Exercicio2;
import exercicios.Exercicio3;
import exercicios.Exercicio4;
import exercicios.Exercicio5;

public class ExercicioMain {

	public static void main(String[] args) {		
		Integer opcao;
		Scanner scanner = new Scanner(System.in);
		
		do {
			
			System.out.println("\nVocê deseja executar quais questões? \n"
					+ "1- Questão digite: 1 \n"
					+ "2- Questão digite: 2 \n"
					+ "3- Questão digite: 3 \n"
					+ "4- Questão digite: 4 \n"
					+ "5- Questão digite: 5 \n"
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
