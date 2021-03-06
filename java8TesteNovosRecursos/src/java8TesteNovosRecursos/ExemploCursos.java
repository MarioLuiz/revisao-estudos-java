package java8TesteNovosRecursos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExemploCursos {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

		cursos.sort(Comparator.comparing(Curso::getAlunos));
		// cursos.forEach(c -> System.out.println(c.getNome()));

		cursos.stream().filter(c -> c.getAlunos() >= 100).forEach(c -> System.out.println(c.getNome()));

		cursos.stream().filter(c -> c.getAlunos() >= 100).map(c -> c.getAlunos())
				.forEach(total -> System.out.println(total));

		int somaAlunoCursoComMaisCemAlunos = cursos.stream().filter(c -> c.getAlunos() >= 100)
				.mapToInt(Curso::getAlunos).sum();

		System.out.println();
		System.out.println("Total de alunos em Cursos com mais de 100 estudantes: " + somaAlunoCursoComMaisCemAlunos);
		cursos.stream().filter(c -> (c.getAlunos() > 50)).forEach(c -> System.out.println(c.getNome()));

		System.out.println();
		System.out.println("Todos os nomes dos cursos");
		Stream<String> nomes = cursos.stream().map(curso -> curso.getNome());
		nomes.forEach(nome -> System.out.println(nome));

		cursos.stream().filter(c -> c.getAlunos() > 50).map(Curso::getAlunos).forEach(System.out::println);

		System.out.println();
		cursos.stream().filter(c -> (c.getAlunos() > 100)).findAny().ifPresent(c -> System.out.println(c.getNome()));

		List<Curso> cursosFiltrados = cursos.stream().filter(c -> (c.getAlunos() > 100)).collect(Collectors.toList());

		System.out.println();
		Map<String, Integer> cursosFiltradosMap = cursos.stream().filter(c -> (c.getAlunos() > 100))
				.collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()));
		cursosFiltradosMap.forEach((nome, aluno) -> System.out.println(nome + " tem " + aluno + " alunos"));

		System.out.println();
		cursos.stream().filter(c -> (c.getAlunos() > 50)).findFirst()
				.ifPresent(c -> System.out.println("Primeiro curso com mais de 50 alunos ?: " + c.getNome()));
		
		System.out.println();
		//Integer quantidadeCusos = (int) cursos.stream().count();
		Double mediaQuantidaDeAlunosCurso = cursos.stream().mapToInt(c -> c.getAlunos()).average().getAsDouble();
		System.out.println("M?dia de alunos em nos cursos: " + mediaQuantidaDeAlunosCurso);
		
		System.out.println();
		List<Curso> CursosComMaisDe50Alunos = cursos.stream().filter(c -> (c.getAlunos() > 50)).collect(Collectors.toList());
		CursosComMaisDe50Alunos.forEach(c -> System.out.println(c.getNome()));
	}
}
