package model;

public class Administrador extends Funcionario implements Autenticavel{

	private int senha;

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	@Override
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	
	@Override
	public double getBonificacao() {
		System.out.println("Chamando o m�todo bonificacao do GERENTE");
		return 50;
	}
}
