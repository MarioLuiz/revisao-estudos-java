package model;

public class SaldoInsufucienteException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public SaldoInsufucienteException(String msg) {
		super(msg);
	}
	
}
