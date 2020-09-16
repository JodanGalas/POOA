package org.fatec;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		// iniciando o controle para receber as informações pelo teclado
		Controle controle = new Controle();

		// lista para armazenar todos os cadastros de cada cliente
		List<Cliente> cadastros = new ArrayList<>();

		// variável de controle para sair do sistema quando escolhido
		int escolha = 0;

		// estrutura de repetição que irá manter o sistema ativo,
		// enquanto for desejado
		while (escolha != 5) {
			Menu.mostrarMenu();
			escolha = controle.opcao();

			// se a opção digitada for 1, o usuário escolheu
			// cadastrar um cliente
			if (escolha == 1) {
				Cliente c = new Cliente();
				System.out.println("Por favor insira o nome do cliente:");
				c.nome = controle.texto();
				System.out.println("Por favor insira o telefone:\n");
				c.telefone = controle.texto();
				cadastros.add(c);
			}

			// se a opção for 4, a escolha foi listar a lista com todos os
			// clientes
			if (escolha == 4) {
				// expressao lambda, 'pessoa' aqui é uma variável
				// poderia receber qualquer nome como: x, y, clientes, etc...
				cadastros.forEach(pessoa -> System.out.println(pessoa));
			}

		}
		System.out.println("Obrigado e até a próxima");
	}
}