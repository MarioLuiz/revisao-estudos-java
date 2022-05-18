import java.util.Objects;

public class Conta {
	private double saldo;
	
	public Conta(double saldo) {
		this.saldo = saldo;
	}
	
	public void sacar (double valor) {
		this.saldo = this.saldo - valor;
	}
	
	public void depositar (double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(saldo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		return Double.doubleToLongBits(saldo) == Double.doubleToLongBits(other.saldo);
	}
	
	
}
