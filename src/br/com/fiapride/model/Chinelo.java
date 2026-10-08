package br.com.fiapride.model;

public class Chinelo extends Calcado {
	
	private String tipoChinelo;
	
	public Chinelo(String tipoChinelo, int tamanho, Marca marca, String cor) {
		this.tipoChinelo = tipoChinelo;
		super(tamanho, marca, cor);
	}
	
	@Override
	public int validarTamanho(int tamanhoCliente) { // Simplificado: 1 - P / 2 - M / 3 - G / 6 - True / 7 - False / 0 - Fail
		 if (tamanhoCliente <= 0) {
			 System.out.println("Apresente um valor valido");
			 return 0;
		 } else if (tamanhoCliente == getTamanho()) {
			 System.out.println("Tamanho perfeito");
			 return 6;
		 } else if (tamanhoCliente > getTamanho()) {
			 System.out.println("Esse chinelo e muito pequeno!");
			 return 7;
		 } else {
			 System.out.println("Esse chinelo e muito grande");
			 return 7;
		 }
		 	 
	}
	
	public String getTipoChinelo() {
		return tipoChinelo;
	}

}
