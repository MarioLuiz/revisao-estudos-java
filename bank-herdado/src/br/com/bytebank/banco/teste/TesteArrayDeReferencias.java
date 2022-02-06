package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.model.ContaCorrente;

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
        ContaCorrente[] contas = new ContaCorrente[5];
        ContaCorrente cc1 = new ContaCorrente(22, 11);
        contas[0] = cc1;

        ContaCorrente cc2 = new ContaCorrente(22, 22);
        contas[1] = cc2;

        //System.out.println(cc2.getNumero());

        System.out.println(contas[1].getNumero());

        ContaCorrente ref = contas[1];
        System.out.println(cc2.getNumero());
        System.out.println(ref.getNumero());
		
		
	}

}
