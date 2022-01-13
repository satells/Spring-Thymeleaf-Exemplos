package com.exemplos.model;

public class Exemplo {

	private String descricao;
	private String url;

	public Exemplo(String descricao, String url) {
		this.descricao = descricao;
		this.url = url;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
