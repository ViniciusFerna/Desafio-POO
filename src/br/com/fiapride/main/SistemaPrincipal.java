package br.com.fiapride.main;

import br.com.fiapride.model.Passageiro;

public class SistemaPrincipal {

	public static void main(String[] args) {
		
		Passageiro passageiro1 = new Passageiro();
		passageiro1.nome = "Ana Silva";
		passageiro1.saldo = 50.00;
		
		passageiro1.validarSaldoViagem(passageiro1.saldo, 200);
		passageiro1.validarIdade(16);
		
		passageiro1.mudarSaldo(250);
		passageiro1.validarSaldoViagem(passageiro1.saldo, 200);
	}

}
