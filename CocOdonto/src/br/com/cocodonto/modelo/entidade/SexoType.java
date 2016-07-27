package br.com.cocodonto.modelo.entidade;

public enum SexoType {

	M ("Masculino")
	,F ("Feminino");
	
	private String descricao;

//Construtor
	private SexoType(String descricao) {
		this.descricao = descricao;
	}

//Métodos
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
		
}
