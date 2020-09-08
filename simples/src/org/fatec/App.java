package org.fatec;

public class App {
	public static void main(String[] args) {
		// tudo em java é herança de uma classe chamada Objeto
		// Object é fornecido por padrão pela maquina virtual
		Cliente c = new Cliente("Gerson", "12 - 986564735");
		// toda vez que se imprimi a referencia de um objeto
		// implicitamente é chamado um método de nome toString()
		System.out.println(c);
	}
}