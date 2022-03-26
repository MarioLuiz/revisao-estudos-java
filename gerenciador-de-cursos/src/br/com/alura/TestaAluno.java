package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TestaAluno {

	public static void main(String[] args) {
		
		Set<String> alunos = new HashSet<>();
		alunos.add("Mario Luiz");
		alunos.add("Revihery Chaves");
		alunos.add("Alice Alves");
		alunos.add("Beatriz Ferreira");
		alunos.add("Marilia Oliveira");
		alunos.add("Marcelo Oliveira");
		alunos.add("Jose Benedito");
		alunos.add("Kaike Lobo");
		alunos.add("Kamile Vitoria Lobo");
		
		boolean marioEstaMatriculado = alunos.contains("Mario Luiz");
		System.out.println("O aluno Mario está Matriculado ? " + marioEstaMatriculado);
		alunos.remove("Jose Benedito");
		
		alunos.forEach(aluno -> System.out.println(aluno));
		
		//System.out.println(alunos);
	}

}
