package main;

import model.ContaCorrente;
import model.ContaPoupanca;

public class TesteContas {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(3030, 301);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(3020, 302);
		cp.deposita(150.0);
		
		cc.transfere(50, cp);
		
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
		
	}

}
