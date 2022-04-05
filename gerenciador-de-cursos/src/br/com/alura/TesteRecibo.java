package br.com.alura;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TesteRecibo {

	public static void main(String[] args) {

		Recibo rec1 = new Recibo();
		// atribui valores
		Recibo rec2 = new Recibo();
		// atribui valores
		Recibo rec3 = new Recibo();
		// atribui valores
		
		Set<Recibo> recibos= new TreeSet<Recibo>();
		
		recibos.add(rec1);
		
		Set<String> letras = new HashSet<String>();
		letras.add("A");
		letras.add("B");
		letras.add("C");

//		letras.forEach(letra -> {
//		    System.out.println(letra);
//		});
		
		Iterator iteratorString = letras.iterator();
		
		while(iteratorString.hasNext()) {
			System.out.println(iteratorString.next());
		}

	}

}
