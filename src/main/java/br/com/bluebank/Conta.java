package br.com.bluebank;

import java.math.BigDecimal;

public class Conta {

	Correntista correntista;
	Agencia agencia;
	String numero;
	private BigDecimal saldo;
	
	public Conta(Correntista correntista, Agencia agencia, String numeroConta) {
		setCorrentista(correntista);
		setAgencia(agencia);
		setNumero(numeroConta);
		setSaldo(new BigDecimal(0.0));
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

	public String getNumero() {
		return numero;
	}

	private void setNumero(String numero) {
		this.numero = numero;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public void subtrai(BigDecimal valor) throws Exception {
		if (valor.doubleValue() > getSaldo().doubleValue()) {
			throw new Exception("Saldo insuficiente.");
		}
		
		setSaldo(getSaldo().subtract(valor));		
	}

	public void adiciona(BigDecimal valor) {
		setSaldo(getSaldo().add(valor));
	}

}
