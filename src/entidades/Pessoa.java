package entidades;

import java.util.List;

public class Pessoa {

	private String nome;
	private int idade;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public static Pessoa calcularMaisVelho(List<Pessoa> pessoas) {
		Pessoa pessoaMV = new Pessoa();
		
		for(Pessoa pessoa : pessoas) {
			if(pessoa.getIdade() > pessoaMV.getIdade()) {
				pessoaMV = pessoa;
			}
		}
		return pessoaMV;
	}
	
	public String toString() {
		return "Nome: "+this.nome+"\n"
				+"Idade: "+this.idade+"\n";
	}
}
