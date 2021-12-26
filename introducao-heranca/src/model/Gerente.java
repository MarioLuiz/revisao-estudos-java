package model;

public class Gerente extends Funcionario{
	
	int senha;
	
	public boolean autentica(int senha) {
	    if (this.senha == senha) {
	        return true;
	    } else {
	        return false;
	    }
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
}
