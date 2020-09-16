package org.fatec;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		// iniciando o controle para receber as informa��es pelo teclado
		Controle controle = new Controle();

		// lista para armazenar todos os cadastros de cada cliente
		List<Cliente> cadastros = new ArrayList<>();

		// vari�vel de controle para sair do sistema quando escolhido
		int escolha = 0;

		// estrutura de repeti��o que ir� manter o sistema ativo,
		// enquanto for desejado
		while (escolha != 5) {
			Menu.mostrarMenu();
			escolha = controle.opcao();

			// se a op��o digitada for 1, o usu�rio escolheu
			// cadastrar um cliente
			if (escolha == 1) {
				Cliente c = new Cliente();
				System.out.println("Por favor insira o nome do cliente:");
				c.nome = controle.texto();
				System.out.println("Por favor insira o telefone:\n");
				c.telefone = controle.texto();
				cadastros.add(c);
			}

			// se a op��o for 4, a escolha foi listar a lista com todos os
			// clientes
			if (escolha == 4) {
				// expressao lambda, 'pessoa' aqui � uma vari�vel
				// poderia receber qualquer nome como: x, y, clientes, etc...
				cadastros.forEach(pessoa -> System.out.println(pessoa));
			}

		}
		System.out.println("Obrigado e at� a pr�xima");
	}
}