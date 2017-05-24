package br.com.bluebank;

import java.math.BigDecimal;

abstract class Operacao {

	private Conta conta;
	private BigDecimal valor;

	public Operacao(Conta conta, BigDecimal valor) {
		setConta(conta);
		setValor(valor);
	}

	public Conta getConta() {
		return conta;
	}

	protected void setConta(Conta conta) {
		this.conta = conta;
	}

	public BigDecimal getValor() {
		return valor;
	}

	protected void setValor(BigDecimal valor) {
		this.valor = valor;
	}

}