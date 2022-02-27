package br.com.curso.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		// Fluxo de entrada com arquivo
		
		//Encontrando arquivo
		FileInputStream fis = new FileInputStream("lorem.txt");
		
		// convertando de binario para um reader
		InputStreamReader isr = new InputStreamReader(fis);
		
		// utilizando um buffer para carregar a string
		BufferedReader br =  new BufferedReader(isr);
		
		// salvando primeira linha do doc
		String linha = br.readLine();
		
		System.out.println(linha);
		
		br.close();
		

	}

}
