package br.com.bluebank;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

public class DepositoTest {

	@Test
	public void testDeposito() {
		Correntista correntista = new Correntista("Renato Fukui", "12345678910");
		Conta conta = new Conta(correntista, new Agencia(12345), "54321");
		Deposito deposito = new Deposito(conta, BigDecimal.valueOf(100));
		
		assertEquals(conta, deposito.getConta());
		assertEquals(BigDecimal.valueOf(100), deposito.getValor());
		
		assertEquals(BigDecimal.valueOf(100), conta.getSaldo());
	}

}
