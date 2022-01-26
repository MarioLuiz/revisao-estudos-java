package br.com.bytebank.banco.model;

public class AcaoBolsa implements Tributavel {

	@Override
	public double getValorDoImposto() {
		return 42;
	}

}
