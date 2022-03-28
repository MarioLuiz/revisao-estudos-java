package br.com.alura;

import java.util.Objects;

public class Aluno {
	
	private String nome;
	private int NumeroMatricula;
	
	public Aluno(String nome, int numeroMatricula) {
		if (nome == null) {
			throw new NullPointerException("nome não pode ser nulo");
		}
		this.nome = nome;
		NumeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroMatricula() {
		return NumeroMatricula;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome);
	}
	
	@Override
	public String toString() {
		return "Aluno [ nome = " + nome + ", NumeroMatricula = " + NumeroMatricula + " ]";
	}
}
