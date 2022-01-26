package teste;

import model.ContaPoupanca;
import model.SaldoInsufucienteException;

public class TesteContas {

	public static void main(String[] args) throws SaldoInsufucienteException {
		
		// Full Qualified name FQN
		model.ContaCorrente cc = new model.ContaCorrente(3030, 301);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(3020, 302);
		cp.deposita(200.0);
		
		cc.transfere(10, cp);
		
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
		
	}

}
