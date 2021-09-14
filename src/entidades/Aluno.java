package entidades;

import java.util.ArrayList;
import java.util.List;

import enums.AlunoEnum;

public class Aluno extends Pessoa{
	private List<Float>notas = new ArrayList<>();
	private float nota_final = 0;
	private AlunoEnum resultado;
	private float MEDIA = 60;
	
	public Aluno() {
		
	}

	public List<Float> getNota() {
		return notas;
	}

	public void setNota(List<Float> notas) {
		this.notas = notas;
		atualizaNotaFinal();
	}

	public float getNota_final() {
		return nota_final;
	}
	
	public void atualizaNotaFinal() {
		this.nota_final=0;
		for(Float nota : this.notas) {
			this.nota_final+=nota;
		}
		if(this.nota_final >= MEDIA) {
			this.resultado = AlunoEnum.APROVADO;
		}
		else {
			this.resultado = AlunoEnum.REPROVADO;
		}
	}
	
	public String toString() {
		String retorno;
		float nota_faltante = this.MEDIA - this.nota_final;
		
		if(this.resultado == AlunoEnum.APROVADO) {
			retorno =  "Nota final: "+this.nota_final+"\n"
					+ this.resultado.getDescricao();
		}
		else {
			retorno =  "Nota final: "+this.nota_final+"\n"
					+ this.resultado.getDescricao()+"\n"
					+ "Faltaram "+nota_faltante+" pontos";
		}
		return retorno;
	}

}
