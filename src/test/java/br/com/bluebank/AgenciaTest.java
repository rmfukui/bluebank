package br.com.bluebank;

import static org.junit.Assert.*;

import org.junit.Test;

public class AgenciaTest {

	@Test
	public void testAgencia() {
		Agencia agencia = new Agencia(12345);
	
		assertEquals(Integer.valueOf(12345), agencia.getNumero());
	}

}
