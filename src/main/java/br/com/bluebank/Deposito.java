package br.com.bluebank;

import java.math.BigDecimal;

public class Deposito extends Operacao {
	public Deposito(Conta conta, BigDecimal valor) {
		super(conta, valor);
		
		getConta().adiciona(valor);
	}
	
}
