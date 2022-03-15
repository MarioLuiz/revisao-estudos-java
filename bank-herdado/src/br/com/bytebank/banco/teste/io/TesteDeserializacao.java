package br.com.bytebank.banco.teste.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import br.com.bytebank.banco.model.Cliente;
import br.com.bytebank.banco.model.ContaCorrente;

public class TesteDeserializacao {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
//		Cliente cliente = new Cliente();
//		cliente.setNome("Mario Luiz");
//		cliente.setProfissao("Dev");
//		cliente.setCpf("12378965489");
//		
//		ContaCorrente cca = new ContaCorrente(1010, 1515);
//		cca.setTitular(cliente);
//		cca.deposita(222.3);

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cc.bin"));
		ContaCorrente cc = (ContaCorrente) ois.readObject();
		
		ois.close();
		
		System.out.println(cc.getSaldo());
		System.out.println(cc.getTitular());
		
	}

}
