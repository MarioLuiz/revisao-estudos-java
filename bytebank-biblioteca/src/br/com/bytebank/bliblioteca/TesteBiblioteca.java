package br.com.bytebank.bliblioteca;

import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;

public class TesteBiblioteca {
	public static void main(String[] args) {
		try (Conta c = new ContaCorrente(123, 7777)) {
			c.deposita(100);
			
			System.out.println("Saldo: "+ c.getSaldo());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
