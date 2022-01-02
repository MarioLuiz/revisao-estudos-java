package model;

// Classes abstratas não podem ser instanciadas
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private Double salario;
	
	public Funcionario() {
		
	}
	
	// método sem corpo
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
}
