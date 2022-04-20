package java8TesteNovosRecursos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<String>();
		nomes.addAll(
				Arrays.asList("Mario", "Luiz", "Arruda", "Revihery", "Claudio", "Iork", "Mia", "Carolina Beatriz"));

		//Comparator<String> comparadorTamanho = new ComparadorPorTamanho();
		// Collections.sort(nomes, comparadorTamanho);
		//nomes.sort(comparadorTamanho);
		// System.out.println(nomes);
		
		// Sort com Lambda
		nomes.sort((s1, s2) -> {
			return s1.length() - s2.length();
		});
		
		// Sort com Lambda utiliznado Integer.compare
		nomes.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		nomes.forEach(nome -> System.out.println(nome));
		System.out.println();

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
