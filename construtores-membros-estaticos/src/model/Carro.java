package model;

public class Carro {
	private int ano;
    private String modelo;
    private double preco;
    
    // Esta variavel e um membro estatico da classe, ou seja é um atributo da classe e não do objeto em si, 
    // digamos que seria como se fosse uma variavel global, podemos utilizar quando a necessidade de verificar 
    // um atributo em comum entre todos os membros da entidade, Ex:  quantidade de elementos da classe
    private static int quantidade = 0;
    
    // Regra de negocio adicionada para evitar valores indesejados
    public Carro(int ano, String modelo, double preco){
    	if(ano >= 1891){
            this.ano = ano;
        }else{
            System.out.println("O ano informado está inválido. Por isso usaremos 2017!");
            this.ano = 2017;
        }

        if( modelo != null){
            this.modelo = modelo;
        }else{
            System.out.println("O modelo não foi informado. Por isso usaremos Gol!");
            this.modelo = "Gol";
        }

        if(preco > 0){
            this.preco = preco;
        }else{
            System.out.println("O preço não é válido. Por isso usaremos 40000.0!");
            this.preco = 40000.0;
        }
        // Aqui onde se realiza a soma da variavel estatica, ou seja a cada objeto criado, será realizado a soma de mais 1
        quantidade++;
    }
    
    //Reaproveitamento de construtor
    public Carro(String modelo, double preco){
    	this(2017, modelo, preco);
    }
    
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}

	public static int getQuantidade() {
		return quantidade;
	}

	@Override
	public String toString() {
		return "Carro [ ano = " + ano + ", modelo = " + modelo + ", preco = " + preco + " ]";
	}
	
	
}
