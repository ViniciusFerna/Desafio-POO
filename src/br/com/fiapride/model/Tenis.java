package br.com.fiapride.model;

public class Tenis {

	private String modelo;
	
	private String cor;
	
	private int tamanho;
	
	private Marca marca;
	
	public Tenis(String modelo, String cor, int tamanho, Marca marca) {
		this.trocarModeloTenis(modelo);
		this.cor = cor;
		this.tamanho = tamanho;
		this.marca = marca;
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
	
	
	public int validarTamanho(int tamanhoCliente) { // Simplificado: 1 - P / 2 - M / 3 - G / 6 - True / 7 - False / 0 - Fail
		 if (tamanhoCliente <= 0) {
			 System.out.println("Apresente um valor valido");
			 return 0;
		 } else if (tamanhoCliente == this.tamanho) {
			 System.out.println("Tamanho perfeito");
			 return 6;
		 } else if (tamanhoCliente > this.tamanho) {
			 System.out.println("Esse tenis e muito pequeno!");
			 return 7;
		 } else {
			 System.out.println("Esse tenis e muito grande");
			 return 7;
		 }
		 	 
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public String getCor() {
		return this.cor;
	}

	public int getTamanho() {
		return this.tamanho;
	}
	
	public Marca getMarca() {
		return this.marca;
	}


}
