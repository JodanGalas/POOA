package org.fatec;

public class Menu {
	// métodos static, são métodos que não precisam de um objeto
	// para serem executados!
	// métodos static pertencem a classe
	// static é um modificador de comportamento
	public static void mostrarMenu() {
		System.out.println("\n*********************");
		System.out.println("Selecione a opção desejada:");
		System.out.println("1. Cadastrar cliente");
		System.out.println("2. Editar cliente");
		System.out.println("3. Excluir cliente");
		System.out.println("4. Listar cliente");
		System.out.println("5. Tchau");
		System.out.println("*********************\n");
	}
}