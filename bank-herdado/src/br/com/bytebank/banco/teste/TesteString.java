package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		String nome = "Mario"; // object literal
		
		String outra = nome.replace("a", "A");
		
		String outraLower = nome.toLowerCase();
		
		System.out.println(nome);
		System.out.println(outra);
		System.out.println(outraLower);
	}

}
