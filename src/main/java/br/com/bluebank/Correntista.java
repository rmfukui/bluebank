package br.com.bluebank;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Correntista {
	
	@Id
	@GeneratedValue
	private Long id;	
	
	private String nome;
	
	private String cpf;
	
	public Correntista(String nome, String string) {
		setNome(nome);
		setCpf(string);
	}

	public String getNome() {
		return nome;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	private void setCpf(String string) {
		this.cpf = string;
	}
}
