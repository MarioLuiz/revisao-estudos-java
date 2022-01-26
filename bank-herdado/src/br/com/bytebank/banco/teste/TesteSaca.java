package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.SaldoInsufucienteException;

public class TesteSaca {
	public static void main(String[] args) throws SaldoInsufucienteException {
		Conta conta = new ContaCorrente(123, 321);
		conta.deposita(200);
		conta.saca(190);
		
		System.out.println("Saldo: " + conta.getSaldo());
		
		try {
			conta.saca(190);
		} catch (SaldoInsufucienteException e) {
			System.out.println("Ex: " + e.getMessage());
		}
		
		System.out.println("Saldo: " + conta.getSaldo());
	}
}
