package br.com.bluebank;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

public class SaqueTest {

	@Test
	public void testSaque() throws Exception {
		Correntista correntista = new Correntista("Renato Fukui", "12345678910");
		Conta conta = new Conta(correntista, new Agencia(12345), "54321");
		
		new Deposito(conta, BigDecimal.valueOf(150));
		
		Saque saque = new Saque(conta, BigDecimal.valueOf(100));
		
		assertEquals(conta, saque.getConta());
		assertEquals(BigDecimal.valueOf(100), saque.getValor());
		
		assertEquals(BigDecimal.valueOf(50), conta.getSaldo());
	}
	
	@Test (expected = Exception.class)
	public void testSaldoInsuficiente() throws Throwable {
		Correntista correntista = new Correntista("Renato Fukui", "12345678910");
		Conta conta = new Conta(correntista, new Agencia(12345), "54321");
		
		new Deposito(conta, BigDecimal.valueOf(90));
		
		try {
			new Saque(conta, BigDecimal.valueOf(100));
		} catch (Exception e) {
			assertEquals("Saldo insuficiente.", e.getMessage());
			throw e;
		}
	}

}
