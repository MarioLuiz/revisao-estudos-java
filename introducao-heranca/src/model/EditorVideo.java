package model;

public class EditorVideo extends Funcionario {

	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonificacao do Editor de Video");
		return super.getBonificacao() + 100;
	}
}
