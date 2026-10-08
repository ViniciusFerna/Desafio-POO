package br.com.fiapride.model;

public class Calcado {
	
	private int tamanho;
	
	private Marca marca;
	
	private String cor;
	
	public Calcado(int tamanho, Marca marca, String cor) {
		this.tamanho = tamanho;
		this.marca = marca;
		this.cor = cor;
	}
	
	public int validarTamanho(int tamanhoCliente) { // 1 - P / 2 - M / 3 - G / 6 - True / 7 - False / 0 - Fail
		System.out.println("Validação não definida para um calçado genérico");
		  return 0;
	}

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
