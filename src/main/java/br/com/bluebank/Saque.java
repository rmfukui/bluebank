package br.com.bluebank;

import java.math.BigDecimal;

public class Saque {
	Conta conta;
	BigDecimal valor;
	
	public Saque(Conta conta, BigDecimal valor) throws Exception {
		setConta(conta);
		setValor(valor);
		
		conta.subtrai(valor);
	}
	
	public Conta getConta() {
		return conta;
	}
	
	private void setConta(Conta conta) {
		this.conta = conta;
	}

	public BigDecimal getValor() {
		return valor;
	}

	private void setValor(BigDecimal valor) {
		this.valor = valor;
	}

}
