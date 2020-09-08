package org.fatec;

public class App {
	public static void main(String[] args) {

		Menu.imprimirMenu();
		Controle controle = new Controle();
		int escolha = controle.opcao();
		
		while (escolha != 0) {
			if(escolha == 1) {
				controle = new Controle();
				System.out.println("Por favor insira os dados do cliente");
				String nome = controle.texto(); 
				String telefone = controle.texto();
				Cliente cliente = new Cliente(nome, telefone);
			}
		}
		
		
//		Cliente c = new Cliente("dsa", "00");
//		System.out.println(c);
//		c = null;
//		System.gc();

		// tudo em java é herança de uma classe chamada Objeto
		// Object é fornecido por padrão pela maquina virtual
		// Cliente c = new Cliente("Gerson", "12 - 986564735");
		// toda vez que se imprimi a referencia de um objeto
		// implicitamente é chamado um método de nome toString()
		// System.out.println(c);
	}
}