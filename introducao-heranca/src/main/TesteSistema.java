package main;

import model.Administrador;
import model.Cliente;
import model.Gerente;
import model.SistemaInterno;

public class TesteSistema {
	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(222222);
		
		Administrador ad = new Administrador();
		ad.setSenha(3333);
		
		Cliente cli = new Cliente();
		cli.setSenha(222222);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(ad);
		si.autentica(cli);
	}
}
