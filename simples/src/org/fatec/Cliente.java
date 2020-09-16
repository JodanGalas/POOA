package org.fatec;

public class Cliente {
	public String nome;
	public String telefone;

	@Override
	public String toString() {
		String delimitador = "########################";
		String info = "Nome: " + nome + "\nTelefone: " + telefone;
		return "\n" + delimitador + "\n" + info + "\n" + delimitador + "\n";
	}
}