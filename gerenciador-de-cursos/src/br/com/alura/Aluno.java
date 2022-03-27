package br.com.alura;

public class Aluno {
	
	private String nome;
	private int NumeroMatricula;
	
	public Aluno(String nome, int numeroMatricula) {
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
	public String toString() {
		return "Aluno [ nome = " + nome + ", NumeroMatricula = " + NumeroMatricula + " ]";
	}
}
