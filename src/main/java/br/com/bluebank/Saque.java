package br.com.bluebank;

import java.math.BigDecimal;

import javax.persistence.Entity;

@Entity	
public class Saque extends Operacao {
	public Saque(Conta conta, BigDecimal valor) throws Exception {
		super(conta, valor);
		
		getConta().subtrai(valor);
	}

}
