package br.com.bluebank;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Agencia {
	
	@Id
	@GeneratedValue
	private Long id;
	
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
