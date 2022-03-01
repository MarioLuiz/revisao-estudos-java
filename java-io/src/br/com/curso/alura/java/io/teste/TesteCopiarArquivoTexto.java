package br.com.curso.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteCopiarArquivoTexto {

	public static void main(String[] args) throws IOException {
		
		// Encontrando arquivo que será copiado
		FileInputStream fis = new FileInputStream("lorem.txt"); //System.in; // new FileInputStream("lorem.txt")
		// convertando bits para Caracteres
		InputStreamReader isr = new InputStreamReader(fis);
		// Juntando varios caracteres dentro de uma linha
		BufferedReader br = new BufferedReader(isr);

		// Criando ou subscrevendo o arquivo
		OutputStream fos = new FileOutputStream("lorem3copia.txt"); // System.out; // new FileOutputStream("lorem2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		// salvando primeira linha do doc
		String linha = br.readLine();
		
		while (linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			bw.flush();
			linha = br.readLine();
		}
		
		// fechando os arquivos
		bw.close();
		br.close();

	}

}
