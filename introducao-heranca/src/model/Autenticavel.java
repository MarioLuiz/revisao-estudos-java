package model;

//contrato Autenticav�l
	// Quem assina esse contrato, precisa implementar
		// metodos

public abstract interface Autenticavel {

	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);
	
}
