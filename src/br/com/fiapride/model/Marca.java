package br.com.fiapride.model;

public class Marca {

	private String nomeMarca;
	
	private String paisOrigem;
	
	private boolean presenteNoBrasil;
	
	private String cnpj;
	
	public Marca(String nomeMarca, String paisDeOrigem, boolean presenteNoBrasil, String cnpj) {
		this.nomeMarca = nomeMarca;
		this.paisOrigem = paisDeOrigem;
		this.presenteNoBrasil = presenteNoBrasil;
		this.setCnpj(cnpj);
	}
	

	public String getNomeMarca() {
		return nomeMarca;
	}


	public String getPaisOrigem() {
		return paisOrigem;
	}

	public boolean isPresenteNoBrasil() {
		return presenteNoBrasil;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		if (this.isPresenteNoBrasil() == true) {
			this.cnpj = cnpj;
		} else {
			System.out.println("A empresa não está presente no Brasil.");
		}
	}
}
