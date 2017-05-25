package br.com.bluebank;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
abstract class Operacao {
	
	@Id
	@GeneratedValue
	private Long id;

	@ManyToOne
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