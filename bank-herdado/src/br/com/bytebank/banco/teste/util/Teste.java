package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class Teste {
	public static void main(String[] args) {
		
		int[] idades =  new int[42];
		String[] nomes = new String[42];
		
		//Tipo primitivo
		int idade = 29;
		
		// Classe referencia
		Integer idadeRef = Integer.valueOf(29); // autoboxing
		int valor = idadeRef.intValue(); // unboxing
		
		// Lista só podem guardar referencias
		// quando se coloca um tipo primitivo nelas
		// As listas atumaticamente fazem a conversão do primitivo
		// Para uma classe que o representa (AutoBoxing)
		List<Integer> numeros =  new ArrayList<Integer>();
		
		String s = args[0];
		
		if(!s.isEmpty()) {
			//Integer numero = Integer.valueOf(s);
			int numero =  Integer.parseInt(s);
			System.out.println("Numero no args: " + numero);
		}
		
		numeros.add(30); // AutoBoxing
		numeros.add(idade); // AutoBoxing
		
		numeros.add(idadeRef);
	}
}
