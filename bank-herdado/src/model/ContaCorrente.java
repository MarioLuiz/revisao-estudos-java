package model;

public class ContaCorrente extends Conta{

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean saca(double valor) {
		double valorSacar = valor + 0.20;
		// TODO Auto-generated method stub
		return super.saca(valorSacar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

}
