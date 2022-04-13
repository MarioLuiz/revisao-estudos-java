package br.com.alura;

import java.util.Collection;
import java.util.HashSet;

public class qualInterfaceUsar {

	public static void main(String[] args) {
		// Depende muito do problema, na duvida declare uma collection que podemos usar o
		// Polimorfismo e alterar mais pra frente
		Collection<Aluno> alunos =  new HashSet<Aluno>();
		alunos.size();

	}

}
