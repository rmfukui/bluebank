package br.com.bluebank;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Transferencia {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne
	private Saque saque;
	
	@ManyToOne
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
