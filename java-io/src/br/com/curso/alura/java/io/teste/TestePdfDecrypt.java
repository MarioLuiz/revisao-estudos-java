package br.com.curso.alura.java.io.teste;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;

public class TestePdfDecrypt {

	public static void main(String[] args) {
		// caminho do pdf
		File file = new File("C:\\Users\\mario\\Downloads\\faturaMagazine.pdf");

		// instanciando o pdf como null
		PDDocument pdd = null;
		
		// testando uma senha aleatoria de 5 caractres 
		int senha = 99999;
		
		// fazendo um laço para tentar achar a senha na força bruta
		while (senha != 0) {
			try {
				pdd = PDDocument.load(file, String.valueOf(senha));
			} catch (IOException e) {
				System.out.println("Senha errada: " + senha + " Erro:" + e.getMessage() );
			}
			senha = senha - 1;
		}

		// romovendo toda segurança do arquivo PDF
		pdd.setAllSecurityToBeRemoved(true);

		// salvando arquivo pdf
		try {
			pdd.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// fechando o arquivo pdf
		try {
			pdd.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Descriptografia Concluida...");
	}
}
