package br.com.fiapride.model;

public class Tenis extends Calcado {

	private String modelo;
	
	
	public Tenis(String modelo, String cor, int tamanho, Marca marca) {
		this.modelo = modelo;
		super(tamanho, marca, cor);
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
	
	@Override
	public int validarTamanho(int tamanhoCliente) { // Simplificado: 1 - P / 2 - M / 3 - G / 6 - True / 7 - False / 0 - Fail
		 if (tamanhoCliente <= 0) {
			 System.out.println("Apresente um valor valido");
			 return 0;
		 } else if (tamanhoCliente == getTamanho()) {
			 System.out.println("Tamanho perfeito");
			 return 6;
		 } else if (tamanhoCliente > getTamanho()) {
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


}
