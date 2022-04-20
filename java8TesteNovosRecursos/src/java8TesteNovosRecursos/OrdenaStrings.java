package java8TesteNovosRecursos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenaStrings {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<String>();
		nomes.addAll(
				Arrays.asList("Mario", "Luiz", "Arruda", "Revihery", "Claudio", "Iork", "Mia", "Carolina Beatriz"));

		// Comparator<String> comparadorTamanho = new ComparadorPorTamanho();
		// Collections.sort(nomes, comparadorTamanho);
		// nomes.sort(comparadorTamanho);
		// System.out.println(nomes);

		// Sort com Lambda
		nomes.sort((s1, s2) -> {
			return s1.length() - s2.length();
		});

		// Sort com Lambda utiliznado Integer.compare
		nomes.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		nomes.sort(Comparator.comparing(String::length));

		// Sort com Lambda utilizando Comparator
		nomes.sort(Comparator.comparing(s -> s.length()));
		System.out.println("Ordenando por tamanho das palavras");
		nomes.forEach(nome -> System.out.println(nome));
		System.out.println();

		// Utilizando method reference e ordenando por case
		nomes.sort(String.CASE_INSENSITIVE_ORDER);
		System.out.println("Ordenando por Case Sensitive");
		nomes.forEach(System.out::println);
		System.out.println();

		// quebrando a Lambda com comparator acima em 3 partes
		Function<String, Integer> funcao = s -> s.compareToIgnoreCase(s);
		Comparator<String> comparador = Comparator.comparing(funcao);
		nomes.sort(comparador);
		// Utilizando method reference
		Function<String, Integer> funcao1 = String::length;
		
		System.out.println("Ordenando por Ordem alfabetica");
		// Utilizando consumer Classe anonima
		Consumer<String> consumidor = new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.println(s);
			}
		};
		nomes.forEach(consumidor);
	}
}

//class ImprimeNaLinha implements Consumer<String> {
//	@Override
//	public void accept(String s) {
//		System.out.println(s);
//	}
//}

//class ComparadorPorTamanho implements Comparator<String> {
//
//	@Override
//	public int compare(String s1, String s2) {
//		return s1.length() - s2.length();
//	}
//
//}
