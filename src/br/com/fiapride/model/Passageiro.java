package br.com.fiapride.model;

public class Passageiro {
	
	private String nome;
	
	private String cpf;
	
	private double saldo;
	
	private int tamanhoCalcado;
	
	public Passageiro(String nome, String cpf, double saldo) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.setSaldo(saldo);
	}
	
	public boolean validarSaldoViagem(double saldo, double valor) {
		if (saldo >= valor) {
			System.out.println("Pode pagar a viagem");
			return true; //Caso o usuário tenha saldo suficiente para a viagem
		} else {
			System.out.println("Não pode pagar a viagem");
			return false; //Caso não tenha saldo
		}
		
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
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		int caracteresTotais = cpf.length();
		if (caracteresTotais == 11) {
			this.cpf = cpf;
		} else {
			System.out.println("CPF inválido (use apenas números)");
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		if (saldo >= 0) {
			this.saldo = saldo;
		} else {
			System.out.println("O saldo não pode ser negativo");
		}
		
	}

	public int getTamanhoCalcado() {
		return tamanhoCalcado;
	}

	public void setTamanhoCalcado(int tamanhoCalcado) {
		this.tamanhoCalcado = tamanhoCalcado;
	}


}
