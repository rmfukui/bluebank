package br.com.bluebank;

import java.math.BigDecimal;

public class Deposito {
	private Conta conta;
	private BigDecimal valor;
	
	public Deposito(Conta conta, BigDecimal valor) {
		setConta(conta);
		setValor(valor);
		
		conta.adiciona(valor);
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
