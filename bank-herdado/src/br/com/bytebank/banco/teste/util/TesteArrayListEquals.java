package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Arrays;

import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;

public class TesteArrayListEquals {
	
	public static void main(String[] args) {
		
		ArrayList<Conta> listaContas =  new ArrayList<Conta>();
		
		Conta cc1 = new ContaCorrente(11,22);
		Conta cc2 = new ContaCorrente(12,23);
		Conta cc3 = new ContaCorrente(12,23);
		
		listaContas.add(cc1);
		listaContas.add(cc2);
		
		System.out.println("Tamanho da lista: " + listaContas.size());
		
		boolean existe = listaContas.contains(cc3);
		
		System.out.println("Já existe ? " + existe);
				
		for (Conta conta : listaContas) {
			System.out.println(conta);
		}
		
		listaContas.remove(0);
		
		System.out.println("Tamanho: " + listaContas.size());
		
	}
}
