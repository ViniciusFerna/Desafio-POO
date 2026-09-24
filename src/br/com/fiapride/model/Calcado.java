package br.com.fiapride.model;

public class Calcado {
	
	private int tamanho;
	
	private Marca marca;
	
	public Calcado(int tamanho, Marca marca) {
		this.tamanho = tamanho;
		this.marca = marca;
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

	public int getTamanho() {
		return tamanho;
	}

	public Marca getMarca() {
		return marca;
	}

}
