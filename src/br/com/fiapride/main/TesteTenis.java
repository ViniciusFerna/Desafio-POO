package br.com.fiapride.main;

import br.com.fiapride.model.Marca;
import br.com.fiapride.model.Passageiro;
import br.com.fiapride.model.Tenis;

public class TesteTenis {

	public static void main(String[] args) {
		Passageiro passageiro1 = new Passageiro("Ana Silva", "47543452100", 500);
		passageiro1.setTamanhoCalcado(2);
		
		passageiro1.validarSaldoViagem(passageiro1.getSaldo(), 200);
		passageiro1.validarIdade(16);
		
		passageiro1.setSaldo(250);
		passageiro1.validarSaldoViagem(passageiro1.getSaldo(), 200);
		
		System.out.println("----------------------------------");
		
		Marca marca1 = new Marca("Adidas", "Alemanha", true, "1234343");
		
		Tenis tenis1 = new Tenis("Yeezy 350", "Cinza", 2, marca1);
		
		System.out.println(tenis1.getModelo());
		
		tenis1.trocarModeloTenis("Yeezy FoamRunner");
		tenis1.validarTamanho(passageiro1.getTamanhoCalcado());
		
		System.out.println(tenis1.getModelo());
		
		System.out.println("----------------------------------");
		
		Marca marca2 = new Marca("Nike", "Estados Unidos da América", false, "124344");
		
		Tenis tenis2 = new Tenis("Yeezy 450", "bege", 1, marca2);
		
		Passageiro passageiro2 = new Passageiro("Pablo", "434546767755", 0);
		passageiro2.setTamanhoCalcado(1);
		
		if (tenis2.validarTamanho(passageiro2.getTamanhoCalcado()) == 6) {
			System.out.println("Pode comprar");
		}
		
		System.out.println("----------------------------------");
		
		tenis2.validarTamanho(-2);
		
		
		

	}

}
