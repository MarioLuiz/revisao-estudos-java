package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Arrays;

import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;

public class Teste {
	
	public static void main(String[] args) {
		
		ArrayList lista =  new ArrayList();
		
		Conta cc = new ContaCorrente(11,22);
		Conta cc1 = new ContaCorrente(12,23);
		
		lista.add(cc1);
		lista.add(cc);
		
		System.out.println(lista.size());
		
		Conta ref = (Conta) lista.get(0);
		
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		
		System.out.println("Tamanho: " + lista.size());
		
		Conta cc2 = new ContaCorrente(44,44);
		Conta cc3 = new ContaCorrente(55,55);
		Conta cc4 = new ContaCorrente(66,66);
		Conta cc5 = new ContaCorrente(77,77);
		
		lista.addAll(Arrays.asList(cc2,cc3,cc4,cc5));
		
		for (Object object : lista) {
			Conta c = (Conta) object;
			System.out.println(c);
		}
		
	}
}
