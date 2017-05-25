package br.com.bluebank;

import java.math.BigDecimal;

import javax.persistence.Entity;

@Entity
public class Deposito extends Operacao {
	public Deposito(Conta conta, BigDecimal valor) {
		super(conta, valor);
		
		getConta().adiciona(valor);
	}
	
}
