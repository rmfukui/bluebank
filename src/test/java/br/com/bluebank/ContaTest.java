package br.com.bluebank;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

public class ContaTest {

	@Test
	public void testConta() {
		Correntista correntista = new Correntista("Renato Fukui", "12345678910");
		Agencia agencia = new Agencia(12345);
		Conta conta = new Conta(correntista, agencia, "54321");
		
		assertEquals(correntista, conta.getCorrentista());
		assertEquals(agencia, conta.getAgencia());
		assertEquals("54321", conta.getNumero());
		assertEquals(BigDecimal.valueOf(0), conta.getSaldo());
	}

}
