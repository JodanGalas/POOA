package org.fatec;

public class Menu {
	// static é um modificador de comportamento
	// todo metodo static pode ser executado diretamente pela classe, sem
	// precisar de um objeto!
	public static void imprimirMenu() {
		System.out.println("#### Menu ####");
		System.out.println("1 - Inserir cliente");
		System.out.println("2 - Listar clientes");
		System.out.println("3 - Editar cliente");
		System.out.println("4 - Excluir cliente");
		System.out.println("0 - Sair");
	}
}