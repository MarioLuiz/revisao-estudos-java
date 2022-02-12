package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Arrays;

import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;

public class Teste {
	
	public static void main(String[] args) {
		
		ArrayList<Conta> listaContas =  new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(11,22);
		Conta cc1 = new ContaCorrente(12,23);
		
		listaContas.add(cc1);
		listaContas.add(cc);
		
		System.out.println(listaContas.size());
		
		Conta ref = (Conta) listaContas.get(0);
		
		System.out.println(ref.getNumero());
		
		listaContas.remove(0);
		
		System.out.println("Tamanho: " + listaContas.size());
		
		Conta cc2 = new ContaCorrente(44,44);
		Conta cc3 = new ContaCorrente(55,55);
		Conta cc4 = new ContaCorrente(66,66);
		Conta cc5 = new ContaCorrente(77,77);
		Conta cc6 = new ContaCorrente(88,88);
		Conta cc7 = new ContaCorrente(99,99);
		Conta cc8 = new ContaCorrente(1111,1111);
		Conta cc9 = new ContaCorrente(2222,2222);
		
		System.out.println("Tamanho: " + listaContas.size());
		
		listaContas.addAll(Arrays.asList(cc2,cc3,cc4,cc5,cc6,cc7,cc8,cc9));
		
		for (Object object : listaContas) {
			Conta c = (Conta) object;
			System.out.println(c);
		}
		
		System.out.println("Tamanho: " + listaContas.size());
		
		for (int i = listaContas.size() - 1; i >= 0; i--) {
			Conta c = (Conta) listaContas.get(i);
			System.out.println("Miau: " + c);
		}
		
		
		ArrayList lista = new ArrayList(26); //capacidade inicial
		lista.add("RJ");
		lista.add("SP");
		
		//outros estados
		ArrayList nova = new ArrayList(lista); //criando baseado na primeira lista
		
	}
}
