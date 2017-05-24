package br.com.bluebank;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

public class TransferenciaTest {

	@Test
	public void testTransferencia() throws Exception {
		
		
		Correntista correntista = new Correntista("Renato Fukui", "12345678910");
		Agencia agencia = new Agencia(12345);
		
		Conta contaOrigem = new Conta(correntista, agencia, "54321");
		new Deposito(contaOrigem, BigDecimal.valueOf(150));
		
		Conta contaDestino = new Conta(correntista, agencia, "67890");
		
		Transferencia transferencia = new Transferencia(contaDestino, contaOrigem, BigDecimal.valueOf(100));
		
		assertEquals(contaOrigem, transferencia.getSaque().getConta());
		assertEquals(BigDecimal.valueOf(100), transferencia.getSaque().getValor());
		
		assertEquals(contaDestino, transferencia.getDeposito().getConta());
		assertEquals(BigDecimal.valueOf(100), transferencia.getDeposito().getValor());
		
		assertEquals(BigDecimal.valueOf(100), contaDestino.getSaldo());
		assertEquals(BigDecimal.valueOf(50), contaOrigem.getSaldo());
	}

}
