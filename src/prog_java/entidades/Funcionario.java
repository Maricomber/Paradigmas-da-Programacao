package prog_java.entidades;

import java.util.List;

public class Funcionario {

	private String nome;
	private Double salario_bruto;
	private Double salario_liquido;
	private Double imposto;
	
	public Funcionario() {
		
	}
	
	public Funcionario(String nome, Double salario_bruto, Double imposto) {
		this.nome = nome;
		this.salario_bruto = salario_bruto;
		this.imposto = imposto;
		this.salario_liquido = salario_bruto - imposto;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSalario_bruto() {
		return salario_bruto;
	}
	public void setSalario_bruto(Double salario_bruto) {
		this.salario_bruto = salario_bruto;
		if(this.imposto != null) {
			atualizaSalario();
		}
	}
	public Double getSalario_liquido() {
		return salario_liquido;
	}
	public void setSalario_liquido(Double salario_liquido) {
		this.salario_liquido = salario_liquido;
	}
	public Double getImposto() {
		return imposto;
	}
	public void setImposto(Double imposto) {
		this.imposto = imposto;
		atualizaSalario();
	}
	
	private void atualizaSalario() {
		this.salario_liquido = salario_bruto - imposto;
	}
	
	public static Double salarioMedio(List<Funcionario>funcionarios) {
		Double salarioMedio = 0.0;
		
		for(Funcionario funcionario : funcionarios) {
			salarioMedio += funcionario.getSalario_bruto();
		}
		salarioMedio = salarioMedio / funcionarios.size();
		return salarioMedio;
	}
	
	public Double aumentarSalario(Double porcentagem) {
		Double valor_final = 0.0;
		
		valor_final = (this.salario_bruto *porcentagem)/100 + this.salario_bruto;
		setSalario_bruto(valor_final);
		
		return valor_final;
	}
	
	public String toString() {
		return "Funcionário: "+this.nome+", "
				+ "R$: "+this.salario_liquido+"\n";
		
	}
}
