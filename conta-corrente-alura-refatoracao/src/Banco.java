
public class Banco {
	
	public void depositar(Conta c, double valor) {
		c.depositar(valor);
	}
	
	public void realizarTransferencia(Conta a, double valor, Conta c) {
		a.sacar(valor);
		c.depositar(valor);
	}
}
