package enums;

public enum AlunoEnum {

	APROVADO("APROVADO"),
	REPROVADO("REPROVADO");
	
	private String descricao;
	
	AlunoEnum(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
}
