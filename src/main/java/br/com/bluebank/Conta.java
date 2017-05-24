package br.com.bluebank;

import java.math.BigDecimal;

public class Conta {

	Correntista correntista;
	Agencia agencia;
	Integer numero;
	private BigDecimal saldo;
	
	public Conta(Correntista correntista, Agencia agencia, Integer numeroConta) {
		setCorrentista(correntista);
		setAgencia(agencia);
		setNumero(numeroConta);
		setSaldo(new BigDecimal(0));
	}
	
	public Correntista getCorrentista() {
		return correntista;
	}

	private void setCorrentista(Correntista correntista) {
		this.correntista = correntista;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	private void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public Integer getNumero() {
		return numero;
	}

	private void setNumero(Integer numero) {
		this.numero = numero;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

}
