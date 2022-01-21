package main;

public class FluxoComTratamento {

	public static void main(String[] args) throws MinhaException {
		System.out.println("Ini do main");
		try {
			metodo1();
		} catch(ArithmeticException | NullPointerException ex) {
	        String msg = ex.getMessage();
	        System.out.println("Erro " + msg);
	        ex.printStackTrace();
	    }
		System.out.println("Fim do main");
	}

	private static void metodo1() throws MinhaException {
		System.out.println("Ini do metodo1");
		metodo2();
		Conta c = null;
		c.deposita();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() {
		System.out.println("Ini do metodo2");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			int a = i / 0;
		}
		
	}
}
