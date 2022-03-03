package br.com.curso.alura.java.io.teste;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintStream {

	public static void main(String[] args) throws IOException {
		// Fluxo de entrada com arquivo
		// Padrao de projeto decorator
		// Criando o arquivo ou sobreencrendo, caso ja exista
		PrintWriter ps =  new PrintWriter(new File("lorem4.txt"));

		ps.print("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");
		ps.println();
		ps.print("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam ");
		
		ps.close();

	}

}
