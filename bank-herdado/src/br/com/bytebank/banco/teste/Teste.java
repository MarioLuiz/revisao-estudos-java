package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.GuardadorDeContas;

public class Teste {

	public static void main(String[] args) {
		
	
	GuardadorDeContas guardador = new GuardadorDeContas();
	
	Conta cc = new ContaCorrente(11,22);
	Conta cc1 = new ContaCorrente(12,23);
	
	guardador.adiciona(cc);
	guardador.adiciona(cc1);
	
	int tamanho =  guardador.getQuantidadeDeElementos();
	
	System.out.println("Tamanho array: " + tamanho);
	
	Conta ref = guardador.getReferencia(1);
	System.out.println(ref.getNumero());
	}
}
