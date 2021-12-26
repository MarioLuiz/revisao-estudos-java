package main;

import model.Carro;

public class Main {

	public static void main(String[] args) {
		Carro primeirocarro = new Carro(2013, "Gol", 35000.0);
		Carro segundoCarro = new Carro("Civic", 95000.0);
		Carro terceiroCarro = new Carro("Fusca", 5000.0);
		System.out.println(primeirocarro);
		System.out.println(segundoCarro);
		System.out.println(terceiroCarro);
		
		System.out.println("Existem " + Carro.getQuantidade() + " carros no sistema");
		
	}

}
