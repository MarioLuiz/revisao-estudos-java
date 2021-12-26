package main;

import model.ControleBonificacao;
import model.EditorVideo;
import model.Funcionario;
import model.Gerente;

public class TesteReferencias {

	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setSalario(5000.0);
		
		Funcionario f = new Funcionario();
        f.setSalario(2000.0);
        
        EditorVideo ev = new EditorVideo();
        ev.setSalario(2500.0);

		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(f);
		controle.registra(ev);

		System.out.println(controle.getSoma());

	}
}
