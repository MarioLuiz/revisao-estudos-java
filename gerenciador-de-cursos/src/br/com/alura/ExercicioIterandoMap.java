package br.com.alura;

import java.util.HashMap;
import java.util.Map;

public class ExercicioIterandoMap {

	public static void main(String[] args) {
		Map<Integer, String> pessoas = new HashMap<>();

		pessoas.put(21, "Leonardo Cordeiro");
		pessoas.put(27, "Fabio Pimentel");
		pessoas.put(19, "Silvio Mattos");
		pessoas.put(23, "Romulo Henrique");
		
		System.out.println("Utilizando forEach");
		// Usando ForEach
		pessoas.forEach((k, v) -> System.out.println(k + "  = " + v));
		System.out.println();

		System.out.println("Usando HashMap com Stream");
		// Usando HashMap com Stream
		pessoas.entrySet().stream().forEach(pessoa -> System.out.println(pessoa.getKey() + " = " + pessoa.getValue()));
		System.out.println();

		System.out.println("Iterando pela chave e com ela pegando os elementos");
		// Iterando pela chave e com ela pegando os elementos
		pessoas.keySet().forEach(idade -> {
			System.out.println(idade + " = " + pessoas.get(idade));
		});

	}
}
