package org.fatec;

public class Menu {
	// m�todos static, s�o m�todos que n�o precisam de um objeto
	// para serem executados!
	// m�todos static pertencem a classe
	// static � um modificador de comportamento
	public static void mostrarMenu() {
		System.out.println("\n*********************");
		System.out.println("Selecione a op��o desejada:");
		System.out.println("1. Cadastrar cliente");
		System.out.println("2. Editar cliente");
		System.out.println("3. Excluir cliente");
		System.out.println("4. Listar cliente");
		System.out.println("5. Tchau");
		System.out.println("*********************\n");
	}
}