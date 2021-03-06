package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.model.AcaoBolsa;
import br.com.bytebank.banco.model.CalculadorDeImposto;
import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.SeguroDeVida;

public class TesteTributaveis {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(4242, 212131421);
		cc.deposita(100);
		
		SeguroDeVida seguro = new SeguroDeVida(); 
		AcaoBolsa ac = new AcaoBolsa();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		
		calc.registra(seguro);
		calc.registra(cc);
		calc.registra(ac);
		
		System.out.println("Valor total do imposto: " + calc.getTotalImposto());
		
		
	}

}
