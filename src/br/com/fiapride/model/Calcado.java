package br.com.fiapride.model;

public abstract class Calcado {
	
	private int tamanho;
	
	private Marca marca;
	
	private String cor;
	
	public Calcado(int tamanho, Marca marca, String cor) {
		this.tamanho = tamanho;
		this.marca = marca;
		this.cor = cor;
	}
	
	public abstract int validarTamanho(int tamanhoCliente);

	public int getTamanho() {
		return tamanho;
	}

	public Marca getMarca() {
		return marca;
	}
	
	public String getCor() {
		return cor;
	}


}
