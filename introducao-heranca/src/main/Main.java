package main;

import model.Funcionario;
import model.Gerente;

public class Main {

	public static void main(String[] args) {
		Funcionario mario = new Funcionario();

		mario.setNome("Mario Luiz");
		mario.setCpf("696998756-54");
		mario.setSalario(3333.80);

        System.out.println(mario.getNome());
        System.out.printf("%.2f",mario.getBonificacao());
        
        Gerente g1 = new Gerente();
        g1.setNome("\nMarco");
        g1.setCpf("235568413");
        g1.setSalario(5000.0);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());

        g1.setSenha(2222);
        boolean autenticou = g1.autentica(2222);

        System.out.println(autenticou);

	}

}
