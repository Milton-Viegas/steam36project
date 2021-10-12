

public class Eletronico {

	// Atributos

	String nome;
	String categoria;
	String voltagem;
	long numeroModelo;
	double preco;
	double peso;

	// construtores

	
	
	  public Eletronico(String nome, double preco) 
	{
	  this.nome = nome; 
	  this.preco = preco; 
	}
	 

	public Eletronico() 
	{
		
	}

	// Getters & Setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(String voltagem) {
		this.voltagem = voltagem;
	}

	public long getNumeroModelo() {
		return numeroModelo;
	}

	public void setNumeroModelo(long numeroModelo) {
		this.numeroModelo = numeroModelo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	// metodo
	public double PrecoAVista(double precoRecebido) {
		double desconto;
		desconto = precoRecebido * 0.1;
		this.preco = precoRecebido - desconto;
		return preco;
	}

}