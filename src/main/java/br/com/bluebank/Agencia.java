package br.com.bluebank;

public class Agencia {
	private Integer numero;

	public Agencia(Integer numero) {
		setNumero(numero);
	}
	
	public Integer getNumero() {
		return numero;
	}

	private void setNumero(Integer numero) {
		this.numero = numero;
	}	
}
