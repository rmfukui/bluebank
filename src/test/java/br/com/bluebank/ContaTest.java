package br.com.bluebank;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContaTest {

	@Test
	public void testConta() {
		Correntista correntista = new Correntista("Renato Fukui", "12345678910");
		Agencia agencia = new Agencia(12345);
		Conta conta = new Conta(correntista, agencia, 54321);
		
		assertEquals(correntista, conta.getCorrentista());
		assertEquals(agencia, conta.getAgencia());
		assertEquals(Integer.valueOf(54321), conta.getNumero());
		assertEquals(Double.valueOf(0.0), conta.getSaldo());
	}

}
