package br.com.alura;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções do Javão", "Mario Luiz");
		List<Aula> aulas = javaColecoes.getAulas();
		System.out.println(aulas);
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Trabalhando com Lists", 15));
		javaColecoes.adiciona(new Aula("Trabalhando com Java", 10));
		
		System.out.println(javaColecoes.getAulas());
	}

}
