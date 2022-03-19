package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {
		String aula1 = "Conhecendo mais listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com Cursos e Sets";
		
		ArrayList<String> aulas = new ArrayList<>();
		
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas);
		
		aulas.remove(0);
		System.out.println(aulas);
		
		for (String aula : aulas) {
		    System.out.println("Aula: " + aula);
		}
		
		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula é " + primeiraAula);
		
		for (int i = 0; i < aulas.size(); i++) {
		    System.out.println("aula : " + aulas.get(i));
		}
		
		// Java 8
		aulas.forEach(aula -> {
		    System.out.println("Percorrendo:");
		    System.out.println("--- " + aula);
		});
		
		aulas.add("Aumentando nosso conhecimento");
		
		// Ordenando
		Collections.sort(aulas);
		
		aulas.forEach(aula -> {
		    System.out.println("Percorrendo:");
		    System.out.println("+++ " + aula);
		});
		
		
		String curso1 = "Java 8: Tire proveito dos novos recursos da linguagem";
        String curso2 = "Apache Camel";
        String curso3 = "Certificacao Java SE 8 Programmer I";
        String curso4 = "Babando pelo Java 8";
        String curso5 = "Quero me tornar e melhor versão de mim mesmo";

        ArrayList<String> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);        
        cursos.add(curso4);        
        cursos.add(curso5);        
        
        cursos.remove(1);
        
        System.out.println(cursos);
        
        System.out.println("O primeiro curso da lista eh o: " + cursos.get(0));
        
        Collections.sort(cursos);
        System.out.println("----------- Lista Ordenada a baixo -------");
        cursos.forEach(curso -> System.out.println(curso));
	}

}
