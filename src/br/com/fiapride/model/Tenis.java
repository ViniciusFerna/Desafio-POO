package br.com.fiapride.model;

public class Tenis extends Calcado {

	private String modelo;
	
	private String cor;
	
	
	public Tenis(String modelo, String cor, int tamanho, Marca marca) {
		this.modelo = modelo;
		this.cor = cor;
		super(tamanho, marca);
	}
	

	public String trocarModeloTenis(String novoModelo) {
		if (novoModelo != this.modelo) {
			this.modelo = novoModelo;
			System.out.println("Modelo trocado com sucesso");
			return this.modelo;
		} else {
			System.out.println("O novo modelo nao pode ser o mesmo");
			return null;
		}
	}
	
	
	public String getModelo() {
		return this.modelo;
	}
	
	public String getCor() {
		return this.cor;
	}


}
