package br.com.bluebank;

import static org.junit.Assert.*;

import org.junit.Test;

public class CorrentistaTest {

	@Test
	public void testCorrentista() {
		Correntista correntista = new Correntista("Renato Fukui", "12345678910");
		
		assertEquals("Renato Fukui", correntista.getNome());
		assertEquals("12345678910", correntista.getCpf());
	}

}
