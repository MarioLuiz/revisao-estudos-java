package br.com.alura;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {
	
	public static void main(String[] args) {
		
		Aula a1 = new Aula("Revisitando as Arrays", 21);
		Aula a2 = new Aula("Lista de Objetos", 15);
		Aula a3 = new Aula("Relacionamento de listas de objetos", 10);
		Aula a4 = new Aula("Alterando Classes", 13);
		
		ArrayList<Aula> aulas = new ArrayList<Aula>();
		aulas.addAll(Arrays.asList(a1, a2, a3, a4));
		
		System.out.println();
		System.out.println("Por ordem de insercao na lista: ");
		System.out.println();
		aulas.forEach(aula -> System.out.println(aula));
		
		Collections.sort(aulas);
		
		System.out.println();
		System.out.println("Ordenando por nome das aulas: ");
		System.out.println();
		
		aulas.forEach(aula -> System.out.println(aula));
		
		aulas.sort(Comparator.comparing(Aula::getTempo));
		//Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		
		System.out.println();
		System.out.println("Ordenando por tempo das aulas: ");
		System.out.println();
		
		aulas.forEach(aula -> System.out.println(aula));
	}
}
