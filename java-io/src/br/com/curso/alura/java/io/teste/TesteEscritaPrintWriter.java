package br.com.curso.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintWriter {

	public static void main(String[] args) throws IOException {
		// Fluxo de entrada com arquivo
		// Padrao de projeto decorator
		// Criando o arquivo ou sobreencrendo, caso ja exista
//		PrintStream ps =  new PrintStream(new File("lorem4.txt"));
		PrintWriter ps = new PrintWriter("lorem4.txt", "UTF-8");

		ps.print("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");
		ps.println();
		ps.print("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam ");
		ps.println();
		ps.print("asfasdfsafdas dfs sdf asf assdfÃfÄ. ");
		
		ps.close();

	}

}
