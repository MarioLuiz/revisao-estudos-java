package br.com.bytebank.banco.teste;

public class Teste {
	
	//Array []
	public static void main(String[] args) {
		
		int idades[] = new int[5];
		
		int idade1 = 29;
		
		idades[0] = idade1;
		
		int idade = idades[0];
		
		
		int idade2 = 30;
		int idade3 = 31;
		int idade4 = 32;
		int idade5 = 33;
		
		System.out.println("Idade: " + idade);
		System.out.println(idades.length);
		
		for (int i = 0 ; i < idades.length; i++) {
			idades[i] = i * i;
		}
		for (int i = 0 ; i < idades.length; i++) {
			System.out.println("Idades: " + idades[i]);
		}
		
	}
}
