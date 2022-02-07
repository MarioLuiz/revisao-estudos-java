package br.com.bytebank.banco.teste;

public class TesteArrayDePrimitivos {
	
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
		
		int[] numeros = new int[6];
		numeros[0] = 1;
		numeros[1] = 2;
		numeros[2] = 3;
		numeros[3] = 4;
		numeros[4] = 5;
		
		int[] refs = {1,2,3,4,5};
		
		for (int i = 0; i < refs.length; i++) {
			System.out.println("Refs: " + refs[i]);
		}
		
	}
}
