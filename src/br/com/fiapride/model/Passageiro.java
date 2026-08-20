package br.com.fiapride.model;

public class Passageiro {
	
	public String nome;
	
	public double saldo;
	
	public int tamanhoCalcado;
	
	public boolean validarSaldoViagem(double saldo, double valor) {
		if (saldo >= valor) {
			System.out.println("Pode pagar a viagem");
			return true; //Caso o usuário tenha saldo suficiente para a viagem
		} else {
			System.out.println("Não pode pagar a viagem");
			return false; //Caso não tenha saldo
		}
		
	}
	
	public void mudarSaldo(double novoSaldo) {
		this.saldo = novoSaldo; //Setter para mudar o valor do saldo
	}
	
	public boolean validarIdade(int idade) {
		if (idade >= 18) {
			System.out.println("Passageiro tem mais de 18 anos");
			return true; //Caso usuário tenha idade suficiente para pedir
		} else {
			System.out.println("Passageiro não tem mais de 18 anos");
			return false; //Caso não tenha
		}
	}

}
