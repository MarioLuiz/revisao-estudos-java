package model;

public class ContaCorrente extends Conta implements Tributavel{
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	public ContaCorrente(int agencia, int numero, double valorImposto) {
		this(agencia,numero);
	}
	
	@Override
	public void saca(double valor) throws SaldoInsufucienteException {
		double valorSacar = valor + 0.20;
		// TODO Auto-generated method stub
		super.saca(valorSacar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

	@Override
	public double getValorDoImposto() {
		return super.getSaldo() * 0.01;
	}

	@Override
	public void close() {
		System.out.println("Fechando...");
	}

}
