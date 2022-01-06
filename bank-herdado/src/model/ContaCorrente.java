package model;

public class ContaCorrente extends Conta implements Tributavel{
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	public ContaCorrente(int agencia, int numero, double valorImposto) {
		this(agencia,numero);
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

	@Override
	public double getValorDoImposto() {
		return super.getSaldo() * 0.01;
	}

}
