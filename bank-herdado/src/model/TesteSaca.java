package model;

public class TesteSaca {
	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123, 321);
		conta.deposita(200);
		conta.saca(190);
		
		System.out.println("Saldo: " + conta.getSaldo());
		
		conta.saca(190);
		System.out.println("Saldo: " + conta.getSaldo());
	}
}
