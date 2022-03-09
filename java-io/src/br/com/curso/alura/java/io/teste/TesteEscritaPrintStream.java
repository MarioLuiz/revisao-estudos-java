package br.com.curso.alura.java.io.teste;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteEscritaPrintStream {

	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(new File("contas.csv"));
		
		while(scanner.hasNextLine()) {
			String  linha = scanner.nextLine();
			//System.out.println(linha);
			
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");
			
			String tipoConta = linhaScanner.next();
            int agencia = linhaScanner.nextInt();
            int numero = linhaScanner.nextInt();
            String titular = linhaScanner.next();
            double saldo = linhaScanner.nextDouble();
			
            String valorFormatado = String.format(new Locale("pt","BR"),"%s - %04d - %d - %s - %.2f %n", tipoConta,agencia,numero,titular,saldo);
            System.out.println(valorFormatado);
            
            linhaScanner.close();
			
//			String[] valores = linha.split(",");
//			System.out.println(Arrays.toString(valores));
		}
		
		scanner.close();
	}

}
