package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.model.Cliente;
import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.ContaPoupanca;

public class Teste {
	public static void main(String[] args) {
		
		System.out.println("x");
		System.out.println(3);
		System.out.println(true);
		
		Object cc = new ContaCorrente(22, 2020);
		Object cp = new ContaPoupanca(22, 32);
		Object cliente = new Cliente("Mario Luiz", "027.789.789-85", "Desenvolvedor");
		
		System.out.println(cc.toString());
		System.out.println(cp.toString());
		
		println(cliente);
	}
	
	static void println(Object referencia) {
	System.out.println(referencia.toString());
	}
}
