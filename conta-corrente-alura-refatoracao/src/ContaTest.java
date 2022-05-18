import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class ContaTest {
	
	@Test
	public void aoSacarUmValorDeUmaContaOSaldoDeveSofrerUmaSubtracaoDesseValor() {
		Conta conta = new Conta(500d);
		conta.sacar(50d);
		
		assertEquals(450d, conta.getSaldo(), 000.0);
	}
}
