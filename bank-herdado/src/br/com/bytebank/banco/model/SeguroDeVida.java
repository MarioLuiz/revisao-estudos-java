package br.com.bytebank.banco.model;

public class SeguroDeVida implements Tributavel {

	@Override
	public double getValorDoImposto() {
		return 42;
	}

}
