package br.com.minhaoperadora.service.config;

public enum TipoPlano {
	POS("POS"),
	CONTROLE("CONTROLE");
	
	private String nome;
	
	private TipoPlano(String nome) {
		this.setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
