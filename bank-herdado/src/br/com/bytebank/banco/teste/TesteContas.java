package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.model.ContaPoupanca;
import br.com.bytebank.banco.model.SaldoInsufucienteException;

public class TesteContas {

	public static void main(String[] args) throws SaldoInsufucienteException {
		
		// Full Qualified name FQN
		br.com.bytebank.banco.model.ContaCorrente cc = new br.com.bytebank.banco.model.ContaCorrente(3030, 301);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(3020, 302);
		cp.deposita(200.0);
		
		cc.transfere(10, cp);
		
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
		
	}

}
