package br.com.alura;

import java.util.Arrays;

public class TestaCursoComAluno {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do Javão", "Mario Luiz");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Trabalhando com Lists", 15));
		javaColecoes.adiciona(new Aula("Trabalhando com Java", 10));
		
		Aluno a1 = new Aluno("Fabio Carlos", 2020);
		Aluno a2 = new Aluno("Luiz Carlos", 1313);
		Aluno a3 = new Aluno("Aguinaldo Carlos", 1717);
		Aluno a4 = new Aluno("Maria Luiza", 3737);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(Arrays.asList(a2, a3, a4));
		
		System.out.println("Todos os alunos matriculados: ");
		javaColecoes.getAlunos().forEach(aluno -> System.out.println(aluno));
	}

}
