package br.com.bluebank;

import java.math.BigDecimal;

public class Transferencia {
	private Saque saque;
	private Deposito deposito;
	
	public Transferencia(Conta contaDestino, Conta contaOrigem, BigDecimal valor) throws Exception {
		setSaque(new Saque(contaOrigem, valor));
		setDeposito(new Deposito(contaDestino, valor));
	}

	public Saque getSaque() {
		return saque;
	}

	private void setSaque(Saque saque) {
		this.saque = saque;
	}

	public Deposito getDeposito() {
		return deposito;
	}

	private void setDeposito(Deposito deposito) {
		this.deposito = deposito;
	}
	
}
