package br.com.alura;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

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
		
		System.out.println("O aluno " + a1 + " está matriculado ? ");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		Aluno mariaLuiza =  new Aluno("Maria Luiza", 3737);
		System.out.println("Maria está matriculada ? ");
		System.out.println(javaColecoes.estaMatriculado(mariaLuiza));
		
		System.out.println("O a4 e igual a mariaLuiza? ");
		System.out.println(a4.equals(mariaLuiza));
		
		// obrigatoriamente o seguinte é true
		
		System.out.println(a4.hashCode() == mariaLuiza.hashCode());
		
		System.out.println("Todos os alunos matriculados: ");
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator <Aluno> iterador = alunos.iterator();
		while (iterador.hasNext()) {
			Aluno proximo = iterador.next();
			System.out.println(proximo);
		}
		
		
		
	}

}
