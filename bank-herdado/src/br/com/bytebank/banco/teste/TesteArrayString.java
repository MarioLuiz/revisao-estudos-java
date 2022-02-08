package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.ContaPoupanca;

public class TesteArrayString {

	public static void main(String[] args) {
		
		System.out.println("Acesando argumentos passados no método main!!");
		
		for (int i = 0; i < args.length; i++) {
			System.out.println( (i+1) + " : Argumento -> " + args[i]);
		}
	}

}
