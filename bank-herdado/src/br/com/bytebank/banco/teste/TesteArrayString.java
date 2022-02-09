package br.com.bytebank.banco.teste;

public class TesteArrayString {

	public static void main(String[] args) {
		
		System.out.println("Acesando argumentos passados no método main!!");
		
		for (int i = 0; i < args.length; i++) {
			System.out.println( (i+1) + " : Argumento -> " + args[i]);
		}
	}

}
