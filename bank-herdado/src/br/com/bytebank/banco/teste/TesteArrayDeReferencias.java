package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.ContaPoupanca;

public class TesteArrayDeReferencias {

	public static void main(String[] args) {
		ContaCorrente[] contasCorrentes = new ContaCorrente[5];
		
		for (int i = 0; i < contasCorrentes.length; i++) {
			ContaCorrente c1 =  new ContaCorrente(222 + i, i+ 333);
			contasCorrentes[i] = c1;
		}
		
		for (int i = 0; i < contasCorrentes.length; i++) {
			System.out.println("Conta " + (i + 1) + " : " + contasCorrentes[i].toString());
			
		}
		
		//int[] idades = new int[5];
        Object[] referencias = new Object[5];
        ContaCorrente cc1 = new ContaCorrente(22, 11);
        referencias[0] = cc1;

        ContaPoupanca cc2 = new ContaPoupanca(22, 22);
        referencias[1] = cc2;

        //System.out.println(cc2.getNumero());

        System.out.println(( (Conta) referencias[1]).getNumero() );

        ContaPoupanca ref = (ContaPoupanca) referencias[1]; // type Cast
        System.out.println(cc2.getNumero());
        System.out.println(ref.getNumero());
		
		
	}

}
