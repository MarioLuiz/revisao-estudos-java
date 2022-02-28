package br.com.curso.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		// Fluxo de entrada com arquivo
		// Padrao de projeto decorator
		// Encontrando arquivo
		FileInputStream fis = new FileInputStream("lorem.txt");

		// convertando bits para Caracteres
		InputStreamReader isr = new InputStreamReader(fis);

		// Juntando varios caracteres dentro de uma linha
		BufferedReader br = new BufferedReader(isr);

		// salvando primeira linha do doc
		String linha = br.readLine();
		
		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}

		br.close();

	}

}
