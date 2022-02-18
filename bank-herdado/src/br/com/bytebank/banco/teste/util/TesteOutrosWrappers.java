package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {
	public static void main(String[] args) {
		
		
		Integer idadeRef = Integer.valueOf(29); // autoboxing
		int valor = idadeRef.intValue(); // unboxing
		System.out.println(idadeRef.intValue());
		
		Double dRef = Double.valueOf(4.2); // autoboxing
		System.out.println(dRef.doubleValue()); // unboxing
		
		Boolean bRef = Boolean.TRUE;
		System.out.println(bRef.booleanValue());
		
		Number refNumero = Float.valueOf(4.2f);
		List<Number> lista = new ArrayList<>();
		
		lista.add(42);
        lista.add(4.2);
        lista.add(4.2f);
	}
}
