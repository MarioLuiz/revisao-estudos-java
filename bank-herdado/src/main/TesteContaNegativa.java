package main;

import model.Conta;
import model.ContaCorrente;

public class TesteContaNegativa {
	public static void main(String[] args) throws Exception {
		try (Conta contaCorrente = new ContaCorrente(2877,-300)) {
			contaCorrente.deposita(100);
			System.out.println("Saldo na Conta: " + contaCorrente.getSaldo());
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
	}
}
