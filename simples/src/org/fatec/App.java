package org.fatec;

public class App {
	public static void main(String[] args) {
		// tudo em java � heran�a de uma classe chamada Objeto
		// Object � fornecido por padr�o pela maquina virtual
		Cliente c = new Cliente("Gerson", "12 - 986564735");
		// toda vez que se imprimi a referencia de um objeto
		// implicitamente � chamado um m�todo de nome toString()
		System.out.println(c);
	}
}