package br.com.bluebank;

public class Correntista {
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
