package br.com.curso.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteCopiarArquivoTexto {

	public static void main(String[] args) throws IOException {
		
		
		FileWriter fw = new FileWriter("lorem2.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");

		bw.newLine();
		//bw.write(System.lineSeparator());
		
		bw.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,");
		
		bw.newLine();
		//bw.write(System.lineSeparator());
		
		bw.write("quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo ");
		
		bw.newLine();
		//bw.write(System.lineSeparator());
		
		bw.write("consequat. Duis aute irure dolor in reprehenderit in voluptate velit");
		
		// fechando o arquivo
		bw.close();

	}

}
