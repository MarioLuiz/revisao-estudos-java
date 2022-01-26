package teste;

import model.Conta;
import model.ContaCorrente;
import model.SaldoInsufucienteException;

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
