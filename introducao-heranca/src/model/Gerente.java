package model;

public class Gerente extends Funcionario {

	private int senha;

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	// Reaproveitamento de metodo da classe mae/super
	public double getBonificacao() {
		System.out.println("Chamando o m�todo bonificacao do GERENTE");
		return super.getSalario();
	}
}
