package org.fatec;

public class Cliente {
	private String nome;
	public String telefone;

	public Cliente(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		String dados = "Nome: " + nome + "\nTelefone: " + telefone;
		return dados;
	}
}