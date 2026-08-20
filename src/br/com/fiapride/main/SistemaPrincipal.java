package br.com.fiapride.main;

import br.com.fiapride.model.Passageiro;
import br.com.fiapride.model.Tenis;

public class SistemaPrincipal {

	public static void main(String[] args) {
		
		Passageiro passageiro1 = new Passageiro();
		passageiro1.nome = "Ana Silva";
		passageiro1.saldo = 50.00;
		passageiro1.tamanhoCalcado = 1;
		
		passageiro1.validarSaldoViagem(passageiro1.saldo, 200);
		passageiro1.validarIdade(16);
		
		passageiro1.mudarSaldo(250);
		passageiro1.validarSaldoViagem(passageiro1.saldo, 200);
		
		System.out.println("----------------------------------");
		
		Tenis tenis1 = new Tenis();
		tenis1.modelo = "Yeezy 350";
		tenis1.cor = "Cinza";
		tenis1.tamanho = 2;
		
		System.out.println(tenis1.modelo);
		
		tenis1.trocarModeloTenis("Yeezy FoamRunner");
		tenis1.validarTamanho(passageiro1.tamanhoCalcado);
		
		System.out.println(tenis1.modelo);
		
		System.out.println("----------------------------------");
		
		Tenis tenis2 = new Tenis();
		tenis2.modelo = "Yeezy 450";
		tenis2.cor = "bege";
		tenis2.tamanho = 1;
		
		Passageiro passageiro2 = new Passageiro();
		passageiro2.nome = "Pablo";
		passageiro2.saldo = 0.00;
		passageiro2.tamanhoCalcado = 1;
		
		if (tenis2.validarTamanho(passageiro2.tamanhoCalcado) == 6) {
			System.out.println("Pode comprar");
		}
		
		System.out.println("----------------------------------");
		
		tenis2.validarTamanho(-2);
		
		
		
		
	}

}
