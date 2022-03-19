package br.com.alura;

import java.util.Objects;

public class Aula implements Comparable<Aula>{
	
	private String titulo;
	private int tempo;
	
	public Aula(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getTempo() {
		return tempo;
	}

	@Override
	public String toString() {
		return "Aula [ titulo = " + titulo + ", tempo = " + tempo + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(tempo, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aula other = (Aula) obj;
		return tempo == other.tempo && Objects.equals(titulo, other.titulo);
	}

	@Override
	public int compareTo(Aula outraAula) {	
		return this.titulo.compareTo(outraAula.titulo);
	}
}
