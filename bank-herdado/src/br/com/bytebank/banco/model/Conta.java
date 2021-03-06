package br.com.bytebank.banco.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * Classe representa a moldura de uma conta
 * 
 * @author mario
 *
 */
public abstract class Conta implements AutoCloseable, Comparable<Conta>, Serializable{

	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular; //basta adicionar transient a frente do tipo de acesso, que a classe nao precisara ser Serializada
	private static int total = 0;
	
	/**
	 * Construtor para inicializar o objeto conta a partir da agencia e numero
	 * 
	 * @param agencia
	 * @param numero
	 */
	public Conta(int agencia, int numero) {
		if(agencia < 1) {
            throw new IllegalArgumentException("Agencia inv?lida");
        }

        if(numero < 1) {
            throw new IllegalArgumentException("Numero da conta inv?lido");
        }
        
		Conta.total++;
		//System.out.println("O total de contas ? " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		//System.out.println("Estou criando uma conta N?: " + this.numero + " Na Agencia: " + this.agencia);
	}

	public abstract void deposita(double valor);
	
	/**
	 * Valor precisa ser maior do que o saldo
	 * 
	 * @param valor
	 * @throws SaldoInsufucienteException
	 */
	public void saca(double valor) throws SaldoInsufucienteException {
		if (this.saldo < valor) {
			// problema
			throw new SaldoInsufucienteException("Saldo: " + this.saldo + " Valor a ser sacado: " + valor);
		}
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino) throws SaldoInsufucienteException {
		this.saca(valor);
		destino.deposita(valor);
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Nao pode valor menor igual a 0");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Nao pode valor menor igual a 0");
			return;
		}
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public static int getTotal() {
		return Conta.total;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(agencia, numero);
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
		return agencia == other.agencia && numero == other.numero;
	}

	@Override
	public String toString() {
		return "Conta [ saldo = " + saldo + ", agencia = " + agencia + ", numero = " + numero + ", titular = " + titular + " ]";
	}
	
	@Override
	public int compareTo(Conta outra) {
		return Double.compare(this.saldo, outra.saldo);
	}

}
